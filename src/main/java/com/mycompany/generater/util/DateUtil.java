package com.mycompany.generater.util;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author mbk_i
 */
public class DateUtil {

    public static String getCurrentYear2Digits() {
        return String.valueOf(Calendar.getInstance(new Locale("th", "TH")).get(Calendar.YEAR)).substring(2);
    }

}
