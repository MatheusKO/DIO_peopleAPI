package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Matheus";
    private static final String LAST_NAME = "Ohara";
    private static final String CPF_NUMBER = "821.875.266-82";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2009, 04, 01);

   public static PersonDTO createFakeDTO() {
       return PersonDTO.builder()
               .firstName(FIRST_NAME)
               .lastName(LAST_NAME)
               .cpf(CPF_NUMBER)
               .birthDate(BIRTH_DATE)
               .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
               .build();
    }

    public static Person createFakeEntity() {
       return Person.builder()
               .id(PERSON_ID)
               .firstName(FIRST_NAME)
               .lastName(LAST_NAME)
               .cpf(CPF_NUMBER)
               .birthDate(BIRTH_DATE)
               .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
               .build();

    }
}
