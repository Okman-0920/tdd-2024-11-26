package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test // Test어노테이션 --> 독립적으로 실행가능한 함수가 됨
    @DisplayName("1 + 2 = 3") // 테스트 설명
    public void t1() {
        SimpleCalculator simpleCalculator = simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        assertEquals(3, rs);
    }

    @Test // Test어노테이션 --> 독립적으로 실행가능한 함수가 됨
    @DisplayName("2 + 10 = 12") // 테스트 설명
    public void t2() {
        SimpleCalculator simpleCalculator = simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2, 10);

        assertEquals(12, rs);
    }

    @Test // Test어노테이션 --> 독립적으로 실행가능한 함수가 됨
    @DisplayName("20 + 10 = 30") // 테스트 설명
    public void t3() {
        SimpleCalculator simpleCalculator = simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(20, 10);

        assertEquals(30, rs); //test의 성패를 보겠다라는 선언
    }



}
