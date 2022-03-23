package feb22.maven.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("abcd");
		EntityManager em = factory.createEntityManager();

//		Employee emp = new Employee(101, "Sajal", 50000);
		Employee emp2 = new Employee(102, "Gatha", 20000);
//		Employee emp3 = new Employee(103, "Deepak", 70000);

		em.getTransaction().begin();

//		em.persist(emp); // Insert
//		em.persist(emp2); // Insert
//		em.persist(emp3); // Insert

		emp2.setSalary(65000);
		em.merge(emp2); // Update

//		em.remove(emp); // delete
//		System.out.println("Removed");
		Employee empData = em.find(Employee.class, 102); // Select
		em.getTransaction().commit();

		System.out.println(empData.toString());
		System.out.println("End");
	}
}
