
public class Start {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MeatSeller msMeatSeller= new MeatSeller();

		Thread sellProcess;
		int sleepTime = 0; 
		
		sellProcess = new Thread(msMeatSeller);
		sellProcess.start();
		Thread.sleep(sleepTime);
		
		sellProcess = new Thread(msMeatSeller);
		sellProcess.start();
		Thread.sleep(sleepTime);
		
		sellProcess = new Thread(msMeatSeller);
		sellProcess.start();
		Thread.sleep(sleepTime);
		
		sellProcess = new Thread(msMeatSeller);
		sellProcess.start();
		Thread.sleep(sleepTime);
		
		sellProcess = new Thread(msMeatSeller);
		sellProcess.start();
		Thread.sleep(sleepTime);

		sellProcess = new Thread(msMeatSeller);
		sellProcess.start();
		Thread.sleep(sleepTime);
		
		sellProcess = new Thread(msMeatSeller);
		sellProcess.start();
		Thread.sleep(sleepTime);
		
		sellProcess = new Thread(msMeatSeller);
		sellProcess.start();
		Thread.sleep(sleepTime);
		
		System.out.println("Program is completed!");
	}

}
