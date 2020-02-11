package Try;
import java.util.*;


public class App {

	public static void main(String[] args) {
		Contact c = new Contact();
		Phonebook p = new Phonebook();
		Scanner sc = new Scanner(System.in);
		String en,em;
		int a;
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter name");
			en=sc.next();
			System.out.println("Enter email");
			em=sc.next();
			System.out.println("Enter no");
			a=sc.nextInt();
		
		c.setEmail(em);
		c.setName(en);
		c.setNumber(a);
		p.add(c);
		}
		p.display();
	}
}
