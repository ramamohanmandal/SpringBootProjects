package com.nit.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.nit.Entity.VehicleDtlsEntity;
import com.nit.Model.VehicleDtls;
import com.nit.Repository.VehicleDtlsRepository;

public class VehicleDtlsService {
	
	@Autowired
	private VehicleDtlsRepository RvehicleDtls;
	
	public String InsertVehicleDtls(VehicleDtls vehicleDtls) {
		VehicleDtlsEntity entity = new VehicleDtlsEntity();
		BeanUtils.copyProperties(vehicleDtls, entity);
		VehicleDtlsEntity count = RvehicleDtls.save(entity);
		
		if(count != null) {
			return "Thank You";
		}else
		return "Try Again";
	}
	
	

}
