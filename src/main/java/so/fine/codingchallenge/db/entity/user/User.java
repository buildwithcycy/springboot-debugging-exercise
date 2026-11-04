package so.fine.codingchallenge.db.entity.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import so.fine.codingchallenge.db.entity.deal.AbstractDeal;
import so.fine.codingchallenge.db.entity.lead.Lead;

import java.util.List;

@Entity
@Table(name = "`user`")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String zipCode;
    private String state;
    private String court;
    private String phoneNumber;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Lead> leads; // Leads managed by this User

    @OneToMany(mappedBy = "user")
    private List<AbstractDeal> deals; // Deals managed by this User

    //fix: added getter for ID 
    //fix: added getters and setters for the string variables above
    
	public Long getId() {
		return id;
	}


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
}