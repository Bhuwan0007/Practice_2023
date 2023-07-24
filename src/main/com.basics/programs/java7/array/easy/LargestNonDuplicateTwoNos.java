package programs.java7.array.easy;

public class LargestNonDuplicateTwoNos {
    public static void main(String[] args) {
        int arr[] = {150, 4, 3, 150, 23, 90};
        int max1,max2;
        max2=max1=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max1){
                max2=max1;
                max1=arr[i];
            }else if(arr[i] > max2 && arr[i]!= max1){
                max2=arr[i];
            }
        }

        System.out.println("Max1 : "+max1+"\nMax2 : "+max2);
    }
}
