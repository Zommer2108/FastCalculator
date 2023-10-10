public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    public int getTotalSeconds(){
        return (hour * 3600) + (minute * 60) + second;
    }

    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
