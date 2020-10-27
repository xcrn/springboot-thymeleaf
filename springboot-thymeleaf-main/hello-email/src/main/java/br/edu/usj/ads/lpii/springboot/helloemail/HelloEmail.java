package br.edu.usj.ads.lpii.springboot.helloemail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloEmail {
   
    @PostMapping(value="hello-email")
    public ModelAndView postHelloName(@RequestParam String name, String email) {
        ModelAndView modelAndView = new ModelAndView("hello-email");

        String hello = "Seja bem vindo(a), "+name+"! \n Seu e-mail é :" +email ;
        modelAndView.addObject("mensagem", hello);
        return modelAndView;
    }
    


}
