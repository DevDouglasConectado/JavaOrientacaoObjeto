package cursojava.threadTela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	
	private JLabel descricaoHora = new JLabel("Time Thread"); /*Label*/
	private JTextField mostraTempo = new JTextField();/* area texto*/
	
	private JLabel descricaoHora2 = new JLabel("Time Thread");
	private JTextField mostraTempo2 = new JTextField();
	
    /*botaoes*/ 
	private JButton jButton = new JButton("Start");
    private JButton jButton2 = new JButton("Stop");
    /*********/
    /*Thread*/
    private Runnable theread1 =  new Runnable() {
    	@Override
    	public void run() {
    		while(true) {/*fica semre rodando*/
    			mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
    			try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	}
    	
    };
    
    private Thread thread1Time;
    
    
    /**/
   
	
        /*--------Constutor - execução-----------*/
	    public TelaTimeThread() {

	    /* 1- Inicio*/	
		setTitle("Minha tela de time com Thread");  /*titulo */
		setSize(new Dimension(240,240));   /*Determina dimenção*/
		setLocationRelativeTo(null);  /*centraliza no meio da tela*/
		setResizable(false);  /*não deixa redimencionar manual*/
		
		/* 2 - tela*/
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0; 
		
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25)); /**/
		jPanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo2.setEditable(false);
        jPanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		/*botoes*/
		jButton.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
		
		/*******/
		/*ação do botão*/
		
	
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
		/*----FIM----Constutor - execução----FIM-------*/
		
	}
	
}
