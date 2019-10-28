package com.nit.Entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity()
@Table(name="VEHICLE_OWNER_DTLS")
public class VehicleOwnerDtlsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VEHICLE_OWNER_ID", nullable=false)
	private int vehicleOwenerId;
	
	@NotNull
	@Size(max = 65)
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@NotNull
	@Size(max = 65)
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="GENDER")
	private char gender;
	
	@NotNull
	@Email
	@Size(max = 100)
	@Column(name="EMAIL", unique=true)
	private String email;
	
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="PHNO")
	private Long phno;
	
	@CreationTimestamp
	@Column(name="CREATE_DT")
	private LocalDateTime createDate;
	
	@UpdateTimestamp
	@Column(name="UPDATE_DT")
	private LocalDateTime updateDate;
	
	@OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "vode")
    private VehicleDtlsEntity vehicleDtls;
	
	@OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "vode")
    private VehicleOwnerAddressDtlsEntity vehicleOwnerAddressDtls;
	
	@OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "vode")
    private VehicleRegDtlsEntity vehicleRegDtls;

}
