package com.wuzhi.sprout.controller.management;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/management")
public class ManagementController {
    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(Model model) {
        return "management/index";
    }
}
