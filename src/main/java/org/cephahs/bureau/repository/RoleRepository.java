package org.cephahs.bureau.repository;


import org.cephahs.bureau.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	List<Role> findByRole(String role);
}
