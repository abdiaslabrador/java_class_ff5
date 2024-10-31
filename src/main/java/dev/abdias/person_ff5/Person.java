package dev.abdias.person_ff5;
import java.util.Date;

public class Person {
    private String name;
    private String lastName;
    private String ci;
    private Date birthDate;

    public Person(String name, String lastName, String ci, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.ci = ci;
        this.birthDate = birthDate;
    }


    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Lastname: " + this.lastName);
        System.out.println("CI: " + this.ci);
        System.out.println("Birthdate: " + this.birthDate.getYear() + "-" + (this.birthDate.getMonth()+1) + "-" + this.birthDate.getDay());
    }
    
}


