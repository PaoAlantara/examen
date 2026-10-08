package com.examen.impuestos;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ImpuestosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImpuestosApplication.class, args);
    }

    // Este bloque se ejecutará automáticamente justo cuando Tomcat termine de iniciar
    @Bean
    public CommandLineRunner imprimirLink() {
        return args -> {
            System.out.println("\n=======================================================");
            System.out.println("🚀 ¡SERVIDOR INICIADO CORRECTAMENTE!");
            System.out.println("👉 Haz Ctrl + Clic en el siguiente enlace para abrir la app:");
            System.out.println("🌐 http://localhost:8080/contribuyentes");
            System.out.println("=======================================================\n");
        };
    }
}