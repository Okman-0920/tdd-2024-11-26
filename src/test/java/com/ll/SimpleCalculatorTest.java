package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleCalculatorTest {

    @Test // Test어노테이션 --> 독립적으로 실행가능한 함수가 됨
    @DisplayName("1 + 2 = 3") // 테스트 설명
    public void t1() {
        SimpleCalculator simpleCalculator = simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        assertThat(rs).isEqualTo(3);
        // 나는 같음을 단언한다. 3의 기대값을
    }

    @Test // Test어노테이션 --> 독립적으로 실행가능한 함수가 됨
    @DisplayName("2 + 10 = 12") // 테스트 설명
    public void t2() {
        SimpleCalculator simpleCalculator = simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2, 10);

        assertThat(rs).isEqualTo(12);
    }

    @Test // Test어노테이션 --> 독립적으로 실행가능한 함수가 됨
    @DisplayName("20 + 10 = 30") // 테스트 설명
    public void t3() {
        SimpleCalculator simpleCalculator = simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(20, 10);

        assertThat(rs).isEqualTo(30);
//        assertEquals(30, rs); //test의 성패를 보겠다라는 선언
    }



}
