package com.nit.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="VEHICLE_DTLS")
public class VehicleDtlsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VEHICLE_ID",length=10)
	private int vehicleId;
	
	@Column(name="VEHICLE_TYPE",length=10)
	private String vehicleType;
	
	@Column(name="MFG_YEAR")
	private int mfgYear;
	
	@Column(name="VEHICLE_BRAND",length=20)
	private String vehicleBrand;
	
	@CreationTimestamp
	@Column(name="CREATE_DATE")
	private LocalDateTime createDate;
	
	@UpdateTimestamp
	@Column(name="UPDATE_DATE")
	private LocalDateTime updateDate;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="VEHICLE_OWNER_ID_FK", unique=true, nullable = false)
	private VehicleOwnerDtlsEntity vode;

}
