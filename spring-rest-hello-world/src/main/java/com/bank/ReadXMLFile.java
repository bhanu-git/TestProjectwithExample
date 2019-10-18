package com.bank;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@Service
public class ReadXMLFile {

	public void  getXmlData(Map<String,Record> map,List<Record> records){
		try {
			Resource resource = new ClassPathResource("records.xml");

			File fXmlFile = resource.getFile();
			
			//String pathToXml = "records.xml";
			//File fXmlFile = new File(pathToXml);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("record");

			System.out.println("----------------------------");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				//System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					Record record = new Record();
					record.setReference(eElement.getAttribute("reference"));
					record.setMutation(eElement.getElementsByTagName("mutation").item(0).getTextContent());
					record.setEndBalance(eElement.getElementsByTagName("endBalance").item(0).getTextContent());
					record.setDescription(eElement.getElementsByTagName("description").item(0).getTextContent());
					record.setAccountNumber(eElement.getElementsByTagName("accountNumber").item(0).getTextContent());
					record.setStartBalance(eElement.getElementsByTagName("startBalance").item(0).getTextContent());
					
					//failed records condition
					if(record.getEndBalance().contains("-")){
						records.add(record);
					}
					//Failed transaction details if the same reference is existed.
					if(map.containsKey(record.getReference())) {
						records.add(record);
					}else {
						map.put(record.getReference(), record);
					}
					
					
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
