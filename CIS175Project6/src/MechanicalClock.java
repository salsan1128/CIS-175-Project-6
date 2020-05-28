public abstract class MechanicalClock extends Clock {
	public MechanicalClock(String type, ClockTime clockTime, double driftPerSecond, String name) {
		super(type, clockTime, driftPerSecond, name);
	}
}
