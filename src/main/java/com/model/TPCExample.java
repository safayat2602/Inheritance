package com.model;
import org.hibernate.Session;
import jakarta.persistence.DiscriminatorValue;
import org.hibernate.Transaction;

public class TPCExample {
	public static void main(String[]args)
	{
		Transaction tr=null;
		try(Session ses=HBUtil.getSessionFactory().openSession())
		{
			tr=ses.beginTransaction();
			Employee e1=new Employee("Akash");
			RegEmployee e2=new RegEmployee(5500,"sales","Suresh");
			Trainee e3=new Trainee("Umesh",200,"6 months");
			
			ses.persist(e1); 
			ses.persist(e2);
			ses.persist(e3);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}