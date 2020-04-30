package com.yulmaso.testforzaycev.TaskTwo;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by Plotnikov Alexey on 30/04/2020.
 *
 * Unit-тест для проверки - ZaycevUnitTest
 */
public class TaskTwo {
    public @Nullable
    int[] decryptData(@NonNull int[] price,
                      @IntRange(from = 1, to = 99) int discount,
                      @IntRange(from = 0) int offset,
                      @IntRange(from = 1) int readLength) {

        int[] result = new int[readLength];

        for (int i = offset, k = 0; i < offset + readLength; i++, k++ ) {
            result[k] = (int) (price[i] * discount * 0.01);
        }

        return result;
    }
}
