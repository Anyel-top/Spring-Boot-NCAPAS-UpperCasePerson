package top.anyel.address.repository;

import org.springframework.stereotype.Repository;
import top.anyel.address.model.Person;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PersonRepository {



    List<Person> persons = new ArrayList<Person>(); // create and initial
    public Person save (Person person) {
       persons.add(person);
       return person;
    }

    public List<Person> findAll() {
        return persons;
    }
}
