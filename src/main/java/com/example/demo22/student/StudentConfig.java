package com.example.demo22.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student marcos = new Student("Marcos", "marcos@gmail.com", LocalDate.of(1990, JANUARY, 21));

            Student alex = new Student("Alex", "alex@gmail.com", LocalDate.of(1991, FEBRUARY, 20));



            repository.saveAll(List.of(marcos, alex));

        };



    }

}
