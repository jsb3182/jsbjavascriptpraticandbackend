import java.io.*;

public class test2439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i<= N; i++) {
            //공백출력 N-i개만큼 찍습니다.
            for (int j = 1; j<= N - i; j++) {
                bw.write(" ");
            }
            //별출력 i개만큼 찍습니다.
            for (int k = 1; k <= i; k++){
                bw.write("*");
            }
            //한줄이 끝나면 줄바꿈
            bw.write("\n");
        }
        //버퍼 비우기 밎 닫기
        bw.flush();
        bw.close();
        br.close();

    }
}
