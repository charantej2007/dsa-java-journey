package Array;
import java.util.Scanner;
public class Presum {
    public static void main(String[] args){
        int [] arr={5,6,8,3,35,6,8};
        int [] presum = new int[arr.length];
        presum[0] = arr[0];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the left index value : ");
        int L = sc.nextInt();

        System.out.print("Enter the right index value : ");
        int R=sc.nextInt();

        for(int i=1 ; i< arr.length ; i++){
            presum[i] = presum[i-1]+arr[i];
        }

        if (L==0){
            System.out.println("The required sum = " + presum[R]);
        }
        else{
            System.out.println("The required sum = "+ (presum[R] - presum[L-1]));
        }
        sc.close();
    }
    
}
