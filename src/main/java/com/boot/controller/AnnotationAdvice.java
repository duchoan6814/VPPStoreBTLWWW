package com.boot.controller;

import com.boot.entity.NguoiDung;
import com.boot.entity.User;
import com.boot.repository.NguoiDungRepository;
import com.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class AnnotationAdvice {

    @ModelAttribute("user")
    public String getNguoiDungLogin() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }


}
