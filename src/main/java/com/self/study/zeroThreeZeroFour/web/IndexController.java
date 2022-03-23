package com.self.study.zeroThreeZeroFour.web;

import com.self.study.zeroThreeZeroFour.config.auth.LoginUser;
import com.self.study.zeroThreeZeroFour.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user){


        if(user != null) {
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }




}
