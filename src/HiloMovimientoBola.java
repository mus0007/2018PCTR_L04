
public class HiloMovimientoBola extends Thread {
	private Ball bola;

	public HiloMovimientoBola() {
		// TODO Auto-generated constructor stub
	}
	public HiloMovimientoBola(Ball bola) {
		this.bola = bola;
	}
	
	public void run() {
		for(;;) {
			try {
				bola.move();
				//pintar
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void finalize() {
		Thread.interrupted();
	}
}
