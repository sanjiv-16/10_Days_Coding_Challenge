package ProductManagementSystem_Day02;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
	ProductServices service=new ProductServices();
	
	service.addproduct(new Products("lenovo ideapad","laptop","Bedroom table",2022));
	service.addproduct(new Products("realme techlife","earphones","Bedroom cart",2025));
	service.addproduct(new Products("redmi note 10 pro","mobile","TV table",2026));
	
	
	/*service.printallproducts();
	System.out.println(" ...........................................................");
	System.out.println(" To Print Particular product...............");
	service.printproduct("realme techlife");
	List<Products> data = service.getproductwithtext("Bedroom");
	data.forEach((n)-> System.out.println(n));*/
	
	
	
	// to implement STREAM API
	
	List<Products> data1=service.getbyplace("TV table");
	data1.forEach((n)-> System.out.println(n));
	
	/*Year thisYear=Year.now();
	System.out.println(thisYear);*/
	
	// to find warrent expired
	List<Products> data2=service.findwarexp();
	data2.forEach((n)-> System.out.println(n));
	
	
	}
}
