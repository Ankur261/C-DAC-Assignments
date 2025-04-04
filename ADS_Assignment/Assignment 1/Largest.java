import java.util.Arrays;
class Largest{
	public static void main(String[] args){
		int arr[]={10, 0, 5, 20, 0, 8, 15};
		int max=0;
		int max2=0;
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		//System.out.println("largest:"+max);
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]>max2 && arr[i]<max)
			{
				max2=arr[i];
			}
		}
		
		System.out.println("Second Largest number is: "+max2);
		int n = arr.length;
        int index = 0;  // Position to place non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
		System.out.println(Arrays.toString(arr));
		
	}
}