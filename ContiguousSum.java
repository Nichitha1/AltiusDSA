import java.util.*;
class solution{
    //kadanes algorithm
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //array as input
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        int max = Integer.MIN_VALUE,sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum<0)   sum=0;
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
}