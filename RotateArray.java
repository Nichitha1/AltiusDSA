import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //input array
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        //for storing array rotated;
        int rightRotation = input.nextInt();
        int[] updatedArr = new int[n];
        for(int i=0;i<n;i++){
            updatedArr[(i+rightRotation)%n]=arr[i];
        }
        for(int i : updatedArr) System.out.print(i+" ");
    }
}