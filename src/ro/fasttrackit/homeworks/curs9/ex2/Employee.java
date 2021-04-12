package ro.fasttrackit.homeworks.curs9.ex2;

import java.time.LocalDateTime;

public abstract class Employee extends Person{

    public LocalDateTime dateOfEmployment;
    public String position;

    public Employee(String firstname, String lastname, LocalDateTime birthday, String address) {
        super(firstname, lastname, birthday, address);
    }

    public abstract void getSalary();

}
