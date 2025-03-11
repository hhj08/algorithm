import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        // 2x1 직사각형은 한가지 방법, 2x2 직사각형은 두 가지 방법이 있으므로 아래와 같이 초기값 설정
        dp[1] = 1;
        dp[2] = 2;

        // 1과 2에 대한 초기값은 이미 설정되어 있으므로 i는 3부터 시작
        for (int i = 3; i <= n; i++)

            // 오른쪽 끝에 세로 타일(2×1)을 놓는 경우와 가로 타일(1×2) 두 개를 놓는 경우를 계산해야함
            // f(n) = f(n-1)[세로 타일을 놓는 경우] + f(n-2)[가로 타일을 놓는 경우]
            // 그림이 포함 된 참고하기 좋은 블로그 https://girawhale.tistory.com/33
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
            // 10007로 나누는 이유는 그 수가너무 많아 질 수 있으므로 제한을 걸어 둔 것

        System.out.println(dp[n]);
    }
}

/*
[dp]
https://www.acmicpc.net/problem/11726
2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 */