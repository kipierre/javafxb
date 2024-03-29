package org.cephahs.bureau.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private long id;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "initial_cost_price")
	private double initialCostPrice;
	
	@Column(name = "buy_price")
	private double buyPrice;
	
	@Column(name = "wholesale_price")
	private double wholesalePrice;
	
	@Column(name = "retail_price")
	private double retailPrice;
	
	@Column(name = "weight")
	private double weight;
	
	@Column(name = "initial_stock")
	private double initialStock;
	
	@Column(name = "created_at")
	@Type(type="date")
	private Date createdAt;
	
	@Column(name = "updated_at")
	@Type(type="date")
	private Date updatedAt;
	
	@ManyToOne
	private Supplier supplier; 
	
	@ManyToOne
	private Brand brand;
	
	@ManyToOne
	private ProductType productType;
	
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Image> images;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "product_tag",
	   joinColumns = @JoinColumn(name = "product_id"),
	   inverseJoinColumns = @JoinColumn(name = "tag_id"))
	private List<Tag> tags;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getInitialCostPrice() {
		return initialCostPrice;
	}

	public void setInitialCostPrice(double initialCostPrice) {
		this.initialCostPrice = initialCostPrice;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public double getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(double wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public double getInitialStock() {
		return initialStock;
	}

	public void setInitialStock(double initialStock) {
		this.initialStock = initialStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Product) {
			if (obj != null) {
				Product product = (Product) obj;
				return product.getId() == getId();
			}
		}
		
		return false;
	}
}
