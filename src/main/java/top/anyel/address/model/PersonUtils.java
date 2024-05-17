package top.anyel.address.model;

public class PersonUtils {

    public static Person toUpperCase(Person person) {
        String upperIdentification = person.identification().toUpperCase();
        String upperFirstName = person.firstName().toUpperCase();
        String upperLastName = person.lastName().toUpperCase();
        String upperEmails = person.emails().toUpperCase();
        return new Person(upperIdentification, upperFirstName, upperLastName, upperEmails);
    }
}