import java.util.Scanner;

public class sleepTech05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    int K = sc.nextInt();
    int index = BinarySearch(arr, K);
    System.out.println(index);
    sc.close();
  }

  public static int BinarySearch(int[] arr, int K) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == K) {
        return mid;
      } else if (arr[mid] < K) {
        left = mid + 1;
      } else {
        right = mid - 1;

      }
    }

    return -1;
  }
}
