package src;

import java.awt.Graphics;

public class HiloMovimientoBola extends Thread{
	private Ball bola;
	private Board board;

	public HiloMovimientoBola() {
		// TODO Auto-generated constructor stub
	}
	public HiloMovimientoBola(Ball bola, Board board) {
		this.bola = bola;
		this.board = board;
	}
	
	public void run() {
		for(;;) {
			try {
				bola.move();
				//pintar
				board.paint();
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
