package info.google.maven27;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import info.google.dao.EmpDao;
import info.google.dao.Employee;
import info.google.util.CompnentCls;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	 Employee employee = new Employee(1, "divya", 1111d);
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(CompnentCls.class);
        EmpDao empDao = container.getBean(EmpDao.class);
        Employee employee2 = empDao.find(1);
        System.out.println(employee2);
       }
}
