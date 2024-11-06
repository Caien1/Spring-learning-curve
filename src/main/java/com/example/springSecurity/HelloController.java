package com.example.springSecurity;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController

public class HelloController {
    @GetMapping("/")
    public String greet() {
        return "Hello whats up";
    }

    @RestController
    public class BlueButton {

        @GetMapping("/b")

        public String greet(HttpServletRequest req, HttpServletResponse res) {
            System.out.println(req.getSession().getId());

            return "<h1> what up <h1>";
        }


    @RestController
    public class TokenGetter{
        @GetMapping("/token")
        public CsrfToken getToken(HttpServletRequest req){
            return (CsrfToken) req.getAttribute("_csrf");

        }




    }
    }
}
