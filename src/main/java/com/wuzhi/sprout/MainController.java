package com.wuzhi.sprout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    ScoreRepository scoreRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getIndex(Model model) {
        model.addAttribute("msg", "Hello World!");
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String getLogin() {
        return "login";
    }

    @RequestMapping("/scores")
    @ResponseBody
    public List<Score> getScores() {
        return scoreRepository.findAll();
    }
}
