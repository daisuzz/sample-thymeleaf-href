package com.daisuzz.samplethymeleafhref;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @GetMapping
    public ModelAndView index(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String age,
            ModelAndView mav) {

        mav.addObject("name", name);
        mav.addObject("age", age);
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/me")
    public ModelAndView me(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String age,
            ModelAndView mav
    ) {
        mav.addObject("name", name);
        mav.addObject("age", age);
        mav.setViewName("me");
        return mav;
    }
}
