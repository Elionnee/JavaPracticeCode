package Pruebas1;

public class ThreadsMain {
	public static void main(String args[]) throws InterruptedException {
		Threads th = new Threads(); // Creo los 3 threads
		
		th.k.start();
		th.m.start();
		th.t.start();
		
		th.k.join();
		th.m.join();
		th.t.join();
		
		System.out.println(th.showResult());
		
	}
}
