import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class Nderfaqja {
	static String path="C:\\Users\\Bledar\\Desktop\\hosts";
	//static String path="C:\\Windows\\System32\\drivers\\etc\\hosts";
	JFrame dritare=new JFrame("Modifiko Host");
	JButton fshije=new JButton("Fshije");
	JPanel trupi=new JPanel();
	JList lista;
	JLabel teksti= new JLabel("Shtoni nje host!");
	LexoHost host=new LexoHost(); 
	
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
		host.readFile();
		host.closeFile();
		System.out.println(host.getLista().get(0));
		lista = new JList<Object>(host.getLista().toArray());
		int h=host.getLista().size();
		lista.setBackground( new Color(222,222,222));
		lista.setBounds(15,15,300,h*20);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		trupi.add(lista);
		fshije.setBounds(325, 15, 120,30);
		trupi.add(fshije);
		trupi.repaint();
	}
}
