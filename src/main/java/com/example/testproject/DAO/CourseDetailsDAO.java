package com.example.testproject.DAO;

import com.example.testproject.bean.CourseDetails;

import java.util.List;

public interface CourseDetailsDAO {
    List<CourseDetails> showtimeTable(int faculty_id);
}
