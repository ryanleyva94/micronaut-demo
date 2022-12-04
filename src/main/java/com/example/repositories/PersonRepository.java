package com.example.repositories;

import com.example.model.Person;
import io.micronaut.transaction.annotation.ReadOnly;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import javax.persistence.EntityManager;
import java.util.Optional;

@Singleton
public class PersonRepository implements PersonRepositoryInterface {

    @Inject
    EntityManager entityManager;

    @Override
    @ReadOnly
    public Optional<Person> findById(long id) {
        return Optional.ofNullable(entityManager.find(Person.class, id));
    }

}
