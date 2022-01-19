package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Getmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Test test1 = (Test)session.get(Test.class,700);
		System.out.println("Test ID--->"+" "+test1.getTestId());
		System.out.println("Test Name--->"+" "+test1.getTestName());
		
		Test test2 = (Test)session.load(Test.class, 700);
		System.out.println("Test ID--->"+" "+test2.getTestId());
		System.out.println("Test Name--->"+" "+test2.getTestName());
		
		
		
		session.close();
		factory.close();
		 
	
		
		
	}
	
}

