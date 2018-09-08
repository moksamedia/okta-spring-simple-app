package com.okta.springmfa.SpringMFA;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;

@Controller
class SimpleAppController {

    @RequestMapping("/")
    String home() {
        return "home";
    }

    @RequestMapping("/restricted")
    String restricted() {
        return "restricted";
    }

}