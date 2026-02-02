import java.util.Scanner;

public class test2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //현재 시간 소요 시간 입력 받기
      int A = sc.nextInt();//시간 지금 현제 시간
      int B = sc.nextInt();//분 지금 현제 분

      int C = sc.nextInt();// 요리하는데 필요한 시간
      int min = 60*A+B;
      min += C;
      int hour = (min/60)%24;
      int minute = min%60;
      System.out.println(hour+" "+minute);
    }
}
