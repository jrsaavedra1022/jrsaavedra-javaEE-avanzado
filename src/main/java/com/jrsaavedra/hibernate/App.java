package com.jrsaavedra.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.jrsaavedra.hibernate.dao.TeacherDaoImpl;
import com.jrsaavedra.hibernate.model.Course;
import com.jrsaavedra.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //** Documentación CRUD hibernate witout HQL
        // http://www.cursohibernate.es/doku.php?id=unidades:02_hibernate:04_usando_hibernate
        
        
        //** insert teacher
//        Teacher teacher = new Teacher("Para eliminar", "avatar");
//        TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
//        teacherDaoImpl.saveTeacher(teacher);
        
        // ** obtener listado de teachers
//        TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
//        List<Teacher> teachers = teacherDaoImpl.findAllTeachers();
//        
//        for(Teacher t: teachers) {
//        	System.out.println("Nombre: " + t.getName());
//        }
        
        // ** Find by Id and Update
//        Teacher teacher = new Teacher();
//        TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
//        teacher = teacherDaoImpl.findById((long) 1);
//        teacher.setName("Pepito perez");
//        teacherDaoImpl.updateTeacher(teacher);
        
        // ** delete
      TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
      teacherDaoImpl.deleteTeacherById((long) 3);
        
        //insert course
//        Course course = new Course("Java EE", "tema 1", "Rest Api");
   
        
        
    }
}
