//# 문제 2: 배열의 최댓값 찾기
//! 1. 문제 설명
// N개의 정수가 주어지면, 그 중 최댓값을 출력하는 프로그램을 작성하시오.

//! 2. 입력
// 첫 번째 줄에 정수 N이 주어진다.

// 두 번째 줄에 N개의 정수가 공백으로 구분되어 주어진다.

//! 3. 출력
// N개의 정수 중 최댓값을 출력한다.

//? cf) 제한 사항
// 1 ≤ N ≤ 100
// 각 정수는 1 이상 1,000 이하

import java.util.Scanner;

public class code02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // "5"를 입력하면 5개의 숫자를 입력받음을 의미
    // 정수 N은 정수의 개수를 나타냄
    int N = sc.nextInt();
    int max = Integer.MIN_VALUE; // -2,147,483,648

    // ? cf) Integer.MIN_VALUE; / Integer.MAX_VALUE;
    // : 정수형(int)이 저장할 수 있는 최소값과 최대값을 반환
    // : 약 -21억 ~ 약 21억
    // >> -2,147,483,648 ~ 2,147,483,647

    for (int i = 0; i < N; i++) { // N의 수 만큼 반복
      int num = sc.nextInt(); // N의 수 만큼 수를 입력 받음

      if (num > max) {
        // if 조건문이 처음 실행될 때 사용자가 입력한 수는 반드시! max 값보다 큰 값!
        // : 사용자가 처음 입력한 값이 max 값으로 시작
        max = num;
      }
    }

    System.out.println("가장 큰 수 " + max);
    sc.close();
  }
}
