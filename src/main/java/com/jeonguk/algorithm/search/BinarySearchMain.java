package com.jeonguk.algorithm.search;

/**
 * Question : 무한 수의 정렬 된 배열이 있다고 가정. 배열의 요소를 어떻게 검색합니까?
 *
 * 배열이 정렬되었으므로 가장 먼저 염두에 두어야 할 것은 이진 검색이지만 여기서 문제는 배열의 크기를 알 수 없음.
 * 배열이 무한대이면 이진 검색을 적용 할 적절한 경계가 없다는 것을 의미.
 * 따라서 키의 위치를 ​​찾으려면 먼저 경계를 찾고 이진 검색 알고리즘을 적용.
 *
 * 로우는 첫 번째 요소를 가리키고 배열의 두 번째 요소를 가리 키도록한다.
 * 이제 높은 인덱스 요소와 키를 비교하고,
 * - 높은 인덱스 요소보다 큰 경우 낮은 인덱스에서 높은 인덱스를 복사하고 높은 인덱스를 두 배로한다..
 * - 작은 경우, 발견 된 높은 색인과 낮은 색인에서 2 진 검색을 적용.
 */
public class BinarySearchMain {

    // Simple binary search algorithm
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            } else {
                return binarySearch(arr, mid + 1, right, target);
            }
        }
        return -1;
    }

    public static int findPos(int[] arr, int key) {
        int low = 0;
        int high = 1;
        int val = arr[0];
        // Find h to do binary search
        while (val < key) {
            low = high; // store previous high
            //check that 2*h doesn't exceeds array
            //length to prevent ArrayOutOfBoundException
            if (2 * high < arr.length - 1) {
                high = 2 * high;
            } else {
                high = arr.length - 1;
            }
            val = arr[high];
        }
        // at this point we have updated low
        // and high indices, thus use binary
        // search between them
        return binarySearch(arr, low, high, key);
    }

}
