package programs.java7.array.easy;

public class ReverseStringArray {
    public static void main(String[] args) {
        String str = "Geeks";
        /*First way using for-loop*/

        /*for(int i=str.length()-1; i>=0; i--){
            System.out.println(str.charAt(i));
        }*/

        /*Second way using while loop*/
        char[] c = str.toCharArray();
        int first=0;
        int last=c.length-1;
        while(first<=last){
            char temp = c[first];
            c[first] = c[last];
            c[last] = temp;
            first++;
            last--;
        }
        String newStr = new String(c);
        System.out.println(newStr);
    }
}
