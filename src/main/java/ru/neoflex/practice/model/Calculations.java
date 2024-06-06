package ru.neoflex.practice.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Calculations")
public class Calculations {

    @Id
    @Getter
    @GeneratedValue
    private long id;

    public Calculations() {

    }
    public Calculations(String expression, String result) {
        this.expression = expression;
        this.result = result;
    }

    @Column
    @Setter
    @Getter
    private String expression;


    @Column
    @Setter
    @Getter
    private String result;

    //    private String firstName;
//    private String lastName;
//    private String emailId;
//
//    public Employee() {
//
//    }
//
//    public Employee(String firstName, String lastName, String emailId) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.emailId = emailId;
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    public long getId() {
//        return id;
//    }
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Column(name = "first_name", nullable = false)
//    public String getFirstName() {
//        return firstName;
//    }
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    @Column(name = "last_name", nullable = false)
//    public String getLastName() {
//        return lastName;
//    }
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    @Column(name = "email_address", nullable = false)
//    public String getEmailId() {
//        return emailId;
//    }
//    public void setEmailId(String emailId) {
//        this.emailId = emailId;
//    }
}
