class Recursive{
	static boolean isPrime(int n, int i){
		if(i==1)
		{
			return true;
		}
		if(n%i==0)
		{
			return false;
		}
		
		return isPrime(n,i-1);
    }
	
	static boolean isPalindrome(String str){
		int n = str.length();
		if (n == 0)
			return true;
		return isPalRec(str, 0, n - 1);
	}
		
	static boolean isPalRec(String str, int s, int e){
		if (s == e)
		{
			return true;
		}
		if ((str.charAt(s)) != (str.charAt(e))){
			return false;
		}
		if (s < e + 1){
			return isPalRec(str, s + 1, e - 1);
		}
		return true;
	}
		
	static int SumDigit(int n){
		if(n==0){
			return 0;
		}
		return(n%10+ SumDigit(n/10));
	}
	
	static int Fibonacci(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
		    return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
	
	static int power(int a, int b){
		if(b==0){
			return 1;
		}
		return a*power(a,b-1);
		
	}
	
	public static void main(String[] args){
		int num = 7;
		int n=1234;
		String str = "racecar" ;
		int index=6;
		int a=2;
		int b=5;
		
		System.out.println("Is prime: "+ isPrime(num, 2));
        System.out.println("Is 'racecar' a palindrome? "+isPalindrome(str));
		System.out.println("Sum of digits of 1234: "+ SumDigit(n));
		System.out.println("Fibonacci(6): "+Fibonacci(6));
		System.out.println("2^5= "+power(a,b));
	}
}