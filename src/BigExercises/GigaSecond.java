package BigExercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static java.lang.Math.pow;

public class GigaSecond {
    LocalDate moment;
    LocalDateTime moments;


    public static void main(String[] args) {
        GigaSecond newDate = new GigaSecond(LocalDateTime.of(2015, Month.JANUARY, 24, 22, 0, 0));
        System.out.println(newDate.getDateTime());
    }

    public GigaSecond(LocalDate moment) {
        this.moment = LocalDate.from(moment.atTime(0,0));
    }

    public GigaSecond(LocalDateTime moments) {
        this.moments = moments;
    }


    public LocalDateTime getDateTime() {
        return this.moments.plusSeconds(1000000000);
    }

}
