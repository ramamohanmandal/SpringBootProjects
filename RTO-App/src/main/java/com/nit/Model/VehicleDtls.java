package com.nit.Model;

import java.util.Date;

import lombok.Data;

@Data
public class VehicleDtls {
	private int vehicleId;
	private int vehicleOwnerId;
	private String vehicleType;
	private int mfgYear;
	private String vehicleBrand;
	private Date createDate;
	private Date updateDate;
	
}
