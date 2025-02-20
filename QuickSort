import java.util.Scanner;
public class Quick{
	 public static int partition(int[] a,int low,int high){
	 	int pivot=a[low];
	 	int i =low+1;
	 	int j=high;
	 	while(i<=j){
	 		while(i<=j && a[i]<= pivot)
	 			i++;
	 		while(i<=j && a[j]>= pivot)
	 			j--;
	 		if(i<j)
	 			interchange(a,i,j);
	 	}
	 	interchange(a,low,j);
	 	return j;
	 }
	 public static void interchange(int[] a,int i, int j){
	 	int temp=a[i];
	 	a[i]=a[j];
	 	a[j]=temp;
	 }
	 public static void quickSort(int[] a,int low, int high){
	 	if(low<high){
	 		int j= partition(a,low,high);
	 		quickSort(a,low,j-1);
	 		quickSort(a,j+1,high); 
	 	}
	 }
	 public static void main(String[] args){
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter the number of elements of the array: ");
	 	int n=sc.nextInt();
	 	System.out.println("Enter the elements in the array: ");
	 	int [] array=new int[n];
	 	for(int i=0;i<n;i++){
	 		array[i]=sc.nextInt();
	 	}
	 	quickSort(array,0,array.length-1);
	 	System.out.println("Sorted Array: ");
	 	for(int num: array){
	 		System.out.println(num +"");
	 	}
	 	sc.close();
	 }
}
