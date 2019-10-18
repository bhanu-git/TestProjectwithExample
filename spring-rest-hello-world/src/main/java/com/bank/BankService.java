package com.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

	
	@Autowired
	private ReadXMLFile readXMLFile;

	@Autowired
	private ReadCSVFile readCSVFile;
	
	List<Record> getFailBankDetails(){
		List<Record> failedRecords = new ArrayList<>();
		Map<String,Record> totalRecords = new HashMap<>();
		
		readXMLFile.getXmlData(totalRecords,failedRecords);
		readCSVFile.getCSVData(totalRecords,failedRecords);
		return failedRecords;
	}
}
