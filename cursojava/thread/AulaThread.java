package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
	
		
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
	/*************************************************************************************/
         
		System.out.println("CHEGOU AO FIM DO CODIGO DO TESTE THREAD");
		JOptionPane.showMessageDialog(null, "Sistema continua execuntando para o usuario");
	}
	
	/********************************************************************************************/
	
	private static Runnable thread2 = new Runnable() {
		public void run() {
		for (int pos =0 ; pos < 10; pos++) {
		     System.out.println("Execuntando algo rotina, por exemplo envio de nota fiscal");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
         }
		
	};
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			for (int pos =0 ; pos < 10; pos++) {
			     System.out.println("Execuntando algo rotina, por exemplo envio de e-mail");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
             }
			
		}
	};

}
