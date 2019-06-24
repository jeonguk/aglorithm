package com.jeonguk.algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 각각 크기 N과 M의 두 배열 A와 B가 주어진다. 작업은이 두 배열 사이의 결합을 찾는 것입니다.
 *
 * 두 배열의 결합은 두 배열의 고유 요소가 포함 된 집합으로 정의 할 수 있습니다.
 * 반복이 있으면 하나의 요소 만 하나의 유니온으로 인쇄해야합니다.
 *
 * 입력의 첫 번째 라인은 테스트 케이스의 수를 나타내는 정수 T를 포함합니다.
 * 그런 다음 T 테스트 사례가 이어집니다. 각 테스트 케이스는 세 줄로 구성됩니다.
 * 각 테스트 케이스의 첫 번째 줄에는 두 개의 공백으로 구분 된 정수 N과 M이 포함됩니다.
 * N은 배열 A의 크기이고 M은 B의 크기입니다.
 * 각 테스트 케이스의 두 번째 줄에는 배열 A의 요소를 나타내는 N 개의 공백으로 구분 된 정수가 들어 있습니다.
 * 각 테스트 케이스의 세 번째 행은 배열 B의 원소를 나타내는 M 개의 공간으로 분리 된 정수를 포함한다.
 *
 *
 * 각 테스트 케이스에 따라, 2 개의 배열의 공용체 요소의 수를 출력합니다.
 * Constraints:
 * 1 ≤ T ≤ 100
 * 1 ≤ N, M ≤ 105
 * 1 ≤ A[i], B[i] < 105
 *
 * Example:
 * Input:
 * 2
 * 5 3
 * 1 2 3 4 5
 * 1 2 3
 * 6 2
 * 85 25 1 32 54 6
 * 85 2
 *
 * Output:
 * 5
 * 7
 */
public class UnionOfTwoArraysMain {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        for (int test = 1; test <= tests; test++) {
            String str1 = br.readLine();
            int[] intArray1 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
            int[] intArray2 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

            Set<Integer> set = new HashSet<>();
            for (Integer i: intArray1) {
                set.add(i);
            }

            for (Integer i: intArray2) {
                set.add(i);
            }
            System.out.println(set.size());
        }
    }

}
