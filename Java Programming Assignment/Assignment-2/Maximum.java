class Maximum{
	public static void main(String args[]){
		int a[]= { 2, 3, 5, 7, -7, 5, 8, -5 };
		int max=0;
		int max2=0;
		for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max2 = max; 
                max = a[i];
            } else if (a[i] > max2 && a[i] < max) {
                max2 = a[i]; 
            }
        }
		int MaxProduct=max*max2;
		System.out.println("Product of "+max+" and "+max2+" is "+ MaxProduct);
	}
}