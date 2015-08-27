package hashmap;

import java.util.HashMap;



public class hashstuff {
	public HashMap <String, String> bffs = new HashMap <String, String>();
	public static void main(String[] args) {
		hashstuff hs = new hashstuff();
		hs.hashbrowns();
	}
	private void hashbrowns() {
		bffs.put("June", "Spock");
		bffs.remove("June");
		bffs.put("June", "Captain Kirk");
		System.out.println(bffs.get("Uhura"));
		
	}
	
	
}