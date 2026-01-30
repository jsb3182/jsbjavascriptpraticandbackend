import java.util.Scanner;

public class test11382 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        //int 가 아닌 long 으로 받아야합니다
        //int 타입의 최대값: 약 $2.1 \times 10^9$ (
        //21억)입니다.문제의 입력값: $10^{12}$ (1조)입니다.

        System.out.println(a+b+c);
    }
}
