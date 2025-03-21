import java.util.*;

/*
손으로 하나하나 그려가며 규칙을 찾음

m이 1이면 합으로 나타내는 방법의 수는 1개 => 1
2이면 2개 => 1+1, 2
3이면 4개 => 1+1+1, 2+1, 1+2, 3

위의 1,2,3의 방법의 수를  초기값으로 설정
이유는 합으로 나타내는 방법의 수에 본인(1,2,3)이 포함되기 때문.

m이 4일 때 경우의 수를 찾을려면
m이 1일 때의 방법인 1에 3을 더해줌 => 1가지 방법
2일 때의 방법인 1+1에 2를 더해주고, 2에도 2를 더해줌 => 2가지 방법
3일 때의 방법인 1+1+1에 1을 더해주고, 2+1에도 1을 더해주고, 1+2에 1을 더하고, 3에 1을 더함 => 4가지 방법

이런 식으로 n-3, n-2, n-1 번째의 방법에서 뒤에 하나씩 값이 더해지는 형식이므로
점화식은 dp[m] = dp[m-3] + dp[m-2] + dp[m-1] 이라는 것을 찾음

 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int m = sc.nextInt();

            int dp[] = new int[m+1];

            if (m >= 1) dp[1] = 1;
            if (m >= 2) dp[2] = 2;
            if (m >= 3) dp[3] = 4;

            for(int i=4; i<=m; i++) {
                dp[i]= dp[i-3]+dp[i-2]+dp[i-1];
            }
            System.out.println(dp[m]);
        }
    }
}

/*
[DP]
https://www.acmicpc.net/problem/9095
정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1

정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 */