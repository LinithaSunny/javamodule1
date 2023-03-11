package listdemo;
import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String,String> countryCur = new HashMap<>();
		
		countryCur.put("IND","Rupe");
		countryCur.put("USA","dollar");
		countryCur.put("UK","Pound");
		countryCur.put(null, null);
		
		System.out.println(countryCur);
		
		System.out.println(countryCur.get("IND"));
		
		countryCur.put("IND", "Rupee");
		System.out.println(countryCur.size());
		System.out.println(countryCur.containsKey("UK"));
		System.out.println(countryCur.containsValue("dollar"));
		
		//HashMap has 3 views
				//1. key view
				
				HashMap<String, String> countryCurr;
				Set<String> keys = countryCurr.keySet();
				for(String key : keys) {
					System.out.println(key);
				}
				
				//2. values view
				
				Collection<String> values = countryCurr.values();
				for(String value: values) {
					
					System.out.println(value);
				}
				
				//3. key-values together - EntrySet
				
       			Set<Entry<String,String>> entries = countryCurr.entrySet();
				for(Entry<String,String> entry: entries) {
					
					System.out.println(entry);
				}		
			}

		


		
		
	}


