package info.google.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {
    @PersistenceContext
	private EntityManager entityManager;
    
    public Employee getData(int eno) {
    	Employee find = entityManager.find(Employee.class,eno);
		return find;
    	
    }
}
