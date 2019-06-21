package org.cephahs.bureau.repository;

import org.cephahs.bureau.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("clientRepository")
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	@Query("SELECT COUNT(c) FROM Client c")
	Long getTotalClients();
}
