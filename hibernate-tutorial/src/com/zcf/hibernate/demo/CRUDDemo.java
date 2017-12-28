package com.zcf.hibernate.demo;

import com.zcf.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by zhangchf on 28/12/2017.
 */
public class CRUDDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                                        .configure("hibernate.cfg.xml")
                                        .addAnnotatedClass(Student.class)
                                        .buildSessionFactory();

        try {

            // Create
            System.out.println("Creating objects");
            Student student1 = new Student("John", "Doe", "john@test.com");
            Student student2 = new Student("Bonita", "Applebum", "bonita@test.com");
            Student student3 = new Student("Clark", "Tim", "clark@test.com");

            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.save(student1);
            session.save(student2);
            session.save(student3);

            //Retrieve
            System.out.println("Retrieving objects");
            Student student = session.get(Student.class, student1.getId());
            System.out.println(student);

            List<Student> students = session.createQuery("from Student s where s.firstName = 'Clark'").getResultList();
            displayStudents(students);

            students = session.createQuery("from Student s where s.firstName = 'Clark' or s.lastName = 'Doe'").getResultList();
            displayStudents(students);

            students = session.createQuery("from Student s where s.email like '%test.com'").getResultList();
            displayStudents(students);

            session.getTransaction().commit();

            //Update
            System.out.println("Updating objects");
            session = factory.getCurrentSession();
            session.beginTransaction();

            Student myStudent = session.get(Student.class, student1.getId());
            myStudent.setFirstName("Scoopy");

            session.createQuery("update Student s set s.email = 'foo@gmail.com' where s.id = " + student2.getId()).executeUpdate();

            session.getTransaction().commit();

            //Delete
            System.out.println("Deleting objects");
            session = factory.getCurrentSession();
            session.beginTransaction();

            Student toDeleteStudent = session.get(Student.class, student1.getId());
            session.delete(toDeleteStudent);

            session.createQuery("delete Student s where s.id = " + student2.getId()).executeUpdate();

            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }

    private static void displayStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
