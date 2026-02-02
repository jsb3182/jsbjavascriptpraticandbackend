import java.util.Scanner;

public class test2739 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();//이제 변수에 사용자가 입력한 값을 할당함
        sc.close();
        for(int i = 1; i<10; i++){
            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }
}
