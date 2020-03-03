package Task3;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public MyTime(int hour, int minute, int second) {
        if(hour < 24 && hour >= 0)
            this.hour = hour;
        else
            this.hour = 23;
        if(minute >= 0 && minute < 60)
            this.minute = minute;
        else
            this.minute = 59;
        if(second >= 0 && second < 60)
            this.second = second;
        else
            this.second = 59;
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void setTime(int hour,int minute, int second){
        if(hour < 24 && hour >= 0)
            this.hour = hour;
        else
            this.hour = 23;
        if(minute >= 0 && minute < 60)
            this.minute = minute;
        else
            this.minute = 59;
        if(second >= 0 && second < 60)
            this.second = second;
        else
            this.second = 59;
    }
    public String toString(){
        String hourP = String.format("%02d", hour);
        String minuteP = String.format("%02d",minute);
        String secondP = String.format("%02d",second);
        return hourP + "/" + minuteP + "/" + secondP;
    }
    public void nextSecond(){
        if(this.getSecond() < 59)
            this.setSecond(this.getSecond() + 1);
        else {
            this.setSecond(0);
            if (this.getMinute() < 59)
                this.setMinute(this.getMinute() + 1);
            else {
                this.setMinute(0);
                if (this.getHour() < 23)
                    this.setHour(getHour() + 1);
                else
                    this.setHour(0);
            }
        }
    }
    public void nextMinute(){
        if (this.getMinute() < 59)
            this.setMinute(this.getMinute() + 1);
        else {
            this.setMinute(0);
            if (this.getHour() < 23)
                this.setHour(getHour() + 1);
            else
                this.setHour(0);
        }
    }
    public void nextHour(){
        if (this.getHour() < 23)
            this.setHour(getHour() + 1);
        else
            this.setHour(0);
    }
    public void previousSecond(){
        if(this.getSecond() > 0)
            this.setSecond(this.getSecond() - 1);
        else {
            this.setSecond(59);
            if (this.getMinute() > 0)
                this.setMinute(this.getMinute() - 1);
            else {
                this.setMinute(59);
                if (this.getHour() > 0)
                    this.setHour(getHour() - 1);
                else
                    this.setHour(23);
            }
        }
    }
    public void previousMinute(){
        if (this.getMinute() > 0)
            this.setMinute(this.getMinute() - 1);
        else {
            this.setMinute(59);
            if (this.getHour() > 0)
                this.setHour(getHour() - 1);
            else
                this.setHour(23);
        }
    }
    public void previousHour(){
        if (this.getHour() > 0)
            this.setHour(getHour() - 1);
        else
            this.setHour(23);
    }
}
