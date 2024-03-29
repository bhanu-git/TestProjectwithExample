package com.bank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@Autowired
	private BankService bankservice;
	
	List<Record> failedRecords = new ArrayList<>();
	@RequestMapping(value = "/getDetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	List<Record> getBankDetails() {
			
		return bankservice.getFailBankDetails();
	}

}
