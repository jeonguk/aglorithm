package com.jeonguk.algorithm.sort;

public class QuickSortMain {

    /**
     * 1. 피벗이라고하는 요소를 목록에서 선택합니다. 목록을 두 개의 하위 목록으로 나눕니다.
     * 2. 피벗 주변의 모든 요소를 ​​재정렬합니다.
     * 값이 작은 요소는 요소 앞에 배치되고 모든 요소는 요소 뒤에옵니다.
     * 이 단계 후에 피벗은 최종 위치에 있습니다. 이것은 중요한 파티션 단계입니다.
     * 3. 피벗의 왼쪽과 오른쪽에있는 두 하위 목록 모두에 위 단계를 반복적으로 적용합니다.
     * <p>
     * - quicksort는 모든 분할 및 정복 방식(Devide and Conquer)과 같은 재귀 알고리즘입니다.
     * <p>
     * Time Complexity
     * - 가장 좋은 경우 알고리즘은 두 개의 동일한 크기의 하위 목록으로 목록을 나눕니다.
     * 따라서 전체 n 크기 목록의 첫 번째 반복에는 O (n)이 필요합니다.
     * 나머지 두 개의 하위 목록을 n / 2 요소로 정렬하면 각각 2 * O (n / 2)가됩니다.
     * 결과적으로 QuickSort 알고리즘은 O (n log n)의 복잡성을 갖습니다.
     * - 최악의 경우 알고리즘은 각 반복에서 하나의 요소 만 선택하므로 O (n) + O (n-1) + ... + O (1)이며 O (n2)와 같습니다.
     * - 평균적으로 QuickSort는 O (n log n)의 복잡성을 가지므로 대용량 데이터에 적합합니다.
     */

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            // Recursively sort elements of the 2 sub-arrays
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] givenArray = {9, 5, 1, 0, 6, 2, 3, 4, 7, 8};

        quickSort(givenArray, 0, givenArray.length - 1);

        for (int i : givenArray) {
            System.out.print(i);
        }
    }

}
