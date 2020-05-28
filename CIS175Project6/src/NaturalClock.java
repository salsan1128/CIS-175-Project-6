public abstract class NaturalClock extends Clock {
	public NaturalClock(String type, ClockTime clockTime, double driftPerSecond, String name) {
		super(type, clockTime, driftPerSecond, name);
	}
}
