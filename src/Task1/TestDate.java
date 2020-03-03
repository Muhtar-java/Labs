package Task1;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(1,4,2018);
        System.out.println("Day: " + d1.getDay() + ", month: " + d1.getMonth() + ", year: " + d1.getYear());
        d1.setDay(5);
        d1.setMonth(6);
        d1.setYear(2017);
        System.out.println("Day: " + d1.getDay() + ", month: " + d1.getMonth() + ", year: " + d1.getYear());
        d1.setDate(9,2,2013);
        System.out.println(d1);
    }
}
