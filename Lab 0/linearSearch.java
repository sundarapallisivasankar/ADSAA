import java.util.Scanner;
public class linearSearch{
	static int Search(int[]a ,int key){
		for(int i=0;i<a.length;i++){
			if(a[i]==key)
				return i;
		}
		return -1;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements");
		for (int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key to search");
		int key=sc.nextInt();
		int pos=Search(arr,key);
		if(pos==-1){
			System.out.println("Key is not found");
		}
		else
			System.out.println("Key is found at index :"+pos);
	}
}
