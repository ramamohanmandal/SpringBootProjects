package com.nit.Entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="VECHILE_OWNER_ADDRESS_DTLS_ENTITY")
public class VehicleOwnerAddressDtlsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADDRESS_ID",length=10)
	private int addressId;
	@Column(name="HNO",length=50)
	private String hno;
	@Column(name="STREET_NAME",length=50)
	private String streetName;
	@Column(name="CITY",length=50)
	private String city;
	@Column(name="ZIP_CODE",length=6)
	private int zipCode;
	@CreationTimestamp
	@Column(name="CREATE_DATE")
	private LocalDateTime createDate;
	@UpdateTimestamp
	@Column(name="UPDATE_DATE")
	private LocalDateTime updateDate;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="VEHICLE_OWNER_ID_FK",unique=true)
	private VehicleOwnerDtlsEntity vode;

}
