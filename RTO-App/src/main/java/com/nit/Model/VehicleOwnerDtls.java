package com.nit.Model;

import java.util.Date;

import lombok.Data;

@Data
public class VehicleOwnerDtls {
	private int vehicleOwenerId;
	private String firstName;
	private String lastName;
	private char gender;
	private String email;
	private Date dob;
	private Long phno;
	private Date createDate;
	private Date updateDate;

}
