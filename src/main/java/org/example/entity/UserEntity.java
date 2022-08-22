package org.example.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class UserEntity {
    @Id
    @Column(name = "id",nullable = false,unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
