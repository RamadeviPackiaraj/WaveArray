import java.util.Arrays;
import java.util.Scanner;
public class WaveSort_Naive_approach{
    public static void waveSort(int[]  arr){
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length-1;i+=2){
        swap(arr,i,i+1);
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