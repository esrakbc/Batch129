package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.SortedMap;

public class DateTime01 {
    public static void main(String[] args) {
        Date myDate = new Date();
        System.out.println(myDate);
        System.out.println(myDate.getTime());
        //Içınde bulunduğumuz an nasıl alınır?
        LocalDate.now();
        System.out.println(LocalDate.now());
        LocalTime.now();
        System.out.println(LocalTime.now());
        LocalDateTime.now();
        System.out.println( LocalDateTime.now());
        //Dunyanın herhangi bir saat dilimindeki saati nasıl alırız?
        LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo")));
        //İleriki bir tarihe nasıl gidilir?
        LocalDate.now().plusYears(7).plusMonths(5).plusDays(35);
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));
        //Geriki bir tarihe nasıl gidilir?
        LocalDate.now().minusYears(4).minusMonths(3).minusDays(2);
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));
        //İleriki bir zamana nasıl gidilir?
        LocalTime.now().plusHours(3);
        System.out.println(LocalTime.now().plusHours(3));
        //Geriki bir zamana nasıl gidilir?
        LocalTime.now().minusMinutes(45);
        System.out.println(LocalTime.now().minusMinutes(45));
        //Zaman'da belli bir bölümü nasıl alırız?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());
        //Tarih te belli bir bölümü nasıl alırız?
        System.out.println(LocalDate.now().getMonthValue()+ ":" + LocalDate.now().getDayOfMonth());
        //İki tarih nasıl karşılaştırılır?
        //02/13/2005-03/01/2007
        Boolean result=LocalDate.of(2005,2,13).isBefore(LocalDate.of(2007,03,01)) ;
        System.out.println(result);

        //Tarihlerin formatları nasıl değiştirilir?
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dtf.format(LocalDate.now());
        System.out.println(dtf.format(LocalDate.now()));
        //MMM ayın ilk üç harfini,MMMM ayın ismini tam,M tek rakamla ay nosu'nu yazar.
        //d tek rakamla gun no yazar, dd iki rakamla gun no yazar
        //yy yılın son iki rakaımını yazar, yyyy yılın tamamını yazar

    }
}
