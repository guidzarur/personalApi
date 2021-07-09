package one.digital.innovation.personalapi.utils;

import one.digital.innovation.personalapi.dto.request.PersonDTO;
import one.digital.innovation.personalapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Guilherme";
    private static final String LAST_NAME = "Zarur";
    private static final String CPF_NUMBER = "035.666.789-45";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1997, 9, 13);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("13-09-1997")
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
