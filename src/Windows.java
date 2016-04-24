import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class Windows {
	static String path="C:\\Users\\Bledar\\Desktop\\hosts";
	//static String path="C:\\Windows\\System32\\drivers\\etc\\hosts";
	JFrame dritare=new JFrame("Modifiko Host");
	JButton fshije=new JButton("Fshije");
	JPanel trupi=new JPanel();
	JList lista;
	JLabel teksti= new JLabel("Shtoni nje host!");
	ManipulateHost host=new ManipulateHost(); 
	DefaultListModel model;
	void setDritare(int gj ,int l){
		dritare.setVisible(true);	
		dritare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dritare.setResizable(false);
		dritare.setSize(gj, l);	
		this.setPanel();
	}
	
	void setPanel(){
		trupi.setLayout(null);
		trupi.setBackground( new Color(200,200,200));
		dritare.add(trupi);
		host.setPath(path);
		host.openFile();
		host.readHost();
		host.closeFile();
		//System.out.println(host.getList().get(0));
		int h=host.getList().size();
		lista.setBackground( new Color(222,222,222));
		lista.setBounds(15,15,300,h*20);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		trupi.add(lista);
		trupi.repaint();
		this.setFshije();
	}
	
	public void setFshije(){
		fshije.setBounds(325, 15, 120,30);
		trupi.add(fshije);
		fshije.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){ 
				int index = lista.getSelectedIndex();
				System.out.println(index);
				//lista.remove();
				//lista.repaint();
			}	
			
		});
	}
}
