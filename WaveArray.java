import java.util.Arrays;
import java.util.Scanner;
public class WaveArray{
    public static void WaveSort(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Length:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter Array Elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    WaveSort(arr);
    System.out.println("The converted Wave Array:"+Arrays.toString(arr));
    sc.close();
    
}
}