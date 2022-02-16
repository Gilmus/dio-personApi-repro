
package com.digitalinnovationone.repro.personaapi.repositories;


import com.digitalinnovationone.repro.personaapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}