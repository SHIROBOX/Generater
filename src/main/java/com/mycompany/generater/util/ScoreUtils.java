package com.mycompany.generater.util;

/**
 *
 * @author mbk_i
 */
public class ScoreUtils {

    public static int generateBetween(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

}
