class SubArray{
	public static void main(String args[]){
		int a[]= {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
		
		for (int start = 0; start < a.length; start++) 
		{
            int sum = 0;
            for (int end = start; end < a.length; end++) 
			{
                sum += a[end];
                if (sum == 0) 
				{
                    System.out.print("[");
					for (int i = start; i <= end; i++) 
					{
						System.out.print(a[i]);
						if (i < end) 
						{
							System.out.print(", ");
						}
					}
					System.out.println("]");
                }
            }
        }
	}
}