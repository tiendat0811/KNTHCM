
// Câu 3. (2.5 điểm) Tên file chương trình: cau3.*
// c . Cho một số nguyên dương, số nguyên đảo ngược thu được bằng cách viết các chữ số theo thứ tự ngược lại. 
// Nhập vào một số nguyên dương, hãy tính hiệu của số nguyên này với số nguyên đảo ngược của nó.
// Vi du: 113-311 = 198
// A. Xem số vừa nhập là dãy các ký số khác nhau. Tim tất cả hoán vị có thể có của số đã nhập, mỗi hoán vị là một cách sắp xếp các ký số
// In kết quả tất cả các hoán vị, mỗi hoán vị là một dãy ký số liên tục nằm cách nhau khoảng trắng.
// Vi du:
// Nhập: 123
// Kết quả: -198 (Câu a)
// 123 132 213 231 312 321 (Câu b)
import java.util.*;

public class cau3{
    public static void timHoanVi(String str, String prefix, Set<String> permutations){
        if(str.length() == 0){
            permutations.add(prefix);
        }else{
            for(int i = 0; i < str.length(); i++){
                String rem = str.substring(0, i) + str.substring(i + 1);
                timHoanVi(rem, prefix + str.charAt(i), permutations);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Cau a
        System.out.println("Input a integer number: ");
        int n = sc.nextInt();
        String nStr = Integer.toString(n);
        String reversedStr = new StringBuilder(nStr).reverse().toString();
        int reversedNum = Integer.parseInt(reversedStr);
        int result = n - reversedNum;
        System.out.println(result);

        // Cau b
        Set<String> permutations = new HashSet<>();
        timHoanVi(nStr, "", permutations);
        String resultB = "";
        for(String permutation : permutations){
            resultB += permutation + " ";
        }
        System.out.println(resultB);
    }
}