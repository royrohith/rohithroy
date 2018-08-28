package collection;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class GarbageEx {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("before garbage collection");
    }

    int x;

    public static void main(String[] args) {

        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(format.format(date));

        LocalTime time=LocalTime.now();
        System.out.println(time);

        GregorianCalendar cal=new GregorianCalendar();
        int year=cal.get(cal.YEAR);
        System.out.println(year);
        System.out.println(cal.getTime());


    }

}
