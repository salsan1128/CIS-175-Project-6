public abstract class QuantumClock extends Clock {
	public QuantumClock(String type, ClockTime clockTime, double driftPerSecond, String name) {
		super(type, clockTime, driftPerSecond, name);
	}
}
