package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test // Test어노테이션 --> 독립적으로 실행가능한 함수가 됨
    @DisplayName("1 + 2 = 3") // 테스트 설명
    public void testPlus() {
        SimpleCalculator simpleCalculator = simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculato.plus(1, 2);

        assertEquals(3, rs);
    }
}
