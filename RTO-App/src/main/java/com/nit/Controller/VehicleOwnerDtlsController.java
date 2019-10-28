package com.nit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nit.Model.VehicleOwnerDtls;
import com.nit.Service.VehicleOwnerDtlsService;

@Controller
public class VehicleOwnerDtlsController {
	
	@Autowired
	private VehicleOwnerDtlsService vods;
	
	@RequestMapping(value="/ownerDtls")
	public String loadForm(@ModelAttribute("ownerDtls")VehicleOwnerDtls ownerDtls,Model model) {
		System.out.println("VehicleOwnerDtlsController.loadForm() Started");
		return "VehicleOwnerDtls";
	}
	
	@RequestMapping(value="/ownerDtls",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("ownerDtls")VehicleOwnerDtls ownerDtls,Model model) {
		System.out.println("VehicleOwnerDtlsController.submitForm() Started");
		String msg = vods.InsertVehicleOwnerDtls(ownerDtls);
		model.addAttribute("msg",msg);
		return "redirect:/VehicleDtls";
	}

}
