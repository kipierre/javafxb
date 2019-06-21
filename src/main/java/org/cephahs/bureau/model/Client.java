package org.cephahs.bureau.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "client_id")
	private long id;
	
	@Column(name = "cpf")
	private String cpf;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private ClientType clientType;
	
	@OneToOne(optional = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Address address;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Fone> phones;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private User user;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Fone> getPhones() {
		return phones;
	}

	public void setPhones(List<Fone> phones) {
		this.phones = phones;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return getUser() != null ? getUser().getName() : getCpf();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Client) {
			if (obj != null) {
				Client client = (Client) obj;
				return client.getId() == getId();
			}
		}
		
		return false;
	}
}
