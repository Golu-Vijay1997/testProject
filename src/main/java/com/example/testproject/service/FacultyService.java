package com.example.testproject.service;


import com.example.testproject.DAO.FacultysDAO;
import com.example.testproject.DAO.Implementation.FacultysDAOImpl;
import com.example.testproject.bean.Facultys;

public class FacultyService {
    FacultysDAOImpl facultysDAO = new FacultysDAOImpl(); //in DAO impl
    public int verifyFaculty(Facultys faculty){ //called from controller
        return facultysDAO.verifyFaculty(faculty); //calls the DAO method
    }

    public boolean addFaculty(Facultys faculty){ //called from controller
        return facultysDAO.addFaculty(faculty); //calls the DAO method
    }
}

