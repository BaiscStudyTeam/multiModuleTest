package com.example.login.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name="user")
@Getter
@Setter
public class User {

    @Id
    private String userId;

    private String userPassword;

    private java.sql.Timestamp regDt;
}
