package programs.java7.array.easy;

public class RearrangeArrayEvenBigOddSmall {
    public static void main(String[] args) {
        /*Rearrange array such that even positioned are greater than odd*/
        int A[] = {1, 2, 2, 1, 4, 3, 8, 7, 9, 10};     // Output :  1 2 1 2
        int len = A.length;
        int B[] = new int[len];
        int j=1;
        for(int i=0; i<len; i+=2){
            if(A[i] > A[j]){
                B[j]=A[i];
                B[i]=A[j];
                j+=2;
            }else{
                B[i]=A[i];
                B[j]=A[j];
                j+=2;
            }
        }
        for(int k : B){
            System.out.print(k+" ");
        }
    }
}
