package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import model.Client;
import model.Contact;
import model.Employee;

public class MapTester {

	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "One");
//		map.put(2, "Two");
//		map.put(3, "Three");
//
//		map.size();
//		if (map.containsValue(new String("Three"))) {
//			System.out.println("Contains");
//		}
//		//Set<Integer> setOfKey = map.keySet();
//		
//		for(Map.Entry<Integer, String> entry:map.entrySet()) {
//			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
//			
//		}
		
Map<Employee, List<Client>> data = new HashMap<>();
        
        // -------------- E 1 ---------------------
        Set<Contact> contacts1 = new HashSet<>();
        contacts1.add(new Contact(50, "Bob", "Ivanov", "+37526255458", 
                Arrays.asList("+375135435", "+375135432345"), "Test", "Minsk"));
        
        contacts1.add(new Contact(55, "Alex", "Ivanov", "+37526255458", 
                Arrays.asList("+375135435", "+375135432345"), "Test", "Minsk"));
        
        contacts1.add(new Contact(58, "Mike", "Ivanov", "+37526255458", 
                Arrays.asList("+375135435", "+375135432345"), "Test", "Minsk"));
        
        Employee e1 = new Employee(100, 25, "John", "Johnson", "EPAM",
                "Developer", 3000, contacts1);
        
        // -------------- E 2 ---------------------
        Employee e2 = new Employee(100, 25, "Сергей", "Иванов", "EPAM",
                "Developer", 2000, contacts1);
        
        
        List<Client> clients1 = Arrays.asList(new Client(500,22, "Анна", "")
                ,new Client(500,22, "Анна", "")
                ,new Client(501,22, "Анна", "")
                ,new Client(502,22, "Анна", "")
                ,new Client(504,22, "Анна", ""));
        
        List<Client> clients2 = Arrays.asList(new Client(500,22, "Анна", "")
                ,new Client(500,22, "Павел", "Л")
                ,new Client(501,22, "Сергей", "П")
                ,new Client(502,22, "Галина", "В")
                ,new Client(504,22, "Таня", "Н"));
         
        System.out.println(" ----------------------------  ");
        
        
          
        data.put(e1, clients1);
        data.put(e2, clients2);
        
        for (Entry<Employee, List<Client>> client : data.entrySet()) {
			System.out.println(client.getKey());
			System.out.println("    "+client.getValue());
		}
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        Iterator<Entry<Employee, List<Client>>> iter=data.entrySet().iterator();
        while(iter.hasNext()) {
        	Entry<Employee, List<Client>>client=iter.next();
        	System.out.println(client.getKey());
			System.out.println("    "+client.getValue());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        for(Employee key:data.keySet()) {
        	System.out.println("Key is "+key);
        	System.out.println("	Value is "+data.get(key));
        }
	}

}
