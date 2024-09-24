/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase2holamundo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

/**
 *
 * @author Netec
 */
@SpringBootApplication
public class Clase2holamundo implements CommandLineRunner{

    
    public static void main(String[] args) {
        System.out.println("Hello CLase2!");
        SpringApplication.run(Clase2holamundo.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); 
        System.out.println("hola esta es mi app");
    }
}
