package com.practive.pk;


import java.net.MalformedURLException;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FamilyTree_SubscriptionController {

	private static final Logger logger = LogManager.getLogger(FamilyTree_SubscriptionController.class);

	
	@RequestMapping(method = RequestMethod.GET, value = "/hello/{name}")
	public String startsubscriptionprocess(@PathVariable String name)
			throws MalformedURLException {
		String message="Hello "+name +"\t Time\t:"+new Date();
		System.out.println(message);

	
		return message;

	}

}
