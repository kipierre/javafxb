package org.cephahs.bureau.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client_type")
public class ClientType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "client_type_id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "clientType", fetch = FetchType.LAZY)
	private List<Client> clients;
	
	public ClientType() {
	}

	public ClientType(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
}
