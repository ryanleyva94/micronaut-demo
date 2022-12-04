package com.example.repositories;

import com.example.model.Person;

import java.util.Optional;

public interface PersonRepositoryInterface
{
    Optional<Person> findById(long id);
}
