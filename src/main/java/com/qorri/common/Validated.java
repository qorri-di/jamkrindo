package com.qorri.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validated {
    private static final String EMAIL = "^[_A-Za-z0-9-\\\\+]+([\\\\._A-Za-z0-9]+)*@(qorri-di\\\\.com|[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,}))$\n";
    private static final String PHONE_NUMBER = "^(\\\\+62|0)8\\\\d{9,12}$\n";
    public static final DateFormat DATETIMEFORMAT = new SimpleDateFormat("dd-MMM-yyyy kk:mm:ss");

    public static boolean isEmail(String str) {
        Pattern pattern = Pattern.compile(EMAIL);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static boolean isPhone(String str) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static boolean isValidDateTime(String str) {
        try {
            DATETIMEFORMAT.setLenient(false);
            String strDateTime = DATETIMEFORMAT.format(DATETIMEFORMAT.parse(str));
            String[] splitDateTime = strDateTime.split(" ");
            if (splitDateTime.length == 2) {
                String[] splitDate = splitDateTime[0].split("-");
                if (splitDate.length == 3) {
                    int year = Integer.parseInt(splitDate[2]);
                    if (String.valueOf(year).length() != 4) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }

            return true;

        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean isNotNullStr(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isNotNullInt(Integer str) {
        if (str == null || str == 0) {
            return true;
        }
        return false;
    }

}
