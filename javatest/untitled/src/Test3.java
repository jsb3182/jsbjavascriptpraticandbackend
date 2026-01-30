import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        int a,b,result; //각각의 갑 정수향 변스로 받음
        Scanner sc = new Scanner (System.in); //객체 생성함
        a = sc.nextInt(); //사용자에게 입력 받는 메서드를 변수에 할당합니다
        b = sc.nextInt();
        result = a * b;
        System.out.println(result);// 입력받은 두수의 곱 출력합니다.
    }
}
