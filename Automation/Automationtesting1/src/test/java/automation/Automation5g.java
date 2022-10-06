package automation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
public class Automation5g {

	
	public static void main(String[] args) {
		
		ArrayList values=new ArrayList();
		values.add("Shashank");
		values.add(10);
		values.add(33.22);
		Iterator i= values.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		 LinkedList<String> ll = new LinkedList<String>();
	        ll.add("Tieto");
	        ll.add("Evry");
	        ll.addLast("Bengaluru");  
	        System.out.println(ll);
	        
	        
	        Vector<Integer> v = new Vector<Integer>();
	  
	        for (int j = 1; j <= 5; j++) {
	            v.add(j);
	        }
	  
	       
	        System.out.println(v);
	  
	}
}
