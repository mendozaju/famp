package com.famp.controlers.home;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeControler {

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value = "/home")
	public String getIndex() {
		return "home";
	}

}
