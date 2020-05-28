public abstract class Clock {
	private String name;
	private String type;
	private double driftPerSecond;
	protected ClockTime clockTime;
	
	public Clock(String type, ClockTime clockTime, double driftPerSecond, String name) {
		this.name = name;
		this.type = type;
		this.clockTime = clockTime;
		this.driftPerSecond = driftPerSecond;
	}
	
	public abstract void reset();
	public abstract void tick();
	public abstract void displayTime();
	
	public String name() {
		return name;
	}
	public double driftPerSecond() {
		return driftPerSecond;
	}
}
