package com.io.hibernatemaven;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/*@table annotation for changing the table name but the entity name will remain same*/
@Entity
public class UserDetails {

	public String getUserDescription() {
		return userDescription;
	}
	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	@Id
	private int id;
	//@Transient:-indicates that field will not be stored in the table.
	//@Transient
	private String name;
	//@Lob:-Used for large java objects.with this annotation,the value in userdesc will be stored in numbers.
	//@Lob
	private String userDescription;
	@Temporal(TemporalType.TIME)
	private Date joinedDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
