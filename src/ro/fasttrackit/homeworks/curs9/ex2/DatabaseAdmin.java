package ro.fasttrackit.homeworks.curs9.ex2;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee{
    public String dbTechnology;

    public DatabaseAdmin(String firstname, String lastname, LocalDateTime birthday, String address) {
        super(firstname, lastname, birthday, address);
    }

    @Override
    public void getSalary() {

    }
}
