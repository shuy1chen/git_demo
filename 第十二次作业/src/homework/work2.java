package homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class work2 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Map<String,student>students =new HashMap<String,student>();
		while(true) {
			String strid =in.next();
			if(strid.equals("exit")) break;
			String strname =in.next();
			String stryear =in.next();
			int year =Integer.parseInt(stryear);
			student s =new student(strid,strname,year);
			students.put(stryear, s);
		}
		Set set =students.keySet();
		Object[] arr = set.toArray();
		Arrays.sort(arr);
	
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("forum.txt",true));
			for(Object key:arr) {
				
				out.write(((student)(students.get(key))).id+" "+((student)(students.get(key))).name+" "+((student)(students.get(key))).year);
				out.newLine();
				
			}
			out.close();
		}catch(IOException e) {}
	}
}
class student{
	public String id;
	public String name;
	public int year;
	public student(String id,String name,int year) {
		this.id =id;
		this.name =name;
		this.year =year;
		
	}
	
}