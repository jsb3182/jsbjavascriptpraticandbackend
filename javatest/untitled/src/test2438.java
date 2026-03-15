import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        //이중for문의 시작
        //외부 for문 i행을 결정합니다.
        for (int i = 1; i<= N; i++){
            //내부의 j의 열만큼 열을 결정합니다 현재 층수만큼 별을 찍음
            for(int j = 1; j <= i; j++){
                System.out.print("*"); //줄바꿈없이 별을 붙혀요
            }
            // 한층의 별을 다찍으면 줄바꿈
            System.out.println();
        }
    }
}
