import java.util.*;
public class timtu{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String[] strArr = input.split(" ");
        String min = strArr[0];
        String max = strArr[0];
        for(int i = 0; i < strArr.length; i++){
            if(max.length() < strArr[i].length()){
                max = strArr[i];
            }
            if(min.length() >= strArr[i].length()){
                min = strArr[i];
            }
        }
        System.out.println(min + " "+ max);
    }
}