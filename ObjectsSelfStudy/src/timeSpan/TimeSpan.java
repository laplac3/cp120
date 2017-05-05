package timeSpan;

public class TimeSpan {

	private int hours;
	private int minutes;
		
	public TimeSpan(int hours, int minutes) {
		this.hours=0;
		this.minutes=0;
		addTime(hours,minutes);
	}
	
	public TimeSpan(int minutes ) {
		addTime(0,minutes);
	}
	
	public TimeSpan( ) {
		addTime(0,0);
	}
	
	public int getHours() {
		return this.hours;
	}
	
	public int getMinutes() {
		return this.minutes;
	}

	public void addTime(int hours, int minutes) {
		if (hours<0 || minutes < 0) {
			throw new IllegalArgumentException();
		}
		this.hours +=hours;
		this.minutes +=minutes;
		
		this.hours =hours + minutes / 60;
		this.minutes=minutes % 60;
	}
	
	public String toString() {
		return hours + "h " + minutes + "m";
	}
	
	public StringBuilder toStringMinutes() {
		StringBuilder str = new StringBuilder();
		if (minutes < 10)
			str = str.append("0").append(minutes);
		else
			str = str.append(minutes);
		return str;
	}
	
	public StringBuilder time() {
		StringBuilder time = new StringBuilder(); 
		
		if (hours / 12 !=0)
			time = time.append(hours % 12).append(":").append(toStringMinutes()).append("pm");
		else
			time = time.append(hours % 12).append(":").append(toStringMinutes()).append("am");
		return time;
	}
	
	

}
