package Entities;
import Abstract.Entity;

import java.time.LocalDate;

public class Customer implements Entity {

    private String firstName;
    private	String lastName;
    private LocalDate dateOfBirth;
    private String NationalityId;

    public Customer() {

    }

    public Customer(String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
        super();

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.NationalityId = nationalityId;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}