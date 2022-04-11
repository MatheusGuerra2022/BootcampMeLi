package com.example.demo.Controllers;


import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class Controller {
//
//    @GetMapping("/{numero}")
//    public String aplicacao(@PathVariable String numero){
//
//        String romano = convertIntToRoma(Integer.parseInt(numero));
//
//        return "Valor em decimal: " + numero + "\t\t Valor em romano: "+ romano ;
//    }
//
//
//
//    public String convertIntToRoma( int numero){
//        String romano ="";
//        int aux = 0;
//
//        if(numero > 999){
//            aux = numero/1000;
//            numero = numero%1000;
//            for(int i = 0; i < aux; i++){
//                romano = romano + "M";
//            }
//        }
//        else if(numero > 899){
//            aux = numero/900;
//            numero = numero%900;
//            for(int i = 0; i < aux; i++){
//                romano = romano + "CM";
//            }
//        }
//        else if(numero > 499){
//            aux = (numero-500)%100;
//            numero = numero%500;
//            for(int i = 0; i < aux; i++){
//                romano = romano + "C";
//            }
//
//        }
//        else if(numero > 399){
//            aux = numero/400;
//            numero = numero%400;
//            for(int i = 0; i < aux; i++){
//                romano = romano + "CD";
//            }
//        }
//
//        else if(numero > 100){
//            aux = numero/400;
//            numero = numero%100;
//            for(int i = 0; i < aux; i++){
//                romano = romano + "C";
//            }
//        }
//
//
//        return romano;
//    }
//
//
//
//}
