package feb22.maven.demo.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee emp = new Employee(111, "ShowFalse", 50000);
//		session.save(emp); // insert

		emp.setSalary(100000);
		session.update(emp); // update
//		session.delete(emp); // delete
		transaction.commit();
		Employee empData = session.get(Employee.class, 111); // select
		System.out.println(empData.toString());
		System.out.println("End");
	}
}
