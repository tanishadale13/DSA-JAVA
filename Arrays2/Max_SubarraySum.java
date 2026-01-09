//Brute Force Approach, Time Complexity: O(n^3)
import java.util.*;
public class Max_SubarraySum{
    public static void BruteForce(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum=currSum+arr[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }

        }
        System.out.println("Max_SubarraySum is "+maxSum);

    }
    public static void main(String args[]){
    int arr[]={1,-2,6,-1,3};
    BruteForce(arr);
    }
}