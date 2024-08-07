import java.util.*;
class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        int k = input.nextInt();
        k%=n;
        //for (int i = 0; i < n ;i++) {
            reverseArray(arr,0,n-1);
            reverseArray(arr,0,k-1);
            reverseArray(arr,k,n-1);
      //  }
        for(int i : arr)    System.out.print(i + " ");
    }
    public static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}