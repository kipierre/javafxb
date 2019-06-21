package org.cephahs.bureau.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "supplier")
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "supplier_id")
	private long id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "email")
	private String email;
	
	@OneToOne(optional = true, fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	private Address addres;
	
	@OneToMany(mappedBy = "supplier", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Product> products;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddres() {
		return addres;
	}

	public void setAddres(Address addres) {
		this.addres = addres;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return getCompanyName();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Supplier) {
			if (obj != null) {
				Supplier supplier = (Supplier) obj;
				return supplier.getId() == getId();
			}
		}
		
		return false;
	}
	
}
