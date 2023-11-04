import java.util.*;

class MergeSort{

    static void MergeArr(int [] arr,int l,int r,int mid){
        int i=0;
        int j=0;
        int k=l;
        int n1=mid-l+1;
        int n2=r-mid;
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(i=0;i<n1;i++){
            arr1[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            arr2[j]=arr[mid+j+1];
        }
        i=0;
        j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
            }
            else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=arr2[j];
            j++;
            k++;
        }

    }

    static void Merge(int[] arr,int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            Merge(arr,l,mid);
            Merge(arr,mid+1,r);
            MergeArr(arr, l, r,mid);
        }
    }

    static void display(int[] arr,int n){
        int i;
        System.out.println(":Array:");
        for(i=0;i<n;i++){
            System.out.println(arr[i] +" ");
        }
    }
    public static void main(String args[]){
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr = new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        Merge(arr,0,n-1);
        display(arr, n);
    }
}
