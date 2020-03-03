package Lab1;

public class Time {
    int hour;
    int minute;
    int second;
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.second = second;
        this.minute = minute;
        trueForm();
    }
    public Time(){
        hour = 23;
        second = 59;
        minute = 59;
    }
    public void trueForm(){
        if(this.hour > 23 || this.minute > 59 || this.second > 59){
            this.PlusSec(0);
        }
        if(this.hour < 0 || this.minute < 0 || this.second < 0){
            this.SubSec(0);
        }
    }
    public void SubSec(int second) {
        this.second -= second;
        if (this.second < 0) {
            minute -= 1;
            this.second += 60;
            if (this.second < 0)
                this.SubSec(0);
        }
        if (minute < 0) {
            hour -= 1;
            minute += 60;
            if (minute < 0)
                this.SubSec(0);
        }
        if (hour < 0) {
            hour += 24;
            if (hour < 0)
                this.SubSec(0);
            }
    }
    public void PlusSec(int second) {
        this.second += second;
        if (this.second > 59) {
            minute += 1;
            this.second -= 60;
            if (this.second >59)
                this.PlusSec(0);
        }
        if (minute > 59) {
            hour += 1;
            minute -= 60;
            if (minute > 59)
                this.PlusSec(0);
        }
        if (hour > 23) {
            hour -= 24;
            if (hour > 23)
                this.PlusSec(0);
        }
    }
    public Time Sub(Time d1){
        Time d = new Time(this.hour - d1.hour,this.minute - d1.minute, this.second - d1.second);
        d.trueForm();
        return d;
    }
    public boolean isEqual(Time d){
        if(this.hour == d.minute && this.second == d.second && this.minute == d.minute)
            return true;
        return false;
    }
    public boolean isGreater(Time d){
        if(this.hour > d.hour)
            return true;
        else if(this.hour == d.hour && this.minute > d.minute)
            return true;
        else if(this.hour == d.hour && this.minute == d.minute && this.second > d.second)
            return true;
        return false;
    }
    public String toString(){
        String minuteP = String.format("%02d", minute);
        String secondP = String.format("%02d", second);
        String hourP = String.format("%02d", hour);
        return hourP + ":" + minuteP + ":" + secondP;
    }
    public Time Parse(String str){
        int hour, minute, second;
        String[] strs = str.split(" ");
        Time res;
        if(strs.length == 1){
            strs = str.split(":");
            if(strs.length == 1){
                strs = str.split(".");
            }
        }
        hour = Integer.parseInt(strs[0]);
        minute = Integer.parseInt(strs[1]);
        second = Integer.parseInt(strs[2]);
        res = new Time(hour,minute,second);
        return res;
    }
}
