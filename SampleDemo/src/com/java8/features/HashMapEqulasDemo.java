package com.java8.features;

import java.util.HashMap;

public class HashMapEqulasDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map1 = new HashMap<>();
		
		map1.put("ifIndex", "369098903");
		map1.put("__contextName", "Fabric Interconnect B");
		map1.put("fabInc", "B");
		map1.put("lagGN", "152");
		map1.put("dcKey", "vdcName=Fabric Interconnect B;port-channel=152");
		
		
		HashMap<String, String> map2 = new HashMap<>();
		
		map2.put("ifIndex", "369098903");
		map2.put("fabInc", "B");
		map2.put("__contextName", "Fabric Interconnect B");
		map2.put("lagGN", "152");
		map2.put("dcKey", "vdcName=Fabric Interconnect B;port-channel=152");
		
		
		System.out.println(map1.equals(map2));
		System.out.println(map1.toString());
		System.out.println(map2.toString());
		
	}

}
