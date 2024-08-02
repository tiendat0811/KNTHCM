// c. Cho một số nguyên dương, số nguyên đào ngược thu được bằng cách viết các chữ số theo thứ tự ngược lại. Nhập vảo một số nguyên dương, hãy tính hiệu của số nguyên này với số nguyên đảo ngược của
// Vị đụ: 113 - 311 =-198
// 4. Xem số vừa nhập là dãy các ký số khác nhau. Tim tất cả hoán vị có thể có của số dã nhập, mỗi hoán vị
// Ii mot cach sip xen cac ky so
// In kdt qua tht ca cac hoan vi, moi hoin vi la mot diay lay s6 ien tue nam cich mhau khoing tring.
// Vi du
// Nhập:
// Kết quả:
// 123
// -198
// (Caua)
// 123 132,213 231 312.321 (Cub)
// Chúý (để chấm tự động):
// ••
// Đầu vào chi nhận các sổ nguyên, không nhập thêm gì khác
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