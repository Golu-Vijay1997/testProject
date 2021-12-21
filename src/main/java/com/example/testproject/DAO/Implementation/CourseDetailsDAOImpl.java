package com.example.testproject.DAO.Implementation;

import com.example.testproject.DAO.CourseDetailsDAO;
import com.example.testproject.util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.example.testproject.bean.CourseDetails;

import javax.persistence.Query;
import java.util.List;

public class CourseDetailsDAOImpl implements CourseDetailsDAO {
    @Override
    public List<CourseDetails> showtimeTable(int faculty_id)
    {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();
            Query query = session.createSQLQuery("Select cd.course_name,cd.room_no,cd.specialization,cd.timing,cd.weekdays from CourseDetails cd where log.facult_id=:fid")
                    .setParameter("fid",faculty_id);
            List<CourseDetails> results = query.getResultList();
            if(!results.isEmpty())
            {
                t.commit();
                return results;
            }
            else
            {
                t.commit();
                return null;
            }
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }
}
