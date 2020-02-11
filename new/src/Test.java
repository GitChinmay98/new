//import com.sun.java_cup.internal.runtime.Scanner;
import java.util.*;
public class Test{
//?//	System.out.println("2nd");
//	String i2=sc.nextLine();	
//System.out.println(i1);
	//System.out.println(i2);
	/*	cot1 += i;
		i++;  
		if (cot1 > 5) 
			break; 
	} while (i<1); 
	}*/
	public static void main(String[] args)
	{
/*		Test t = new Test();
		System.out.println(t.cot1);
		
	*/	List l=new ArrayList();
		//l.add(e);
		Abc a1=new Abc();
		a1.fun();
	}
	
	
}

class Abc{
	void fun() {
		ArrayList l = new ArrayList();
		l.add("sjdhgkjshgs");
		l.add(6);
		
		Iterator i = l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}