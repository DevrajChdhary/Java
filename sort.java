import java.util.*;   

public class sort{
	public static void Bubblesort(int[] arr,int n){
	int flag=0;
	for(int i=0;i<n-1;i++){
		flag=0;
		for(int j=0;j<n-i-1;j++){
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0){
		 break;
		}
		
	}
		for(int i=0;i<n;i++){
		System.out.print(" "+arr[i]);
		}
	}
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Size of array:");
		int n=obj.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=obj.nextInt();
		}
		Bubblesort(arr,n);
		
	}
}
