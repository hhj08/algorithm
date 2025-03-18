import java.io.*;

// https://st-lab.tistory.com/134 , https://iseunghan.tistory.com/343 참고
/*
해당 문제는 길이가 N인 계단 수, 즉 숫자의 자릿수를 기반으로 계단 수의 개수를 구하는 문제이다.
계단 수란, 인접한 모든 자리의 숫자 차이가 정확히 1이 되는 수를 의미한다.

이때, 숫자의 마지막 자리(N번째 자리)에 따라 이전 자리(N-1번째 자리)에서 올 수 있는 숫자가 정해진다.

- N번째 자리가 0이면 N-1번째 자리는 1만 올 수 있다.
- N번째 자리가 9이면 N-1번째 자리는 8만 올 수 있다.
- 그 외의 숫자(1~8)는 N-1번째 자리에서 -1 또는 +1 한 값이 올 수 있다.

이를 저장하기 위해 2차원 배열 dp[N][j] 를 선언한다.
여기서 `dp[N][j]`는 길이가 N이고, j로 시작하는 계단 수의 개수를 의미한다.

점화식 유도:
1. N번째 자리가 0일 때:
   - 이전 자리에서 1에서만 올 수 있음 → `dp[N][0] = dp[N-1][1]`
2. N번째 자리가 9일 때:
   - 이전 자리에서 8에서만 올 수 있음 → `dp[N][9] = dp[N-1][8]`
3. 그 외의 숫자(1~8)일 때:
   - 이전 자리에서 `-1` 또는 `+1` 한 값에서 올 수 있음
   → `dp[N][k] = dp[N-1][k-1] + dp[N-1][k+1]`
 */
public class Main {
    final static long mod = 1000000000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N + 1][10];

        for(int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for(int i = 2; i <= N; i++) {

            for(int j = 0; j < 10; j++) {

                if(j == 0) {
                    dp[i][0] = dp[i - 1][1] % mod;
                }

                else if (j == 9) {
                    dp[i][9] = dp[i - 1][8] % mod;
                }
                else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
                }
            }
        }

        long result = 0;

        for(int i = 0; i < 10; i++) {
            result += dp[N][i];
        }

        System.out.println(result % mod);
    }

}

/*
[DP]
https://www.acmicpc.net/problem/10844
45656이란 수를 보자.
이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.
N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.
 */