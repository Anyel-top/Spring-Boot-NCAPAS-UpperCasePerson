package top.anyel.address.model;

public record Person (String identification,
                      String firstName,
                      String lastName,
                      String emails) {

    public static Person toUpperCase(Person person) {
        return PersonUtils.toUpperCase(person);
    }

}
