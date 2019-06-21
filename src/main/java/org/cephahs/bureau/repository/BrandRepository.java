package org.cephahs.bureau.repository;

import org.cephahs.bureau.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("brandRepository")
public interface BrandRepository extends JpaRepository<Brand, Long> {

}
