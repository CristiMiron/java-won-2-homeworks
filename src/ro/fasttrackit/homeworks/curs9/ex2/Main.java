package ro.fasttrackit.homeworks.curs9.ex2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Cristi", "Miron",
                LocalDateTime.of(1984,07,29,10,34),"Floresti");
        person.fullName(person.firstname + person.lastname);
        person.age();
        System.out.println(person);

    }

}
