package br.com.hastydev.rmreturn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

import br.com.hastydev.rmreturn.model.Person;

@RestController
public class Controller {

    private static final Map<String, String> rmToNomeMap = new HashMap<>();
    static {
        rmToNomeMap.put("12345", "João");
        rmToNomeMap.put("54321", "Maria");
    }

    @GetMapping("")
    public String mensagem() {
        return "Seja Bem-Vindo à HastyDEV API!";
    }

    @GetMapping("/boasvindas")
    public String boasVindas(@RequestParam("rm") String rm) {
        if (rmToNomeMap.containsKey(rm)) {
            String nome = rmToNomeMap.get(rm);
            return "Bem-vindo, " + nome + "!";
        } else {
            return "RM não encontrado!";
        }
    }

    @PostMapping("/person")
    public String person(@RequestBody Person p) {
        return "Seu Nome é: " + p.getNome() + ". E sua idade é: " + p.getIdade();
    }
}
