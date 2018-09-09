package com.okta.springmfa.SpringMFA;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class SimpleAppController {
    
    @RequestMapping("/")
    String home() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "home";
    }

    @RequestMapping("/restricted")
    @PreAuthorize("hasAuthority('Admin')")
    String restricted() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        return "restricted";
    }

}