package org.cephahs.bureau.repository;

import org.cephahs.bureau.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("productTypeRepository")
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {

}
