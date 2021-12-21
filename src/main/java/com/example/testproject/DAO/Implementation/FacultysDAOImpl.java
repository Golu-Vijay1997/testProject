package com.example.testproject.DAO.Implementation;

import com.example.testproject.DAO.FacultysDAO;
import com.example.testproject.bean.Facultys;
import com.example.testproject.util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;


public class FacultysDAOImpl implements FacultysDAO {

    @Override
    public boolean addFaculty(Facultys faculty) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();
            session.save(faculty);
            t.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }

    @Override
    public int verifyFaculty(Facultys faculty)
    {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();
            Query query = session.createSQLQuery("Select log.id from Facultys log where log.username=:uname and log.password=:pass")
                    .setParameter("uname",faculty.getUsername()).setParameter("pass",faculty.getPassword());
            List results = query.getResultList();
            if(!results.isEmpty())
            {
                t.commit();
                int x = (int)results.get(0);
                return x;
            }
            else
            {
                t.commit();
                return 0;
            }
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return 0;
        }
    }
}
