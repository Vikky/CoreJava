public class Threads {
	/**
	 * @param args
	 * @author vikky.agrawal
	 */

	public static void main(String args[]) {

		Semaphore mutex = new Semaphore();

		Producer producer = new Producer(mutex);
		Consumer consumer = new Consumer(mutex);

		System.out.println("Main starts");

		producer.start();
		consumer.start();

		try {
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main Stop");
	}
}

class Consumer extends Thread {

	Semaphore mutex;

	Consumer(Semaphore mutex) {
		super("Consumer");
		this.mutex = mutex;
	}

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			
			try {
				sleep(1000);
				mutex.down();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class Producer extends Thread {

	Semaphore mutex;

	Producer(Semaphore mutex) {
		super("producer");
		this.mutex = mutex;

	}
	
	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {			
			mutex.up();			
			try {
				sleep(10);
			} catch (InterruptedException e) {
			}

		}

	}
}

class Semaphore {

	static int value = 0;
	boolean available = false;
	
	public synchronized void down() {
		while (!available) {
			try {
				
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//System.out.println("Consumer woke up from waiting");
		}
		value--;
		System.out.println("Consumed now value : "+value);
		available = false;
		notify();		
	}

	public synchronized void up() {

		while (available) {
			try {
				wait();
				//System.out.println("Producer Got a notification and available is now: "+available);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//System.out.println("Producer woke up from waiting");
		}
		value++;
		System.out.println("Produced now value :"+ value);
		available = true;
		notify();		
	}
}
