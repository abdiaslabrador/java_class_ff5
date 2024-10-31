package dev.abdias.person_ff5;
import java.util.Date;

public class Person {
    private String name;
    private String lastName;
    private String ci;
    private Date birthDate;
    private String country;
    private char gender;

    public Person(String name, String lastName, String ci, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.ci = ci;
        this.birthDate = birthDate;
    }

    public Person(String name, String lastName, String ci, Date birthDate, String country, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.ci = ci;
        this.birthDate = birthDate;
        this.country = country;
        this.gender = gender;
    }

    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("CI: " + this.ci);
        System.out.println("Birthdate: " + this.birthDate);
        if(this.country != null){System.out.println("Country: " + this.country);}
        if(this.gender != 0){System.out.println("Gender: " + this.gender);}
        System.out.println();
    }
}
