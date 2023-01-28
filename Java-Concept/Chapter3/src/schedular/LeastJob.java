package schedular;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("take a call in list one at a time");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("allocate Collector is the least waiting");
	}

}
