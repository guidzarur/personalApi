package one.digital.innovation.personalapi.service;

import one.digital.innovation.personalapi.dto.response.MessageResponseDTO;
import one.digital.innovation.personalapi.entity.Person;
import one.digital.innovation.personalapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalService {

    private PersonRepository personRepository;

    @Autowired
    public PersonalService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .Message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
