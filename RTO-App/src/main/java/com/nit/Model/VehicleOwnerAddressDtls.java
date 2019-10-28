package com.nit.Model;

import java.util.Date;

import lombok.Data;

@Data
public class VehicleOwnerAddressDtls {
	private int addressId;
	private int vehicleOwnerId;
	private String hno;
	private String streetName;
	private String city;
	private int zipCode;
	private Date createDate;
	private Date updateDate;
	

}
