package org.cephahs.bureau.model;

import javax.persistence.*;

@Entity
@Table(name = "fone")
public class Fone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fone_id")
	private long id;
	
	@Column(name = "code")
	private int code;
	
	@Column(name = "number")
	private long number;
	
	@ManyToOne
	private Employee employee;
	
	@ManyToOne
	private Client client;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
