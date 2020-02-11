public class Family
{	
	int i;
	
	Family(int i)
	{
		this.i=i;
		System.out.println(i);
	}
	
	public static void main(String args[])
	{	
		Family fam = new Family(10);
		int i=20;
		
		System.out.println("");
		System.out.println(i);
	}
	
}
