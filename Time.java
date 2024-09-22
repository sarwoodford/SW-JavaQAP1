public class Time {
    // assign attributes
    private int hour;
    private int minute;
    private int second;

    // constructors
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // getters
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    //setters
    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // display results
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //next and previous second methods

    public Time nextSecond(){
        second ++;
        if(second == 60){
            second = 0;
            minute++;
            if(minute == 60){
                minute = 0;
                hour ++;
                if(hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond(){
        second --;
        if(second == -1){
            second = 59;
            minute --;
            if(minute == -1){
                minute = 59;
                hour --;
                if(hour == -1){
                    hour = 23;
                }
            }
        }
        return this;
    }
}
