package com.bank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
@Service
public class ReadCSVFile {
	public void getCSVData(Map<String,Record> records, List<Record> failRec) {
		
		
		String pathToCsv = "records.csv";
		String row = "";
		BufferedReader csvReader = null;
		try {

			Resource resource = new ClassPathResource("records.csv");
			File fcsvFile = resource.getFile();
			csvReader = new BufferedReader(new FileReader(fcsvFile));
			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(",");
				Record record = new Record();
				if (!"reference".equalsIgnoreCase(data[0])) {
					System.out.println(data[0] + "\t" + data[5]);
					
						record.setReference(data[0]);
						record.setAccountNumber(data[1]);
						record.setDescription(data[2]);
						record.setStartBalance(data[3]);
						record.setMutation(data[4]);
						record.setEndBalance(data[5]);
						
					//failed records condition
					if(record.getEndBalance().contains("-")) {
						failRec.add(record);
					}
					
					if(records.containsKey(record.getReference())) {
						failRec.add(record);
					}else {
						records.put(record.getReference(), record);
					}
				}
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			csvReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
