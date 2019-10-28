package com.nit.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Entity.VehicleDtlsEntity;
import com.nit.Entity.VehicleOwnerDtlsEntity;
import com.nit.Model.VehicleDtls;
import com.nit.Model.VehicleOwnerDtls;
import com.nit.Repository.VehicleDtlsRepository;
import com.nit.Repository.VehicleOwnerDtlsRepository;

@Service
public class VehicleOwnerDtlsService {
	
	@Autowired
	private VehicleOwnerDtlsRepository RownerDtls;
	
	@Autowired
	private VehicleDtlsRepository RvehicleDtls;
	
	public String InsertVehicleOwnerDtls(VehicleOwnerDtls ownerDtls) {
		VehicleOwnerDtlsEntity entity = new VehicleOwnerDtlsEntity();
		BeanUtils.copyProperties(ownerDtls, entity);
		VehicleOwnerDtlsEntity count = RownerDtls.save(entity);
		
		if(count != null) {
			return "Thank You";
		}else
		return "Try Again";
	}

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
