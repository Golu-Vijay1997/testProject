package com.example.testproject.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class CourseDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer course_id;

    @Column(nullable = false)
    private String course_name;

    @Column(nullable = false)
    private String specialization;

//    @ManyToOne
//    @JoinColumn(name = "faculty_id",nullable = false)
//    public Facultys faculty;

    @Column(nullable = false)
    public Integer faculty_id;

    @Column(nullable = false)
    private String room_no;

    @Column(nullable = false)
    private String timing;

    @Column(nullable = false)
    private String weekdays;

    public CourseDetails()
    {
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

//    public Facultys getFaculty() {
//        return faculty;
//    }
//
//    public void setFaculty(Facultys faculty) {
//        this.faculty = faculty;
//    }

    public Integer getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(Integer faculty_id) {
        this.faculty_id = faculty_id;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(String weekdays) {
        this.weekdays = weekdays;
    }
}
