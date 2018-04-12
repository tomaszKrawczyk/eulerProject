import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

/**
 * Created by Tomek Krawczyk on 31.10.2017.
 */


/*You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

*/


public class problem16 {

    public static void main(String[] args) {


        // 1 Jan 1900 Monday

        int a = 365 % 7;

        System.out.println(a); // 1 Jan 1901 Tuesday


        long[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        long[] leapyear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        DayOfWeek date = LocalDate.of(1901, Month.JANUARY, 1).getDayOfWeek();

        System.out.println(date);

        int count = 0;


        for (int i = 1901; i <2000; i++) {

            if (i % 4 == 0) {

                for (int j = 0; j <= 11; j++) {

                   date=date.plus(leapyear[j]);

                    System.out.println(date);

                    if (date == DayOfWeek.WEDNESDAY) {
                        count++;
                    }
                }
            } else {

                for (int h = 0; h <= 11; h++) {
                    date=date.plus(year[h]);
                    System.out.println(date);
                    if (date == DayOfWeek.WEDNESDAY) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}