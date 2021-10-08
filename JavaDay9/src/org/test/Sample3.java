package org.test;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Sample3 {
	//Create a HashTable with the below key and values
    //Key    : vel,Ganesh,Dinesh,Vengat,subash
    //Values : Selenium,framework,oracle,corejava,jira

	public static void main(String[] args) {
		
		Map<String, String> m3 = new Hashtable<>();
		m3.put("vel", "Selenium");
		m3.put("Ganesh", "framework");
		m3.put("Dinesh", "oracle");
		m3.put("Vengat", "corejava");
		m3.put("subash", "jira");
		
		System.out.println(m3);//Random order
		
		        //print only "key" then we go for keyset
				Set<String> keySet = m3.keySet();
				System.out.println(keySet);
				
				//print only "value" then we go for keyset
				Collection<String> values = m3.values();
				System.out.println(values);
				
		for (String string : values) {
			
			System.out.println(string);
			
		}
		for (String key : keySet) {
			System.out.println(key);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
