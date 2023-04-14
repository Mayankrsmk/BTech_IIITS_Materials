class Time1{
	private int hour;
	private int minute;
	private int second;
	public Time1() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	public Time1(int hour) {
		
		this.hour = hour;
		this();
//		this.minute = 0;
//		this.second = 0;		
	}
	public Time1(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void printTime() {
		System.out.printf("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
	}
	public String toString() {
		int hour = getHour();
		hour = hour==0||hour==12?12:hour%12;
		return String.format("%02d:%02d:%02d",hour,getMinute(),getSecond());
	}
	
}
public class TimeTest {
	public static void main(String[] args) {
		Time1 t1= new Time1();
		Time1 t2 = new Time1(5, 10, 55);
		Time1 t3 = new Time1(6);
		t3.printTime();
		System.out.println(t3.toString());
		t2.printTime();
		System.out.println(t2.toString());
		
	}

}
