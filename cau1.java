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