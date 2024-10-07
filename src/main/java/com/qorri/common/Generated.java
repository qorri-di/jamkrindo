package com.qorri.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Generated {
    private static ZoneId jakartaZone = ZoneId.of("Asia/Jakarta");

    public static Integer genId(){
        LocalDateTime currentTime = LocalDateTime.now(jakartaZone);
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("yyyyddMMss"));
        return Integer.valueOf(formattedTime);
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
