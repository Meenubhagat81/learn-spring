package com.meenu.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		model.addAttribute("fullName", "Sumit Arora" ); 
		
		return "home";
	}
	

	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	
	public String hello(Locale locale, Model model) {
		
		logger.info("Welcome hello!");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		
		model.addAttribute("serverTime", formattedDate );
		
		model.addAttribute("fullName", "Sumit Arora" ); 
		
				return "hello";
}

	@RequestMapping(value = "/bigu", method = RequestMethod.GET)
	
		public String bigu(Locale locale, Model model) {
		
		logger.info("Welcome home!.", locale);
		
		Date date = new Date();
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		model.addAttribute("fullName", "Meenu Bhagat" ); 
		
		
		
		return "bigu";
	}
	
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	
	public String test(Locale locale, Model model) {
		
			logger.info("Simple Date Format",locale);
			
			Date now = new Date();
	
			//DateFormat printFormatter = new SimpleDateFormat("MM/dd/yyyy");
			
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locale);
			
			//DateFormat anotherFormatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.getDefault());
			
			
			
			String formattedDate = dateFormat.format(now);
			
			
			model.addAttribute("serverTime", formattedDate);
			
			model.addAttribute("fullName", "Meenu Bhagat");
			
			return "bigu";
}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	
	public String user(Locale locale, Model model) {
		
	  logger.info("user page");
	  
	  return "user";
	  
	}

	
	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	
	public String saveUser(HttpServletRequest request, Locale locale, Model model) {
		
	  String username = "";
	  
	  try {
		  
	    username = ServletRequestUtils.getStringParameter(request, "username2");
	    
	  } catch (ServletRequestBindingException e) {
		  
	    
		  logger.info(e.getStackTrace().toString());
	  }
	  
	  logger.info("save user page {}", username);
	  
	  model.addAttribute("name", username );
	  
	  return "saveuser";
	}
	
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
	
	public String contact(Locale locale, Model model) {
		
	  logger.info("user page");
	  
	  return "contact";
	  
	}
    
@RequestMapping(value = "/savecontact", method = RequestMethod.POST)
	
	public String savecontact(HttpServletRequest request, Locale locale, Model model) {
		
	  String firstname = "";
	  String lastname = "";
	  String email = "";
	  String rd_1 = "";
	  String message = "";
	 
	  
	  try {
		  
	    firstname = ServletRequestUtils.getStringParameter(request, "firstname");
	    lastname = ServletRequestUtils.getStringParameter(request, "lastname");
	    email = ServletRequestUtils.getStringParameter(request, "email");
	    rd_1 = ServletRequestUtils.getStringParameter(request, "rd_1");
	    //rd_2 = ServletRequestUtils.getStringParameter(request, "rd_2");
	    //rd_3 = ServletRequestUtils.getStringParameter(request, "rd_3");
	    //rd_4 = ServletRequestUtils.getStringParameter(request, "rd_4");
	    message = ServletRequestUtils.getStringParameter(request, "message");
	    
	  } catch (ServletRequestBindingException e) {
		  
	    
		  logger.info(e.getStackTrace().toString());
	  }
	  
	  logger.info("save user page {}", firstname);
	  
	  model.addAttribute("name", firstname );
	  
      logger.info("save user page {}", lastname);
	  
	  model.addAttribute("name", lastname );
	  
	  logger.info("save user page {}", email);
	  
	  model.addAttribute("name", email );
	  
	  logger.info("save user page {}", rd_1);
	  
	  model.addAttribute("name", rd_1 );
	  
	  logger.info("save user page {}", rd_1);
	  
	  model.addAttribute("name", rd_1 );
	  
	  logger.info("save user page {}", rd_1);
	  
	  model.addAttribute("name", rd_1 );
	  
	  logger.info("save user page {}", rd_1);
	  
	  model.addAttribute("name", rd_1 );
	  
	  logger.info("save user page {}", message);
	  
	  model.addAttribute("name", message );
	  
	  return "savecontact";
	}

	}


