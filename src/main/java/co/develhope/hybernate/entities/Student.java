package co.develhope.hybernate.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table (name = "student")
@Data

public class Student {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private long id;

    @Column (nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column (unique = true, nullable = false)
    private String email;
}