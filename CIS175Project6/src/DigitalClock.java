public abstract class DigitalClock extends Clock {
	public DigitalClock(String type, ClockTime clockTime, double driftPerSecond, String name) {
		super(type, clockTime, driftPerSecond, name);
	}
}
