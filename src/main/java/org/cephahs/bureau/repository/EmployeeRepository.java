package org.cephahs.bureau.repository;

import org.cephahs.bureau.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Query("SELECT COUNT(e) FROM Employee e")
	Long getTotalEmployees();
}
