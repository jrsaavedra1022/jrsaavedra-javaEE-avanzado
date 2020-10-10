package com.jrsaavedra.hibernate.dao;

import java.util.List;

import com.jrsaavedra.hibernate.model.Teacher;

public interface TeacherDao {
	
	void saveTeacher(Teacher teacher);
	void deleteTeacherById(Long teacherId);
	void updateTeacher(Teacher teacher);
	
	List<Teacher> findAllTeachers();
	Teacher findById(Long teacherId);
	Teacher findByName(String name);
}
