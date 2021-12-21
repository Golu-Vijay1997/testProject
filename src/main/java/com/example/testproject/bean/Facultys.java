package com.example.testproject.bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table
public class Facultys implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private  Integer faculty_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private  String password;

    public Facultys()
    {

    }

    public Integer getFaculty_id() {
        return faculty_id;
    }

    public Facultys(Integer faculty_id, String name, String username, String password) {
        this.faculty_id = faculty_id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public void setFaculty_id(Integer faculty_id) {
        this.faculty_id = faculty_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
