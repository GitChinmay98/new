package Try;


public class Phonebook {
	int count=0;
	Contact arr[]= new Contact[999];

	public void add(Contact c) {
		// TODO Auto-generated method stub
		arr[count++]=c;
		
	}

	public void display() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<count;i++)
		{
			System.out.println(arr[i].getName());
			System.out.println(arr[i].getEmail());
			System.out.println(arr[i].getNumber());
			
		}
	}
	

}
