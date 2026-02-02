import java.io.*;
import java.util.StringTokenizer;

public class test15552 {
    public static void main(String[] args) throws IOException {
        //입력도구 키보드를 빠르게 읽어옵니다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력도구 모니터에 빠르게 씁니다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //첫줄에 태스트 케이스 쓰기
        //여기서 중요한점은 br.readline은 문자열로 받기때문에 숫자로 변환해야합니
        int T = Integer.parseInt(br.readLine());
        for(int i =0; i < T; i++){
            // 1 2처럼 한줄에 들어운 숫자를 공백 기준으로 자릅니다.
            StringTokenizer st = new StringTokenizer(br.readLine());
            //잘린 문자열을 숫자로 바꿔서 더합니다.
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            //결과를 바로 출력하지 않고 버퍼 출력 창고에 담아서 출력하기
            //묹자열로 바뀌서 넣어쥐야지 줄바꿈을 넣어주어야합니다/
            bw.write((a + b) + "\n");
        }
        //버퍼에 남은 데이터를 모두 쏟아내고 닫아 줍니다/
        bw.flush();
        bw.close();
        br.close();
    }


    }

