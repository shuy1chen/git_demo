package homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class work1 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Map<String,book>books =new HashMap<String,book>();
		while(true) {
			String strid =in.next();
			//System.out.println(strid);
			if(strid.equals("q")) break;
			String strname =in.next();
			String strprice =in.next();
			String firm =in.next();
			books.put(strid, new book(strid,strname,strprice,firm));
		}
		Iterator iter =books.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry entry =(Map.Entry)iter.next();
			System.out.println(((book)entry.getValue()).id+" "+((book)entry.getValue()).name+" "+((book)entry.getValue()).price+" "+((book)entry.getValue()).firm);
		}
	}
}
class book{
	public String id;
	public String name;
	public String price;
	public String firm;
	public book(String id,String name,String price,String firm) {
		this.id =id;
		this.name =name;
		this.price =price;
		this.firm =firm;
	}
	
}