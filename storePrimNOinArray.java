import java.util.*;

public class barchart {
    public static boolean isPrim(int n) {
        boolean isPrim=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrim=false;
                break;
            }
        }
        return isPrim;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int arr[]={1,2,3,9,23,44,66,17};
    for(int i=0;i<arr.length;i++){
        if(isPrim(arr[i])){
            System.out.println(arr[i]);
        }
    }
   
     
    }
}
