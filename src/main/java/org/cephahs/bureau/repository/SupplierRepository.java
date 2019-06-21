package org.cephahs.bureau.repository;

import org.cephahs.bureau.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("supplierRepository")
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
	
	@Query("SELECT COUNT(s) FROM Supplier s")
	Long getTotalSuppliers();
}
