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


}
