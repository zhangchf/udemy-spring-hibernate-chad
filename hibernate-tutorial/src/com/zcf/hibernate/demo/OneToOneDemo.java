package com.zcf.hibernate.demo;

import com.zcf.hibernate.demo.entity.Instructor;
import com.zcf.hibernate.demo.entity.InstructorDetail;
import com.zcf.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by zhangchf on 28/12/2017.
 */
public class OneToOneDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                                        .configure("hb-01-one-to-one.cfg.xml")
                                        .addAnnotatedClass(Instructor.class)
                                        .addAnnotatedClass(InstructorDetail.class)
                                        .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();

            // Create
            System.out.println("Creating objects");
            Instructor instructor = new Instructor("Chad", "Darby", "darby@test.com");
            InstructorDetail instructorDetail = new InstructorDetail("chad.darby@youtube", "coding");

            instructor.setInstructorDetail(instructorDetail);

            session.save(instructor);
            session.getTransaction().commit();

            //Retrieve
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            System.out.println("Retrieving objects");
//            Instructor gotInstructor = session.get(Instructor.class, instructor.getId());
//            System.out.println(gotInstructor);
//            System.out.println(gotInstructor.getInstructorDetail());
//
//            InstructorDetail gotInstructorDetail = session.get(InstructorDetail.class, instructorDetail.getId());
//            System.out.println(gotInstructorDetail);
//            System.out.println(gotInstructorDetail.getInstructor());
//
//            session.getTransaction().commit();
            //Update

            //Delete
            session = factory.getCurrentSession();
            session.beginTransaction();

            InstructorDetail gotInstructorDetail2 = session.get(InstructorDetail.class, instructorDetail.getId());
            System.out.println(gotInstructorDetail2);
            System.out.println(gotInstructorDetail2.getInstructor());

//            session.delete(gotInstructor);
            gotInstructorDetail2.getInstructor().setInstructorDetail(null);
            session.delete(gotInstructorDetail2);

            System.out.println("Deleting objects");
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }


    private static void printObject(Object... o) {
        System.out.println(o);
    }

}
