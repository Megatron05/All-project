package org.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample {
	//Description : Create a HashMap with the below key and values
    //key    : 10,20,30,40,50,60,10,50,40
   // values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.
	
public static void main(String[] args) {
	

		
		Map<Integer,String> m = new HashMap<Integer, String>();
		
		m.put(20, "java");
		m.put(90, "sql");
		m.put(30, "oops");
		m.put(40, "Sql");
		m.put(50, "Oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");
		m.put(20, "tamil");
		
		System.out.println(m);
		for (int i = 0; i < m.size(); i++) {
			
			String string = m.get(i);
			System.out.println(string);
			
			
		}//Printing in random order and Duplicate item elimenated.
		
		//print only "key" then we go for keyset
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		//print only "value" then we go for keyset
		Collection<String> values = m.values();
		System.out.println(values);
		
		
		for (String string : values) {
			
			System.out.println(string);
			
		}
		for (Integer key : keySet) {
			System.out.println(key);
			
			
		}
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		System.out.println("********************************************************");
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			
			
		}
	}
		
		
		
		
	 
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

