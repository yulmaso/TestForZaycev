package com.yulmaso.testforzaycev;

import com.yulmaso.testforzaycev.TaskOne.TaskOne;
import com.yulmaso.testforzaycev.TaskTwo.TaskTwo;

import org.junit.Test;

import static org.junit.Assert.*;


public class ZaycevUnitTest {

    @Test
    public void taskOne_isCorrect() {
        TaskOne.main();
    }

    @Test
    public void taskTwo_isCorrect() {
        TaskTwo tt = new TaskTwo();

        //Входные данные:
        int[] price = {5, 100, 20, 66, 16};
        int discount = 50;
        int offset = 1;
        int readLength = 3;

        //Ожидаемый результат работы:
        int[] expected = {50, 10, 33};

        assertArrayEquals(expected, tt.decryptData(price, discount, offset, readLength));
    }
}