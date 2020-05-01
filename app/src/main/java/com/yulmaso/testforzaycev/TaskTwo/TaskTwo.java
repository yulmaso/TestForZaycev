package com.yulmaso.testforzaycev.TaskTwo;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Plotnikov Alexey on 30/04/2020.
 *
 * Unit-тест для проверки - ZaycevUnitTest.taskTwo_isCorrect()
 */
public class TaskTwo {
    public @Nullable
    int[] decryptData(@NonNull int[] price,
                      @IntRange(from = 1, to = 99) int discount,
                      @IntRange(from = 0) int offset,
                      @IntRange(from = 1) int readLength) {

        //Защита от ArrayOutOfBoundsException
        int a = offset + readLength;
        int end = Math.min(a, price.length);

        int[] result = new int[end - offset];

        for (int i = offset, k = 0; i < end; i++, k++ ) {
            if (i < price.length) {
                result[k] = (int) (price[i] * discount * 0.01);
            } else {
                break;
            }
        }
        return result;
    }
}
