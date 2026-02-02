import java.util.Scanner;

public class test2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //주사위 눈 3개 변수 만들어서 객체에 할당하기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int pay = 0;
        //1.입력한 세수가 모두같은경우
        if (a == b && b == c){
            pay = 10000 + a * 1000;
        }
        //2.세가지 눈이 전부 다를 경우?
        else if (a!= b && b != c && a != c){
            //가장 큰수를 찾기 내장함수인 Mathmax를 사용합니다
            int max = Math.max(a, Math.max(b, c));
            pay = max * 100;
        }
        //3 두눈만 같은 경우
        else {
            int same; //지역변수를 사용합니다
            if (a == b){ // ab가 같다면?
                same = a;
            }else if (b == c){
                same = b;; // b를 기준으로 비교하기
            }else{ // a==c인 경우
                same = a;
            }
            pay = 1000 + same * 100;
        }
        System.out.println(pay);
    }
}
