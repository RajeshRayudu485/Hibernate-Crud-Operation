package todaytask;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mainClass {
EntityManagerFactory e=Persistence.createEntityManagerFactory("hiber");
EntityManager m=e.createEntityManager();
EntityTransaction t=m.getTransaction();
public void addStudentDetails(Student1 s) {
	
	t.begin();
	m.persist(s);
	t.commit();
	
}
public void updateStudent(int id, String address) {
  Student1 s=m.find(Student1.class, id);
  s.setStdAdd(address);
  t.begin();
  m.merge(s);
  t.commit();
}
public void deleteStudent(int id) {
	
	Student1 s=m.find(Student1.class, id);
	  t.begin();
	  m.remove(s);
	  t.commit();
}
public Student1 fetchStudent(int id) {
	Student1 s = m.find(Student1.class, id);
	return s;
}







}
