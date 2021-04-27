package ro.fasttrackit.homeworks.curs9.ex2;

import java.time.LocalDateTime;
import java.time.Period;

public class Person {

    public String firstname;
    public String lastname;
    public static LocalDateTime birthday;
    public String address;

    public Person(String firstname, String lastname, LocalDateTime birthday, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.address = address;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String fullName (String name) {
        System.out.println("Fullname : " + firstname + " " + lastname);
        return firstname + lastname;
    }
    public void age (){
        LocalDateTime birth = LocalDateTime.of(1984,07,29,10,34);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Age : " + Period.between(birth.toLocalDate(),now.toLocalDate()));

    }
}
