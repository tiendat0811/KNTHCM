// Viết chương trình nhập vào một số nguyên dương N (0 <=N <=1000), và tiếp theo là dãy số gồm N số nguyên từ bàn phím (theo đúng thứ tự).
// Dem so luong s6 khic nhau co trong mang.
// In kết quả, là một số nguyên duy nhất, là sổ lượng số khác nhau tìm được.
import java.util.*;

public class cau1 {
    public static void main(String args[]){
        // input 0 <= n <= 1000
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: (0 <= n <= 1000)");
        int n = sc.nextInt();
        if(0 <= n && n <= 1000){
            int[] arr = new int[n];
            for(int i = 0; i < n; i ++){
                System.out.println("Enter number of array:");
                int temp = sc.nextInt();
                arr[i] = temp;
            }

            List<Integer> temp = new ArrayList<Integer>();
            int total = 0;
            for(int i = 0; i < n; i++){
                int exist = 0; 
                for(int j = 0; j < temp.size(); j++){
                    if(arr[i] == temp.get(j)){
                        exist = 1;
                        break;
                    }
                }

                if(exist != 1){
                    total++;
                    temp.add(arr[i]);
                } 
            }
            System.out.println(total);   
        }else{
            System.out.println("Wrong input format!");
        }
    }
}