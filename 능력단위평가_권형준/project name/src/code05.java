//# 문제 5: 이진 탐색을 이용한 숫자 찾기
//! 1. 문제 설명
// 오름차순으로 정렬된 정수 배열과 특정 정수 K가 주어질 때, 이진 탐색(Binary Search) 알고리즘을 사용하여 K의 인덱스를 찾는 프로그램을 작성하시오.
// K가 배열에 없는 경우 -1을 출력한다. 단, 배열의 인덱스는 0부터 시작한다.

//! 2. 입력
// 첫 번째 줄에 정수 N이 주어진다.
// 두 번째 줄에 N개의 정수가 공백으로 구분되어 주어진다. (오름차순 정렬)
// 세 번째 줄에 찾을 정수 K가 주어진다.

//! 3. 출력
// K의 인덱스를 출력한다. 만약 K가 배열에 존재하지 않으면 -1을 출력한다.

// ? cf) 제한 사항
// 1 <= N <= 100
// 각 정수는 1이상 1,000 이하

import java.util.Scanner;

public class code05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    int K = sc.nextInt(); // 검색값

    int index = binarySearch(arr, K);
    System.out.println(index);
    sc.close();
  }

  // # 이진 탐색 메서드 (반환: K의 인덱스 값, 없으면 -1)
  public static int binarySearch(int[] arr, int K) {
    int left = 0;
    int right = arr.length - 1;

    // 0 / 9
    while (left <= right) {
      int mid = left + (right - left) / 2; // 4
      if (arr[mid] == K) {
        return mid;
      } else if (arr[mid] < K) {
        left = mid + 1;
      } else {
        // 중간 값이 K보다 크다면
        // : 왼쪽에 값이 위치
        right = mid - 1;
      }
    }

    return -1;
  }
}

// & === 이진 탐색 ===//
// : '미리 정렬되어 있는 숫자 목록(배열)'에서 원하는 숫자를 빠르게 찾는 방법

// ! 탐색 과정
// 1. 목록 가운데 있는 숫자를 찾음
// 2. 만약) 해당 숫자와 일치하다면 검색 완료
// 3. 가운데 숫자보다 찾는 수가 작으면, 찾는 숫자는 왼쪽(더 작은수들)에 위치
// 4. 가운데 숫자보다 찾는 수가 크면, 찾는 숫자는 오른쪽(더 큰수들)에 위치
// 5. 목록을 반으로 줄여가며 계속 탐색
// >> 만약 목록에 없으면 -1을 출력