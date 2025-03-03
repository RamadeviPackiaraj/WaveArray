import java.util.Arrays;
import java.util.Scanner;
public class WaveSortOptimized{
    public static void waveSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i+=2){
            //if Privious element is greated swap
            if(i>0&&arr[i-1]>arr[i]){
                swap(arr,i-1,i);
            }
            //if the next Element is greater
            if(i<n-1&&arr[i+1]>arr[i]){
                swap(arr,i,i+1);
                
            }
        } }
    private static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int n=sc.nextInt();
        System.out.println("Enter the Array Elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        waveSort(arr);
        System.out.println("Wave From Array:"+Arrays.toString(arr));
        sc.close();
    }
}