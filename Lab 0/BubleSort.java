import java.util.Scanner;
public class bublesort{
	static void bublesort(int[]a){
		int n=a.length;
		for(int i=0;i<n-1;i++){
			for (int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
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
		bublesort(arr);
		System.out.println("Elements after sorting:");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}	
	}
	
}
