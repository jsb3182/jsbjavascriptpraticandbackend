import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);//객체생성
        a = sc.nextInt(); //객체 생성함수를 통해서 사용자에게 입력받은후에 할당하기
        b = sc.nextInt();
        c = a - b;//입력받은 두수의 차를 c에 할당시킴
        System.out.println(c);//출력창에 출력하기
    }
}