package schedular;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("take a call in the highest level Customer");	
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("divided by superb Collector");	
	}

}
