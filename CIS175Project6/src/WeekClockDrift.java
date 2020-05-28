public class WeekClockDrift {
	public static void main(String[] args) {
		SundialClock sundialClock = new SundialClock("NaturalClock", new ClockTime(0, 0, 0), 0.0, "Sundial Clock");
		CuckooClock cuckooClock = new CuckooClock("Mechanical Clock", new ClockTime(0,0,0), 0.000694444, "Cuckoo Clock");
		GrandfatherClock grandfatherClock = new GrandfatherClock("Mechanical Clock", new ClockTime(0,0,0), 0.000347222, "Grandfather Clock");
		WristClock wristClock = new WristClock("Digital Clock", new ClockTime(0,0,0), 0.000034722, "Wrist Clock");
		AtomicClock atomicClock = new AtomicClock("Quantum Clock", new ClockTime(0,0,0), 0.0, "Atomic Clock");
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Reported clock times after resetting:"); 	
		System.out.println("=====================================");
		
		sundialClock.displayTime();
		cuckooClock.displayTime();
		grandfatherClock.displayTime();
		wristClock.displayTime();
		atomicClock.displayTime();

		for(int i = 0; i < 604800 ; ++i){
			sundialClock.tick();
			cuckooClock.tick();
			grandfatherClock.tick();
			wristClock.tick();
			atomicClock.tick();
		}
		
		System.out.println("\nRunning the clocks for one (1) week...\n");
		System.out.println("Reported clock times after running:");
		System.out.println("===================================");
		
		sundialClock.displayTime();
		cuckooClock.displayTime();
		grandfatherClock.displayTime();
		wristClock.displayTime();
		atomicClock.displayTime();
		
		System.out.println("-----------------------------------------------------------------------------");	
		System.out.println("\n\nTable 1 - Clock Drifts");
		System.out.println("======================\n");
		System.out.println("------------------------------------------------------------------------");
		System.out.printf("%-21s %-27s %s\n", "Clock Type", "Drift (amount per second)", "Comment");
		System.out.println("------------------------------------------------------------------------");
		System.out.printf("%-21s %-27.1f %s\n", sundialClock.name(), sundialClock.driftPerSecond(), "No drift");
		System.out.printf("%-21s %-27.1f %s\n", atomicClock.name(), atomicClock.driftPerSecond(), "No drift");
		System.out.printf("%-21s %-27.9f %s\n", cuckooClock.name(), cuckooClock.driftPerSecond(), "60 seconds per day");
		System.out.printf("%-21s %-27.9f %s\n", grandfatherClock.name(), grandfatherClock.driftPerSecond(), "30 seconds per day");
		System.out.printf("%-21s %-27.9f %s\n", wristClock.name(), wristClock.driftPerSecond(), " 3 seconds per day");
		System.out.println("------------------------------------------------------------------------");
	}
}
