package com.qorri.common;

import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Generated {
    private static final ZoneId jakartaZone = ZoneId.of("Asia/Jakarta");

    public static String genId(String code){
        UUID uuid = UUID.randomUUID();
        LocalDateTime currentTime = LocalDateTime.now(jakartaZone);
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        String uuidStr = uuid.toString().replace("-", "");
        String lastSevenDigits = uuidStr.length() >= 7 ? uuidStr.substring(uuidStr.length() - 7) : uuidStr;
        return code+formattedTime+lastSevenDigits;
    }

    public static Date convertDate(String str){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            return dateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
}
