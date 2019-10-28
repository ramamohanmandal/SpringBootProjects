package com.nit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nit.Model.VehicleOwnerAddressDtls;
import com.nit.Service.VehicleOwnerAddressDtlsService;

public class VehicleOwnerAddressDtlsController {
	
	@Autowired
	private VehicleOwnerAddressDtlsService voads;
	
	@RequestMapping(value="/vehicleOwnerAddressDtls")
	public String loadForm(@ModelAttribute("vehicleOwnerAddressDtls")VehicleOwnerAddressDtls vehicleOwnerAddressDtls,Model model) {
		System.out.println("VehicleOwnerAddressDtlsController.loadForm() loaded");
		return "VehicleOwnerAddressDtls";
	}
	
	@RequestMapping(value="/vehicleOwnerAddressDtls",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("vehicleOwnerAddressDtls")VehicleOwnerAddressDtls vehicleOwnerAddressDtls,Model model) {
		System.out.println("VehicleOwnerAddressDtlsController.submitForm() loaded");
		String msg = voads.InsertVehicleOwnerAddressDtls(vehicleOwnerAddressDtls);
		model.addAttribute("msg", msg);
		return "redirect:/VehicleRegDtls";
	}

}
