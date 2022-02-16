
package com.digitalinnovationone.repro.personaapi.dto.mapper;

import com.digitalinnovationone.repro.personaapi.dto.request.PersonDTO;
import com.digitalinnovationone.repro.personaapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}