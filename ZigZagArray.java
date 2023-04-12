import java.util.*;

public class ZigZagArray{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int i;
		int[] a=new int[n];
		for(i=0;i<n;i++){
		  a[i]=obj.nextInt();
		}
		Arrays.sort(a);
		for(i=1;i<n-1;){
		 int temp=a[i];
		 a[i]=a[i+1];
		 a[i+1]=temp;
		 i+=2;  		
		 }
		for(i=0;i<n;i++){
		 System.out.print(a[i]+" ");
		}
	}
}
