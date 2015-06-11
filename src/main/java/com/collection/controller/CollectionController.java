package com.collection.controller;


import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import com.collection.domain.*;
import com.collection.service.ManageClienteService;
import com.collection.service.ManageProductoService;
import com.collection.service.ManageProveedorService;
import com.collection.service.ManageUsuarioService;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;




@Controller
public class CollectionController {
		
	@RequestMapping(value = "/ActualizarStock", method = RequestMethod.GET)
	public String productoaCtualizar() {
		return "ActualizarStock";
	}

////////////////INICIO INDEX//////////////// 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
////////////////FIN INDEX//////////////// 	
	
////////////////INICIO INGRESAR USUARIO//////////////// 
	@Autowired
	private ManageUsuarioService manageUsuarioService;
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public ModelAndView login() {
		
		 ModelAndView result = new ModelAndView("Login");
		 result.addObject("usuario",new Usuario());
		 return result;
	}

	   
	
    @RequestMapping(value = "/ingresarUsuario", method = RequestMethod.POST)
 	
    public String ingresarUser(@ModelAttribute("usuario") @Valid Usuario usuario,BindingResult result, Map model) {
			
    	//alumno.getDateOfBirth().s;
		if (result.hasErrors()) {
			return "Login";
		}
		
		List<Usuario> listausu = manageUsuarioService.getAll();
		boolean validar=false;
		for(Usuario usu:listausu){
			if(usu.getUser().equals(usuario.getUser())&&usu.getPassword().equals(usuario.getPassword())){
				validar= true;
				break;
			}
		}
		if(validar){
			return "index2";
		}else{
			return "redirect:/Login";
		}
	
		
		
	}	
	
	
////////////////FIN INGRESAR USUARIO//////////////// 
			    
		    

}
