import java.time.LocalTime;

class GoodMorningMessage {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(7, 00);
        LocalTime time1 = LocalTime.of(5, 00); 
        LocalTime time2 = LocalTime.of(12, 00); 

        if(time.isBefore(time2) && time.isAfter(time1)) {
            System.out.println("Good Morning");
        }
    }
}