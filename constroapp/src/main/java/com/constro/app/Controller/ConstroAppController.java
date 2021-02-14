package com.constro.app.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.constro.app.bo.CBELogin;
import com.constro.app.bo.Contact;
import com.constro.app.bo.exception.RestCustomException;
import com.constro.app.service.CBELoginService;
import com.constro.app.service.ContactService;

@Controller
public class ConstroAppController {
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private CBELoginService cbeLoginService;
	
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	@GetMapping("/index2")
	public String index2() {
		return "index2";
	}
	
	
	@GetMapping("/products")
	public String products() {
		return "products";
	}
	
	@GetMapping("/services")
	public String services() {
		return "services";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	
	@GetMapping("/cbelogin")
	public String login() {
		return "login";
	}
	
	
	//@RequestMapping(value = "CostomarContact", method = RequestMethod.POST)
	@PostMapping("/CostomarContact")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Consumes(MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> customerRegister(@RequestBody Contact bo, HttpServletRequest req) {

		HttpSession ses = req.getSession();
		String res = null;
		try {
			HttpSession session = req.getSession();
			res = contactService.contactCustomer(bo);
			if (res == "success") {
//				session.setAttribute("updatedInterviewerUserName", interviewerDto.getEmail());
//				session.setAttribute("updatedInterviewerIntcanId", interviewerDto.getIntCanId());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("fail", HttpStatus.OK);
		}
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}


	/*
	 * 
	 * 
	 * Construction Bazaar Team Logging controller===========================
	 * 
	 * 
	 * 
	 * */
	
	
	@RequestMapping(value = "cbelogin", method = RequestMethod.POST)
	public ModelAndView CBELoging(@ModelAttribute CBELogin loginbo, HttpServletRequest req) {
		HttpSession ses = req.getSession();
		ses.setAttribute("userName", loginbo.getUserName());
		int customerLoginResult = cbeLoginService.CBELoging(loginbo);

		if (customerLoginResult == 0) {
			String res = "Something Invalid Plz Try again";
			return new ModelAndView("login", "res", res);
		} 
		
		else {
			return new ModelAndView("cbDataDetails");
		}
	}
	
	
	
	
	
	/*
	 * 
	 * 
	 * GET CONTACT DETAILS ==============================
	 * 
	 * */
	
	@GetMapping("/getContactDetails")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	@Consumes(MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView viewInterviewerTimeSchedule(@RequestParam("st") String status,HttpServletRequest req,@ModelAttribute Contact contact) {
//		List<Contact> contactList = null;
//		try {
//			
//			contactList = contactService.getContactDetails(status);  
//			
//		} catch (RestCustomException e) {
//			System.err.println(e);
//			throw new RestCustomException(e.getMessage());
//		} catch (Exception e) {
//			System.err.println(e);
//			throw new RestCustomException("Internal Server Error Please Try Again Once ..!");
//		}

//		return new ResponseEntity<List<Contact>>(contactList, HttpStatus.OK);
//	}
		HttpSession ses=req.getSession();
//		ses.setAttribute("itemID", customerGroseryPageBO.getItemID());
		List<Contact> res = contactService.getContactDetails(status);
		return new ModelAndView("contactList","res",res);
	
}
	
}
	
