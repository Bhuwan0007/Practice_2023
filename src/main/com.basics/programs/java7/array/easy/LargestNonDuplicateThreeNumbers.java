package programs.java7.array.easy;

public class LargestNonDuplicateThreeNumbers {
    public static void main(String[] args) {
        int arr[] = {90, 4, 3, 50, 23, 90};
        // Output: 90, 50, 23

        int max1,max2,max3;
        max3=max2=max1=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }else if(arr[i] > max2 && arr[i] !=max1){
                max3=max2;
                max2=arr[i];
            }else if(arr[i] > max3 && arr[i] !=max2 && arr[i] !=max1){
                max3=arr[i];
            }
        }
        System.out.println("Max1 : "+max1+"\nMax2 : "+max2+"\nMax3 : "+max3);
    }
}
