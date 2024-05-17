package top.anyel.address.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.address.model.Person;
import top.anyel.address.model.PersonUtils;
import top.anyel.address.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person) {
        Person personInUpperCase = PersonUtils.toUpperCase(person);
        return personRepository.save(personInUpperCase);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

}
