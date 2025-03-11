import java.io.*;

// 문제 풀이에 참고한 블로그
// https://velog.io/@kimmjieun/백준-1463번-1로-만들기-Java-자바
// https://bada744.tistory.com/61
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 정수 n을 입력 받음
        int dp[] = new int[n+1];
        // 배열이 0번째부터 시작하므로 n에 1을 더해주어
        // n을 포함한 모든 값을 저장하기 위해 n+1로 크기를 지정하는 것
        // ex n이 3일 경우 배열의 인덱스는 0,1,2임 +1를 하여 0,1,2,3을 만들어 준다.
        dp[0] = dp[1] = 0;
        // dp[n]이 1이면 연산을 할 핋요가 없으므로 dp[1]의 초기값은 0으로 설정

        // 문제에서 사용할 연산은 아래의 3가지임
        // 1. 3으로 나누어 떨어지면 3으로 나눔
        // 2. 2로 나누어 떨어지면 2로 나눔
        // 3. 1을 빼기
        // 이때 큰 문제 -> 작은 문제로 접근하는 Top-Down 방식을 적용할 것인지
        // 작은 문제 -> 큰 문제로 접근하는 Bottom-Up 방식을 사용할 것인지 정함

        // 이 문제는 최소 연산 횟수를 찾아야 하므로  Bottom-Up 방식이 적합
        for(int i=2; i<=n; i++) { //i가 2부터 시작되는 이유는 1은 계산할 필요가 없기 때문
            dp[i] = dp[i-1] + 1;
            // dp[i]가 2이면 dp[2-1] 즉 위에 선언한 dp[1]의 값인 0과 1을 더함
            // 그렇게 dp[i] 번째와 dp[i-1] 값에 1을 더해 감

            // 1을 빼고 2로 나누어지거나, 2로 나누어지고 3으로 나누어지는 경우를 계산
            // dp[i]에 저장된 값과 dp[i/2혹은3]+1 한 값중 최솟 값을 저장함
            // 문제는 목적은 "최소 연산 횟수로 1에 도달" 하는 것이기에 세가지 경우 중 적은 횟수를 저장하는 것임
            if(i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }

            if(i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}

/*
[DP]
https://www.acmicpc.net/problem/1463
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
2. X가 2로 나누어 떨어지면, 2로 나눈다.
3. 1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다.
연산을 사용하는 횟수의 최솟값을 출력하시오.
 */