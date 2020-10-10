package com.jrsaavedra.hibernate.dao;

import java.util.List;

import com.jrsaavedra.hibernate.model.Teacher;

public class TeacherDaoImpl implements TeacherDao  {
	//attributes
	private JrsaavedraSession jrsaavedraSession;
	//constructor
	public TeacherDaoImpl() {
		super();
		this.jrsaavedraSession = new JrsaavedraSession();
		
	}
	
	@Override
	public void saveTeacher(Teacher teacher) {
		// guardar teacher
		//persist == save method
		this.jrsaavedraSession.getSession().persist(teacher);	
		this.jrsaavedraSession.getSession().getTransaction().commit();
		this.jrsaavedraSession.getSession().close();
	}

	@Override
	public void deleteTeacherById(Long teacherId) {
		// TODO Auto-generated method stub
		Teacher teacher = this.findById(teacherId);
		this.jrsaavedraSession.getSession().delete(teacher);	
		this.jrsaavedraSession.getSession().getTransaction().commit();
		this.jrsaavedraSession.getSession().close();
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		this.jrsaavedraSession.getSession().update(teacher);
		this.jrsaavedraSession.getSession().getTransaction().commit();
		this.jrsaavedraSession.getSession().close();
	}

	@Override
	public List<Teacher> findAllTeachers() {
		// obtener todos los teachers: obtenemos a partir de la clase Teacher
		return this.jrsaavedraSession.getSession().createQuery("from Teacher").list();
	}

	@Override
	public Teacher findById(Long id) {
		// TODO Auto-generated method stub
		return this.jrsaavedraSession.getSession().load(Teacher.class, id);
	}

	@Override
	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
