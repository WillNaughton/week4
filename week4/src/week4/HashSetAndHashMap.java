package week4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetAndHashMap {
	
	public static void main(String[] args) {

		
		
		}
	public static void hashSet() {
		Set<String> furnitureInMyBedroom = new HashSet<String>();	

		furnitureInMyBedroom.add("Couch");
		furnitureInMyBedroom.add("Loft Bed");
		furnitureInMyBedroom.add("Selving Unit");
		furnitureInMyBedroom.add("Gaming Desk");
		furnitureInMyBedroom.add("Computer Desk");
		
	}
	public static void hashMap() {
		Map<String, String> processorsInMyBedroom = new HashMap<String, String>();

		processorsInMyBedroom.put("A8 2.8 Ghz Quad", "The processor in my gaming pc");
		processorsInMyBedroom.put("I7 3700 Quad", "processor to sell");
		processorsInMyBedroom.put("Core 2 Duo", "in motherbourds that i striped from cases");
	}
		}
