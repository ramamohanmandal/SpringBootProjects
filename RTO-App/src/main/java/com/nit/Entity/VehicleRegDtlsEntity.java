package com.nit.Entity;

import java.time.LocalDateTime;
import java.util.Date;

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
@Table(name="VEHICLE_REG_DTLS_ENTITY")
public class VehicleRegDtlsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VEHICLE_REG_ID",length=10)
	private int vehicleRegId;
	@Column(name="REG_DATE")
	private Date regDate;
	@Column(name="REG_CENTER",length=20)
	private String regCenter;
	@CreationTimestamp
	@Column(name="CREATE_DATE")
	private LocalDateTime createDate;
	@UpdateTimestamp
	@Column(name="UPDATE_DATE")
	private LocalDateTime updateDate;
	@Column(name="VEHICLE_REG_NUM",length=10)
	private String vehicleRegNum;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="VEHICLE_OWNER_ID_FK",unique=true)
	private VehicleOwnerDtlsEntity vode;

}
