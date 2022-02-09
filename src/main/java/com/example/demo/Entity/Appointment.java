package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotNull
	@Size(max = 25)
	@NotBlank(message = "name is mandatory")
	@NotEmpty
	private String name;

	@NotNull
	@Size(max = 25)
	@NotBlank(message = "age is mandatory")
	@NotEmpty
	private Integer age;

	@NotNull
	@Size(max = 25)
	@NotBlank(message = "email is mandatory")
	@NotEmpty
	private String email;

	@NotNull
	@Size(max = 10)
	@NotBlank(message = "mobileno is mandatory")
	@NotEmpty
	private String mobileno;

	@NotNull
	@Size(max = 25)
	@NotBlank(message = "addressline1 is mandatory")
	@NotEmpty
	private String addressline1;

	@NotNull
	@Size(max = 25)
	@NotBlank(message = "addressline2 can be same as addressline1")
	@NotEmpty
	private String addressline2;

	@NotNull
	@Size(max = 25)
	@NotBlank(message = "city is mandatory")
	@NotEmpty
	private String city;

	@NotNull
	@Size(max = 25)
	@NotBlank(message = "State is mandatory")
	@NotEmpty
	private String state;

	@NotNull
	@Size(max = 25)
	@NotBlank(message = "country is mandatory")
	@NotEmpty
	private String country;

	@NotNull
	@Size(max = 25)
	@NotBlank(message = "pincode is mandatory")
	@NotEmpty
	private String pincode;

	@NotNull
	@Size(max = 25)
	@NotBlank(message = "trainerpreference is mandatory")
	@NotEmpty
	private String trainerpreference;

	@NotNull
	@Size(max = 25)
	@NotBlank(message = "yes or no")
	@NotEmpty
	private String physiotherapist;
	private Integer selectpackage;
	private Integer weeks;
	private Double amount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhysiotherapist() {
		return physiotherapist;
	}

	public void setPhysiotherapist(String physiotherapist) {
		this.physiotherapist = physiotherapist;
	}

	public Integer getSelectpackage() {
		return selectpackage;
	}

	public void setSelectpackage(Integer selectpackage) {
		this.selectpackage = selectpackage;
	}

	public Integer getWeeks() {
		return weeks;
	}

	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getTrainerpreference() {
		return trainerpreference;
	}

	public void setTrainerpreference(String trainerpreference) {
		this.trainerpreference = trainerpreference;
	}

}