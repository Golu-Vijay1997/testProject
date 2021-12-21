package com.example.testproject.DAO;

import com.example.testproject.bean.Facultys;

public interface FacultysDAO {
    boolean addFaculty (Facultys faculty);
    int verifyFaculty(Facultys faculty);
}