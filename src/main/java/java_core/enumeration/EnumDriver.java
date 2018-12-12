package java_core.enumeration;

import static java.lang.System.out;

/**
 * Created by mdb on 4/15/18.
 */

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}


public class EnumDriver {
    Day day ;
    public EnumDriver(Day day){
        this.day = day ;
    }

    public void tellItLikeItIs(){
        switch(day){
            case MONDAY:
                out.println("Mondays are bad.");
                break ;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args){
        EnumDriver firstDay = new EnumDriver(Day.MONDAY);
        firstDay.tellItLikeItIs();
    }

}
