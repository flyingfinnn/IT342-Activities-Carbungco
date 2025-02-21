package com.carbungco.oauth2login.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@RestController
public class UserController {
    @GetMapping
    public String index() {
        return "<h1> HIIIIIIIIIIIIIIIII </h1>";
    }

    @GetMapping("/user-info")
    public Map<String, Object> getUser(@AuthenticationPrincipal OAuth2User oAuth2User) {
        if (oAuth2User != null)
            return oAuth2User.getAttributes();
        else {
            return Collections.emptyMap();
        }
    }
}
