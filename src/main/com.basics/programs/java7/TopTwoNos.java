package programs.java7;

public class TopTwoNos {
    public static void main(String[] args) {
        int[] nos = {34,67,12,56,98,75,25,46,39,84,4};

        int big1=0,big2=0;
        for(int i : nos){
            if(nos[i]>nos[i+1]){
                big1 = nos[i];
            }else{
                big2 = nos[i++];
            }
        }
        System.out.println(big1 + " : "+big2);
    }
}
