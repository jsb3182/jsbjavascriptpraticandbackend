import java.util.Scanner;

public class test10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //앞으로 몆번 입력 받을껀지 입력합니다.
        int T = sc.nextInt();
        //위에 t만큼이라고 하고 반복문 범위 설정하기
        for(int i = 0; i<T; i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            //입력 받은 즉시 더해서 출력하기
            System.out.println(a+b);
        }
        sc.close();

    }
    }
