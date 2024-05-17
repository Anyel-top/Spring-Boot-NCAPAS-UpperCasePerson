package top.anyel.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.address.model.Person;
import top.anyel.address.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("person/v1")
public class PersonController  {
    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public Person save(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/getPersons")
    public List<Person> get() {
        return personService.findAll();
    }

}
