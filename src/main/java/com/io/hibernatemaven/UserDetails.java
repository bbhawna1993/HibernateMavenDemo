package com.io.hibernatemaven;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/*@table annotation for changing the table name but the entity name will remain same*/
@Entity
public class UserDetails {

	//	public String getUserDescription() {
	//		return userDescription;
	//	}
	//	public void setUserDescription(String userDescription) {
	//		this.userDescription = userDescription;
	//	}
	//	public Date getJoinedDate() {
	//		return joinedDate;
	//	}
	//	public void setJoinedDate(Date joinedDate) {
	//		this.joinedDate = joinedDate;
	//	}
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	//@Transient:-indicates that field will not be stored in the table.
	//@Transient
	private String name;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(column=@Column(name="HOME_STREET_NAME"), name = "street"),
		@AttributeOverride(column=@Column(name="HOME_CITY_NAME"), name = "city"),
		@AttributeOverride(column=@Column(name="HOME_STATE_NAME"), name = "state"),
		@AttributeOverride(column=@Column(name="HOME_PINCODE"), name = "pin")})
	private Address homeAddress;

	//@Lob:-Used for large java objects.with this annotation,the value in user-description will be stored in numbers.
	//	//@Lob

	//	private String userDescription;
	//	@Temporal(TemporalType.TIME)
	//	private Date joinedDate;


	public int getId() {
		return id;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
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
