package com.example.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.Thymeleaf;


@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String index(ModelMap model){
        model.addAttribute("nomeDoAtributo");
        return "index";
    }

    @GetMapping("/rotas/{nome}")
    public String rota1(@PathVariable String nome, ModelMap model){
        model.addAttribute("nome", nome);

        return "rota1";
    }

    @GetMapping("/rotas/{nome}/{cor}")
    public String rota2(@PathVariable String cor, ModelMap model){
        model.addAttribute("cor", cor);

        return "rota2";
    }

}
