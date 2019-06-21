package org.cephahs.bureau.repository;

import org.cephahs.bureau.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT s FROM Sale s WHERE LOWER(s.state) = LOWER('open')")
	List<Sale> findAllOpenSales();
	
	@Query("SELECT s FROM Sale s WHERE LOWER(s.state) = LOWER('finalized')")
	List<Sale> findAllFinalizedSales();
	
	@Query("SELECT COUNT(s) FROM Sale s")
	Long getTotalSales();
	
	@Query("SELECT s FROM Sale s WHERE strftime('%m-%Y', s.issueDate) = :month")
	List<Sale> findSalesByMonth(@Param("month") String month);
	
	@Query("SELECT COUNT(s) FROM Sale s WHERE strftime('%m-%Y', s.issueDate) = :month")
	Long getTotalSalesByMonth(@Param("month") String month);
}
