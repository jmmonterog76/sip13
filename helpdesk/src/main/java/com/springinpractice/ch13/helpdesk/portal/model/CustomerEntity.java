package com.springinpractice.ch13.helpdesk.portal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Entity
@Table(name = "user")
public class CustomerEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	public Long getId() { return id; }
	
	public String getUsername() { return username; }
	
	public String getFirstName() { return firstName; }
	
	public String getLastName() { return lastName; }
	
	public String getFirstNameLastName() { return firstName + " " + lastName; }
	
	public String getEmail() { return email; }
}
