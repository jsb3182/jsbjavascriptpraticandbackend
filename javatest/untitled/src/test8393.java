import java.util.Scanner;

public class test8393 {
    public static void main(String[] args[]){
        Scanner sc= new Scanner(System.in);
        int a =  sc.nextInt();
        int sum =0 ; //총합을 받을수있는 변수를 0으로 초기화 시킴
        for(int i = 1; i<=a; i++){
            sum +=i; // sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
