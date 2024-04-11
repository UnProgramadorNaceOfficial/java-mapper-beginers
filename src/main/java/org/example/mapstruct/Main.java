package org.example.mapstruct;

import org.example.mapstruct.dto.PersonCustomDTO;
import org.example.mapstruct.entities.Person;
import org.example.mapstruct.mapper.PersonMapper;

public class Main {

    /* MapStruct - Default */
    /* public static void main(String[] args) {
        Person personEntity = new Person(1L, "Santiago", "Perez", "santy@mail.com", (byte) 25, 'M');
        System.out.println(personEntity);

        PersonDefaultDTO personDefaultDTO = PersonMapper.INSTANCE.personToPersonDefaultDTO(personEntity);
        System.out.println(personDefaultDTO);
    } */

    /* MapStruct - Custom */
    public static void main(String[] args) {
        Person personEntity = new Person(1L, "Santiago", "Perez", "santy@mail.com", (byte) 25, 'M');
        System.out.println(personEntity);

        PersonCustomDTO personCustomDTO = PersonMapper.INSTANCE.personToPersonCustomDTO(personEntity);
        System.out.println(personCustomDTO);
    }
}
