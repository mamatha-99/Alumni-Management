package com.POD5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.POD5.model.RegistrationForm;

@Controller
public class ConfirmationOrErrorController {

	@GetMapping("/accountActivated")
	public String registration(RegistrationForm accountForm, Model model) {
		model.addAttribute("confirmationMessage", "Your Account has been Successfully Activated!");
		return "confirmation";
	}
}