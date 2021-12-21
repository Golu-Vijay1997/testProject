package com.example.testproject.service;

import com.example.testproject.DAO.Implementation.CourseDetailsDAOImpl;
import com.example.testproject.DAO.Implementation.FacultysDAOImpl;
import com.example.testproject.bean.CourseDetails;
import com.example.testproject.bean.Facultys;
import com.example.testproject.DAO.FacultysDAO;
import java.util.List;

public class CourseDetailsService {
    CourseDetailsDAOImpl courseDetailsDAO = new CourseDetailsDAOImpl(); //in DAO impl

    public List<CourseDetails> showtimeTable(int faculty_id){ //called from controller
        return courseDetailsDAO.showtimeTable(faculty_id); //calls the DAO method
    }
}

