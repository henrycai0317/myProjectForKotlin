package com.tom.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {

    public static void main(String[] args) {
        LocalDateTime enter =
                    LocalDateTime.of(2021,5,9,
                            12,0,0);
        LocalDateTime leave=
                    LocalDateTime.of(2021,5,9,
                            14,0,0);
       Car car = new Car("AA-0001",enter);
       car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long) Math.ceil(car.getDuration()/60.0);
        System.out.println(hours);
        System.out.println(30*hours);


        //java 8
//        java8();
//        java();
    }

    private static void java8() {
        Instant instant=Instant.now();
        System.out.println(instant);
        //Local
        LocalDateTime now =LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other =
                LocalDateTime.of(2021,05,10,5,05,0);
        System.out.println(other);
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf =
                        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s= "2020/03/17 16:43:35";
        Date other=null;
        try {
             other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //計算日期用Calendar
        Calendar calendar = Calendar.getInstance();//傳回目前的時間資料
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,3);//一月是0,從0開始算
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}
