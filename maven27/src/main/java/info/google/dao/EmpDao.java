package info.google.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmpDao {
    @PersistenceContext
	private EntityManager entityManager;
        @Transactional
    	public void save(Employee employee) {
    		entityManager.persist(employee);
    		employee.setSal(2222222d);
    		
    	}
    	public Employee find(int eno) {
    		Employee find = entityManager.find(Employee.class, eno);
    	return find;
    	}
    
}
