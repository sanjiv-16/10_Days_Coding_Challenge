package ProductManagementSystem_Day02;

import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductServices {
	
	List<Products> Product=new ArrayList<Products>();
	
	public void addproduct(Products p) {
		Product.add(p);
		
	}
	public void printallproducts(){
	     for(Products p:Product) {
	    	 System.out.println(p);
	    	 
	     }
		
	}
	public void printproduct(String name) {
		for(Products p:Product) {
			if(p.getName().equals(name)) {
	    	 System.out.println(p);
			}
	     }
		
	}
	public List<Products> getproductwithtext(String text){
		List<Products> temp=new ArrayList<Products>();
		for(Products n:Product) {
			if(n.getName().toLowerCase().contains(text.toLowerCase())  || n.getType().toLowerCase().contains(text.toLowerCase()) || n.getPlace().toLowerCase().contains(text.toLowerCase())  ) {
				temp.add(n);
			}
		}
		return temp;
	}
	
	// Concept of Steam API to find Place Equals
	// *****************************************************************************************************
	
	public List<Products> getbyplace(String plc) {
		List<Products> pd=Product.stream().filter((ab) -> plc.equals(ab.getPlace())).collect(Collectors.toList());
		return pd;
	}
	
   // *****************************************************************************************************
     
	public List<Products> findwarexp(){
		Calendar cal=Calendar.getInstance();
		int thisYear=cal.get(Calendar.YEAR);
		List<Products> pd=Product.stream().filter((war) -> thisYear>=(war.getWarrenty())).collect(Collectors.toList());
		return pd;
	}
	 // *****************************************************************************************************
	
	
	
	
	
}
