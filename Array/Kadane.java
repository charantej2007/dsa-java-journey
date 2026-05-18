package Array;

public class Kadane {
    public static void main(String[] args){
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        int maxsum=arr[0];
        int current = arr[0];
        
        for ( int i=0 ; i< arr.length; i++){
            current = Math.max(arr[i],current+arr[i]);
            maxsum=Math.max(current,maxsum);
        }
        System.out.println("The maxsum of Subarray is :"+ maxsum);
    }
    
}
