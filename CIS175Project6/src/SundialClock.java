public class SundialClock extends NaturalClock {
	private double totalDrift = 0;
	
	public SundialClock(String type, ClockTime clockTime, double driftPerSecond, String name) {
		super(type, clockTime, driftPerSecond, name);
	}
	public void reset(){
		clockTime.restClockTime();
		totalDrift = 0;
	}
	public void tick() {
		clockTime.tick();
		totalDrift += driftPerSecond();
	}
	public void displayTime() {
		if(Math.abs(Math.ceil(totalDrift) - totalDrift) < 0.0001){
			System.out.printf("%-17s time [%s] - total drift = %.0f seconds %n", name(), clockTime.displayClockTime(), totalDrift);
		}
		else{
			System.out.printf("%-17s time [%s] - total drift = %.4f seconds %n", name(), clockTime.displayClockTime(), totalDrift);
		}
	}
}
