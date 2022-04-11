package com.example.demo.Controllers;


import com.example.demo.Teste;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerTest {

    @GetMapping("/{variavel}")
    public String test(@PathVariable String variavel){




        return "Dale" + variavel;
    }

    @PostMapping("/teste")
    public void handle(@RequestBody Teste teste){

        System.out.println("Nome" + teste.getNome());

    }



}
