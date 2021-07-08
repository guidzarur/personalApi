package one.digital.innovation.personalapi.Controller;

import one.digital.innovation.personalapi.dto.response.MessageResponseDTO;
import one.digital.innovation.personalapi.entity.Person;
import one.digital.innovation.personalapi.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonalService personalService;

    @Autowired
    public PersonController(PersonalService personalService) {
        this.personalService = personalService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personalService.createPerson(person);
    }

    }