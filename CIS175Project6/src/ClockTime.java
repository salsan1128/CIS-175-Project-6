public class ClockTime {
	private int hour = 0;
	private int minute = 0;
	private int seconds = 0;
	
	public ClockTime(int hour, int minute, int seconds) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSeconds() {
		return seconds;
	}
	public void restClockTime() {
		hour = 0;
		minute = 0;
		seconds = 0;
	}
	public void tick() {
		++seconds;
		
		if(hour == 24) {
			hour = 0;
		}
		if(seconds > 59) {
			seconds = 0;
			++minute;
		}
		if(minute > 59) {
			minute = 0;
			++hour;
		}
	}
	public String displayClockTime() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSeconds());
	}
}