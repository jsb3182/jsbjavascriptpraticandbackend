import java.util.Scanner;

public class test2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //첫번째 숫자
        int b = sc.nextInt(); // 두번째 숫자
        //각자리숫가 분리합니다 각 자릿수흫 분리합니다
        int b1 = b % 10; //일의 자리
        int b2 = (b % 100) / 10; //십의 자리
        int b100 = b / 100; //백의 자리
        //출력하기
        System.out.println(a * b1);
        System.out.println( a * b2);
        System.out.println(a * b100);
        System.out.println(a * b);

    }
}
