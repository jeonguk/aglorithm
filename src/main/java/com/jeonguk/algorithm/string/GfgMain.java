package com.jeonguk.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 두 개의 문자열 s1과 s2가 주어지면 두 번째 문자열에있는 첫 번째 문자열에서 해당 문자를 제거합니다.
 * 두 문자열은 서로 다르며 소문자 만 포함합니다.
 * <p>
 * Input :
 * The first line of input contains an integer T denoting the number of test cases.
 * 입력의 첫 번째 라인은 테스트 케이스의 수를 나타내는 정수 T를 포함합니다.
 * The first line of each test case is s1,s1 is first string.
 * 각 테스트 케이스의 첫 번째 줄은 s1이고, s1은 첫 번째 줄입니다.
 * The second line of each test case contains s2,s2 is second string.
 * 각 테스트 케이스의 두 번째 줄에는 s2가 있고 s2는 두 번째 줄입니다.
 * <p>
 * Output :
 * Print the modified string(s1). For each test case, print the output in a new line.
 * 수정 된 문자열 (s1)을 인쇄하십시오. 각 테스트 케이스에 대해 출력을 새 행으로 인쇄하십시오.
 * <p>
 * Constraints :
 * 1 ≤ T ≤ 15
 * 1 ≤ s2 < s1 ≤ 50
 */
public class GfgMain {

    /**
     * Example:
     *
     * Input:
     * 2
     * geeksforgeeks
     * mask
     * removeccharaterfrom
     * string
     *
     * Output:
     * geeforgee
     *
     * emovecchaaefom
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        for (int test = 1; test <= tests; test++) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            StringBuilder res = new StringBuilder();
            Set<Character> hashSet = new HashSet<>();
            for (int in = 0; in < s2.length(); in++) {
                hashSet.add(s2.charAt(in));
            }

            for (int in = 0; in < s1.length(); in++) {
                if (!hashSet.contains(s1.charAt(in))) {
                    res.append(s1.charAt(in));
                }
            }
            System.out.println(res);
        }
    }

}
