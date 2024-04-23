package br.com.hastydev.rmreturn.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.hastydev.rmreturn.model.Person;

@Repository
public interface Repositories extends CrudRepository<Person, Integer>{
    
}