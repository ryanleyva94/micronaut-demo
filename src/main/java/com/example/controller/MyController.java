package com.example.controller;

import com.example.repositories.PersonRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller
public class MyController
{
    @Inject
    private PersonRepository personRepository;

    @Get("/nameById/{id}")
    public String getHello(long id)
    {
        return personRepository.findById(id).get().getName();
    }
}
