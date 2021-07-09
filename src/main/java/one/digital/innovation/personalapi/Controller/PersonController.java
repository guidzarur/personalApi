package one.digital.innovation.personalapi.Controller;

import lombok.AllArgsConstructor;
import one.digital.innovation.personalapi.dto.request.PersonDTO;
import one.digital.innovation.personalapi.dto.response.MessageResponseDTO;
import one.digital.innovation.personalapi.exception.PersonNotFoundException;
import one.digital.innovation.personalapi.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private PersonalService personalService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
        return personalService.createPerson(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll() { return personalService.listAll(); }

    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return personalService.findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException {
        return personalService.updateById(id, personDTO);
    }
        @DeleteMapping("/{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void deleteById (@PathVariable Long id) throws PersonNotFoundException {
            personalService.delete(id);
        }
    }