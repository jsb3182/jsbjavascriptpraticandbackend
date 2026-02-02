import java.util.Scanner;

public class test2884 {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        int H = time.nextInt(); // 시
        int M = time.nextInt(); // 분 (W 대신 이해하기 쉽게 M으로 표기할게요)

        if (M < 45) {
            H--; // 1시간을 빌려옵니다.
            M = M + 60 - 45; // 60분을 더한 뒤 45분을 뺍니다 (결국 M + 15와 같음)

            if (H < 0) {
                H = 23; // 0시에서 1시간을 빼면 23시가 됩니다.
            }
        } else {
            M = M - 45; // 45분보다 크면 그냥 빼면 끝!
        }

        System.out.println(H + " " + M);
    }
}