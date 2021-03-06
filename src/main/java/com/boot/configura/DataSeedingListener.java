package com.boot.configura;

import java.util.HashSet;

import com.boot.entity.NguoiDung;
import com.boot.repository.NguoiDungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.boot.entity.Role;
import com.boot.entity.User;
import com.boot.repository.RoleRepository;
import com.boot.repository.UserRepository;

@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // TODO Auto-generated method stub

        // Roles
        if (roleRepository.findByName("ROLE_ADMIN") == null) {
            roleRepository.save(new Role("ROLE_ADMIN"));
        }

        if (roleRepository.findByName("ROLE_MEMBER") == null) {
            roleRepository.save(new Role("ROLE_MEMBER"));
        }

        // Admin account
        if (userRepository.findByEmail("admin@gmail.com") == null) {
            User admin = new User();
            admin.setEmail("admin@gmail.com");
            admin.setPassword(passwordEncoder.encode("123456"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_ADMIN"));
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            admin.setRoles(roles);

            NguoiDung nguoiDung = new NguoiDung();
            nguoiDung.setHoTenDem("Truong Duc");
            nguoiDung.setTen("Hoan");
            nguoiDung.setSoDienThoai("0349380770");
            nguoiDung.setUser(admin);
            userRepository.save(admin);
            nguoiDungRepository.save(nguoiDung);
        }

        // Member account
        if (userRepository.findByEmail("member@gmail.com") == null) {
            User user = new User();
            user.setEmail("member@gmail.com");
            user.setPassword(passwordEncoder.encode("123456"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            user.setRoles(roles);
            NguoiDung nguoiDung = new NguoiDung();
            nguoiDung.setHoTenDem("Truong Duc");
            nguoiDung.setTen("Hoan");
            nguoiDung.setSoDienThoai("0349380770");
            nguoiDung.setUser(user);
            userRepository.save(user);
            nguoiDungRepository.save(nguoiDung);
        }
    }


}

