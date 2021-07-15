package Pruebas1;


public class Threads implements Runnable {

	private int a = 20;
	private int b = 50;
	private int c = 70;
	private int result = 0;
	
	Thread t, m, k;
	
	Threads() {
		t = new Thread(this, "Thread 1");
		m = new Thread(this, "Thread 2");
		k = new Thread(this, "Thread 3");
	}
	
	@Override
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				result = a + b;
				b = 30;
				result += b + c;
				
				result += Thread.currentThread().getId();
				System.out.println(showResult() + "Thread : " + Thread.currentThread().getId());
				
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupción de un thread hijo");
		}
		System.out.println("Saliendo del thread hijo" + Thread.currentThread());
		
	}
	
	public int showResult() {
		return result;
	}

}
