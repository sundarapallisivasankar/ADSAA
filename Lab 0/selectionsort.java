import java.util.Scanner;
public class selectionsort{
	static void selectionsort(int []a){
		int n=a.length;
		for(int i=0;i<n-1;i++){
			int minpos=i;
			for(int j=i+1;j<n;j++){
				if(a[j]<a[minpos]){
					minpos=j;
				}
			}
			int temp=a[minpos];
			a[minpos]=a[i];
			a[i]=temp;
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
		selectionsort(arr);
		System.out.println("Elements after sorting:");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}	
	}
}
