package programs.java7.array.easy;

public class MoveAllZerosEndOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0, 9, 7, 0, 8, 6};
        // Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
        int len = arr.length;
        int[] newArry = new int[len] ;
        int j=0;
        int k=len;
        for(int i=0; i<len; i++){
            if(arr[i]==0){
                newArry[k-1]=arr[i];
                k--;
            }else{
                newArry[j]=arr[i];
                j++;
            }
        }
        for(int l : newArry){
            System.out.print(l+" ");
        }
    }
}
