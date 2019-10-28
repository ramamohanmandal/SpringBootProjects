package com.nit.Model;

import java.util.Date;

import lombok.Data;

@Data
public class VehicleRegDtls {
	private int vehicleRegId;
	private int vehicleOwnerId;
	private Date regDate;
	private String regCenter;
	private Date createDate;
	private Date updateDate;
	private String vehicleRegNum;
	

}
