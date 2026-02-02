import java.util.Scanner;

public class test25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();//영수중에 적힌금액
        int n = sc.nextInt(); //물건종류와 그수
        int total = 0; //맞았는지 아닌지 구분하기 위한 비교하기위한 변수
        for (int i = 0; i<n; i++){
            int a = sc.nextInt();//각물건의 가격
            int b = sc.nextInt();//각 물건의 갯수
            total += a * b; //총합 가격에 할당하기
        }
        if(total == cost){
            //조건에 사용자가 입력한 값이랑 이제 사용자가 입력한 가격이 똑같은지 아닌지
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
