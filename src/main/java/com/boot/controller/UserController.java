package com.boot.controller;

import com.boot.entity.NguoiDung;
import com.boot.entity.Role;
import com.boot.entity.User;
import com.boot.formClass.FormRegister;
import com.boot.repository.NguoiDungRepository;
import com.boot.repository.RoleRepository;
import com.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String getUser() {
        return "infor";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/register")
    public String getRegister() {
        return "register";
    }

    @PostMapping(
            value = "/register", consumes = "application/x-www-form-urlencoded")
    public RedirectView postRegister(FormRegister formRegister, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("Co loi xay ra " + bindingResult);

            return new RedirectView("/user/login");
        } else {
            if (userRepository.findByEmail(formRegister.getEmail()) == null) {
                Role role = roleRepository.findByName("ROLE_MEMBER");

                User user = new User();
                Set<Role> roles = new HashSet<>();
                roles.add(role);
                user.setRoles(roles);
                user.setEmail(formRegister.getEmail());
                user.setPassword(passwordEncoder.encode(formRegister.getMatKhau()));
                userRepository.save(user);

                NguoiDung nguoiDung = new NguoiDung();
                nguoiDung.setUser(user);
                nguoiDung.setHoTenDem(formRegister.getHoTenDem());
                nguoiDung.setTen(formRegister.getTen());
                nguoiDung.setSoDienThoai(formRegister.getSoDienThoai());
                nguoiDungRepository.save(nguoiDung);

                return new RedirectView("/user/login?success");
            }

            return new RedirectView("/user/register?failure");
        }
    }

}
