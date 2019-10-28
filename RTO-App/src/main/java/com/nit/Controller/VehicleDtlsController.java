package com.nit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nit.Model.VehicleDtls;
import com.nit.Service.VehicleOwnerDtlsService;
@Controller
public class VehicleDtlsController {
	
	@Autowired
	private VehicleOwnerDtlsService vds;
	
	@RequestMapping(value="/VehicleDtls")
	public String loadForm(@ModelAttribute("vehicleDtls")VehicleDtls vehicleDtls,Model model) {
		System.out.println("VehicleDtlsController.loadForm() loaded");
		return "VehicleDtls";
	}
	
	@RequestMapping(value="/vehicleDtlsc",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("vehicleDtls")VehicleDtls vehicleDtls,Model model) {
		System.out.println("VehicleDtlsController.submitForm() loaded");
		String msg = vds.InsertVehicleDtls(vehicleDtls);
		model.addAttribute("msg", msg);
		return "redirect:/VehicleOwnerAddressDtls";
	}

}
