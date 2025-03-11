import java.util.Scanner;
class Find&Display{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in)
		int a[] = new int[20]; 
		int even= new int[20];
		int odd= new int[20];
		int mult[]= new int[20];
		int evencount=0;
		int oddcount=0;
		int multcount=0
		for(int i=0;i<20;i++)
		{
			System.out.println("Enter the number");
			a[i]=input.nextInt();
		}
		
		for(int i=0;i<20;i++)
		{
			if((a[i]%2)==0)
			{
				evencount++;
			}
			else
			{
				oddcount++
			}
			mult=((a[i]%2)==0)?mult++:mult;
		}
		System.out.println("There are "+evencount+" even numbers They are");
		for(int x:even)
		{
			System.out.print(a+" ");
		}
		System.out.println("There are "+oddcount+" odd numbers They are");
		for(int x:odd)
		{
			System.out.print(a+" ");
		}
		System.out.println("There are "+multcountcount+" mutiple of 3 They are");
		for(int x:mult)
		{
			System.out.print(a+" ");
		}
	}
	
}