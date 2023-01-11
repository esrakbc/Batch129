package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //ex1= Time'ı formatlayınız
        LocalTime myTime=LocalTime.now();
        System.out.println(myTime);
        // hh ==> 12 lık saat sistemini kullanır-HH==> 24 lük saat sistemini kullanır
        //hh kullandığınızda AM veya PM demelisiniz,bunu demek için "a" yazmanız yeterli.Yanş "hh:mm q"
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(dtf.format(myTime));
    }
}
