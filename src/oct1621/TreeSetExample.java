package oct1621;

import java.util.TreeSet;

public class TreeSetExample {
public static void main(String[] args){
		
		//TreeSet<String> hs=new TreeSet<String>();
		TreeSet ts= new TreeSet();
		
		ts.add("d");
		ts.add("c");
		ts.add("b");
		ts.add("a");
		ts.add(1);
		ts.add(true);
		ts.add("c");
		ts.add(1.87);
		ts.add("i");
		ts.add('C');
		ts.add("l");
				
		System.out.println("TreeSet is "+ts);
		System.out.println("Size of TreeSet is "+ ts.size());
		
		System.out.println("Does TreeSet contains this 'u' element  " + ts.contains("u"));		
		System.out.println("is TreeSet empty  " + ts.isEmpty());
		System.out.println("remove the element "+ts.remove("i"));
		
	    ts.clear();
	    System.out.println("get class  " +ts.getClass());
		
	    System.out.println("is TreeSet empty  " +ts.isEmpty());
	    
	    
		
	}

}
