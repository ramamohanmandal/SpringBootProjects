package com.nit.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.nit.Entity.VehicleOwnerAddressDtlsEntity;
import com.nit.Model.VehicleOwnerAddressDtls;
import com.nit.Repository.VehicleOwnerAddressDtlsRepository;

public class VehicleOwnerAddressDtlsService {
	
	@Autowired
	private VehicleOwnerAddressDtlsRepository RvehicleOwnerAddressDtls;
	
	public String InsertVehicleOwnerAddressDtls(VehicleOwnerAddressDtls vehicleOwnerAddressDtls) {
		VehicleOwnerAddressDtlsEntity entity = new VehicleOwnerAddressDtlsEntity();
		BeanUtils.copyProperties(vehicleOwnerAddressDtls, entity);
		VehicleOwnerAddressDtlsEntity count = RvehicleOwnerAddressDtls.save(entity);
		
		if(count != null) {
			return "Thank You";
		}else
		return "Try Again";
	}

}
