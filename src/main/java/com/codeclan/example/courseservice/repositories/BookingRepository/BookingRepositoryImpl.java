package com.codeclan.example.courseservice.repositories.BookingRepository;


import com.codeclan.example.courseservice.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Booking> getBookingByDate(String date){
        List<Booking> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Booking.class);
            cr.add(Restrictions.eq("date", date));
            result = cr.list();
        } catch
            (HibernateException e){
            e.printStackTrace();
        }
        return result;
    }
}
