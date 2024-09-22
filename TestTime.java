public class TestTime {
    public static void main(String[] args){
        // create time object
        Time myTime1 = new Time(21, 10, 15);
        Time myTime2 = new Time(10, 20, 25);
    // print inital times
    System.out.println("time 1: " + myTime1.toString());
    System.out.println("time 2: " + myTime2.toString());

    myTime1.nextSecond();
    myTime2.previousSecond();

    System.out.println("time 1 after nextSecond() called: " + myTime1.toString());
    System.out.println("time 2 after previousSecond() called: " + myTime2.toString());
    }
}
