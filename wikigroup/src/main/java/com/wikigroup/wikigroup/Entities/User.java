package com.wikigroup.wikigroup.Entities;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String names;

    @Column(nullable = false, length = 100)
    private String lastNames;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false)
    private Integer semester;

    @Column(nullable = false, length = 500)
    private String description;
}
