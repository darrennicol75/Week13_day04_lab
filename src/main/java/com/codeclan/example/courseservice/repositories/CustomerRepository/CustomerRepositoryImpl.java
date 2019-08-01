package com.codeclan.example.courseservice.repositories.CustomerRepository;

import com.codeclan.example.courseservice.models.Course;
import com.codeclan.example.courseservice.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getCustomerByCourse(Long course_id) {

        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingCourse");
            cr.add(Restrictions.eq("bookingCourse.course.id", course_id));
            result = cr.list();
        }
        catch (HibernateException e){
            e.printStackTrace();
        }
        return result;
    }

    @Transactional
    public List<Course> getCourseByCustomer(Long customer_id) {
        List<Course> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "booking");

            cr.add(Restrictions.eq("booking.customer.id", customer_id));
            result = cr.list();
        }
        catch (HibernateException e){
            e.printStackTrace();
        }
        return result;
    }

}
