package br.edu.usj.ads.lpii.springboot.helloname;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloName {
   
    @PostMapping(value="helloName")
    public ModelAndView postHelloName(@RequestParam String name) {
        ModelAndView modelAndView = new ModelAndView("hello-name");

        String hello = "Seja bem vindo(a), "+name+"!";
        modelAndView.addObject("mensagem", hello);
        return modelAndView;
    }
    


}
