package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.service.StudentService;

@Service
public class StudentsServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	
	public StudentsServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	
	//metodo che ritorna tutta la lista degli studenti
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

//metodo che dovrebbe salvare uno studente aggiunto MA CHE A QUANTO PARE NON FUNZIONA. FIX!
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}


@Override
public Student getStudentById(Long id) {
	return studentRepository.findById(id).get();
}


@Override
public Student updateStudent(Student student) {
	return studentRepository.save(student);
}


@Override
public void deleteStudentById(Long id) {
	studentRepository.deleteById(id);
	
}

	


	

}
