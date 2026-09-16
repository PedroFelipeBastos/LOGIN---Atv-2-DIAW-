package com.example.LoginPUC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecureLoginController {

    @GetMapping({"/", "/login"})
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {
        model.addAttribute("username", username);
        return "home";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String handleRegister(
            @RequestParam("nome") String nome,
            @RequestParam("email") String email,
            @RequestParam("cpf") String cpf,
            @RequestParam("rg") String rg,
            @RequestParam("endereco") String endereco,
            @RequestParam("instituicao") String instituicao,
            @RequestParam("senha") String senha) {
        System.out.println("Novo registro: " + nome + " - " + email + " - " + instituicao);
        return "redirect:/login";
    }

    @GetMapping("/recoverpassword")
    public String recoverPassword() {
        return "recoverpassword";
    }

    @PostMapping("/recoverpassword")
    public String handleRecoverPassword(@RequestParam("email") String email) {
        System.out.println("Recuperação de senha solicitada para: " + email);
        return "redirect:/recoverpassword?enviado";
    }
}
