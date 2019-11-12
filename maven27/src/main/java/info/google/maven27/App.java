package info.google.maven27;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import info.google.dao.EmpDao;
import info.google.dao.Employee;
import info.google.util.CompnentCls;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(CompnentCls.class);
        EmpDao empDao = container.getBean(EmpDao.class);
      Employee data = empDao.getData(1);
       System.out.println(data);
    }
}
