import java.util.*;

public class BinarySearch{
    static void binarySearch(int arr[], int n, int target){
        int l=0, r=n-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==target){
                System.out.println("Found at index: "+(mid+1));
                return;
            }
            else if(target>arr[mid])
                l=mid+1;
            else
                r=mid-1;
        }
        System.out.println("Not found");
    }
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int target = sc.nextInt();

        binarySearch(arr, n, target);
        sc.close();
    }
}

