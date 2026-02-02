import java.util.Scanner;

public class test25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //메모리에 객체를 할당
        //n은 4의 배수로 들어옵니다.
        int n = sc.nextInt();
        //2.4바이트강 long이 1개씩 필요함으모 n/4를 해줍니다.
        //12 / 4 = 3 이니까 long 3번 출력합니다.
        int repeat = n /4;
        for (int i = 0; i < repeat; i++){
            //System.out.print 를 사용해서 옆으로 이어붙힙니다.
            // 12 / 4 = 3 이니까 long 을 3번 출력합니다
            System.out.println("long");
        }
        //반복문이 끝나면 마지막에 int를 붙여줍니다.
        //long long
        System.out.println("int");
        sc.close();
    }
}
