import java.util.Scanner;
public class insertionSort{
	static void Sort(int []a){
		int n=a.length;
		 for (int i = 1; i < n; i++) {
           	 	int key = a[i];
           	 	int j = i - 1;
           	 	while (j >= 0 && a[j] > key) {
               	 		a[j + 1] = a[j];  
                		j = j - 1;
            		}
            	a[j + 1] = key;  
        	}    	
	}	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Sort(arr);
		System.out.println("Elements after sorting:");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}	
	}
}
