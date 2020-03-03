package Lab1;

public class Data {
    int year;
    int day;
    int month;
    public Data(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        trueForm();
    }
    public Data(){
        year = 2019;
        month = 9;
        day = 28;
    }
    public void trueForm(){
        if(this.day > 30 || this.month > 12){
            this.PlusDay(0);
        }
        if(this.day < 1 || this.month < 1){
            this.SubDay(0);
        }
    }
    public void SubDay(int day){
        this.day -= day;
        if(this.day < 1) {
            month -= 1;
            this.day += 30;
            if(this.day < 1)
                this.SubDay(0);
            if (month < 1) {
                year -= 1;
                month += 12;
            }
            if(month < 1)
                this.SubDay(0);
        }
    }
    public void PlusDay(int day){
        this.day += day;
        if(this.day > 30) {
            month += 1;
            this.day -= 30;
            if(this.day > 30)
                this.PlusDay(0);
            if (month > 12) {
                year += 1;
                month -= 12;
            }
            if(month > 12)
                this.PlusDay(0);
        }
    }
    public Data Sub(Data d1){
        Data d = new Data(this.year - d1.year,this.month - d1.month, this.day - d1. day);
        d.trueForm();
        if(d.year < 0)
            return d = new Data(0,d.month,d.day);
        return d;
    }
    public boolean isEqual(Data d){
        if(this.year == d.year && this.month == d.month && this.day == d.day)
            return true;
        return false;
    }
    public boolean isGreater(Data d){
        if(this.year > d.year)
            return true;
        else if(this.year == d.year && this.month > d.month)
                return true;
            else if(this.year == d.year && this.month == d.month && this.day > d.day)
                    return true;
        return false;
    }
    public String toString(){
        String dayP = String.format("%02d", day);
        String monthP = String.format("%02d",month);
        String yearP = String.format("%04d",year);
        return dayP + "/" + monthP + "/" + yearP;
    }
    public Data Parse(String str){
        int year, month, day;
        String[] strs = str.split(" ");
        Data res;
        if(strs.length == 1){
            strs = str.split("/");
            if(strs.length == 1){
                strs = str.split(".");
            }
        }
        year = Integer.parseInt(strs[0]);
        month = Integer.parseInt(strs[1]);
        day = Integer.parseInt(strs[2]);
        res = new Data(year,month,day);
        return res;
    }
}
