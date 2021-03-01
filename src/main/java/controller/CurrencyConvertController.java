package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyConvertController {
    @GetMapping("/convert")
    public String showForm(){
        return "convert";
    }

    @PostMapping("/convert")
    public ModelAndView result(@RequestParam Integer usd){
        ModelAndView modelAndView = new ModelAndView("result");
        int result = usd * 23000;
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
