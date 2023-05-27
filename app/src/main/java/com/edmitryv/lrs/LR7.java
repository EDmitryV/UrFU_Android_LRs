package com.edmitryv.lrs;

import java.util.Arrays;

//Альтернативный вариант  лабораторной можно найти в итоговом проекте
public class LR7 {
    public static void LR7(String[] args) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        char key = 'i';
        int startIndex = 2;
        int endIndex = 4;

        System.out.println(Arrays.binarySearch(vowels, startIndex, endIndex, key));

    }
}
