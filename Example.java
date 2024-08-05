import java.util.*;

public class Example{
    public static boolean SoNguyenTo(int n){
        int count = 0;
        if(n <= 1 ){
            return false;
        }
        for(int i = 2 ; i < n; i++ ){
            if(n % i == 0){
                count++;
                break;
            }
        }
        if(count != 0){
            return false;
        }else{
            return true;
        }
    }

    public static int DemSoKhacNhau(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int element : arr) {
            set.add(element);
        } 

        return set.size();
    }

    public static int TimUocChungLonNhat(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int TimBoiChungNhoNhat(int a, int b){
        return (a*b)/TimUocChungLonNhat(a, b);
    }

    public static void TimHoanVi(String str, String prefix, Set<String> permutations){
        if(str.length() == 0){
            permutations.add(prefix);
        }else{
            for(int i = 0; i < str.length(); i++){
                String rem = str.substring(0, i) + str.substring(i + 1);
                System.out.println("STR: " + str + " --- REM: "+ rem);
                TimHoanVi(rem, prefix + str.charAt(i), permutations); 
            }
        }
    }

    public static void main(String args[]){
        System.out.println(SoNguyenTo(10));

        System.out.println(DemSoKhacNhau(new int[]{1,2,2,3,3}));

        System.out.println(TimUocChungLonNhat(30, 48));

        System.out.println(TimBoiChungNhoNhat(30,48));

        Set<String> set = new HashSet<>();
        TimHoanVi("123", "", set);
        for(String i : set){
            System.out.println(i);
        }
    }
} 