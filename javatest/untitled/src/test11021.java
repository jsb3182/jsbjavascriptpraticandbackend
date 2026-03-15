import java.io.*;
import java.util.StringTokenizer;

public class test11021 {
 public static void main(String[] args) throws  IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //스케너 대신에 메모리의 할당을 위해서 버퍼 라이터 사용합니다
     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     int T = Integer.parseInt(br.readLine());
     for(int i = 1; i <= T; i++){
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         int A = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken());
         //합계만 출력하는 문제입니다
         bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
     }
     bw.flush();
     bw.close();
     br.close();
 }
}
