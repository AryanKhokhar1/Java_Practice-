import java.time.LocalDate;
import java.util.Date;
public class check {
  
    public static void main(String[] args) {
        Date d=new Date();
        String day = LocalDate.of( 2017 , 8 , 14 ).getDayOfWeek().toString();
        System.out.println(day);
    }
}