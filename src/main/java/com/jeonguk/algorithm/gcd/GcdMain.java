package com.jeonguk.algorithm.gcd;

import java.math.BigInteger;

/**
 * 최대공약수는 두 수의 공통된 약수중 최대값을 말합니다.
 * 약수는 나누어서 0 이 되는 수를 말합니다.
 * 이렇게 나누어서 0 이 되는 수중 공통적으로 들어가 있으며 최대값인 것을 찾으면 됩니다.
 */
public class GcdMain {

    /**
     * 호제법으로 구현.
     * 재귀호출을 사용해서 b 가 0 이 될때까지 반복.
     *
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }
    }

    /**
     * BigInteger 클래스 함수중 gcd() 이용
     * 값을 BigInteger 로 캐스팅한후 첫번째 BigInteger 객체의 gcd() 함수 인자로 두 번째 숫자의 BigInteger 객체를 넘김.
     *
     * @param a
     * @param b
     * @return
     */
    public static int bigIntegerGcd(int a, int b) {
        final BigInteger b1 = BigInteger.valueOf(a);
        final BigInteger b2 = BigInteger.valueOf(b);
        final BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

}
