
import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class cafe extends JFrame implements ActionListener{
	private static int width = 1000;
	private static int height = 800;
	public static int NUMBER_OF_CHAR = 50;
	private JTextField search;
	caffeine menu1;
	noncaffeine menu2;
	
	 private class SearchListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	        	String buttonCommand = search.getText();
	        	//String buttonCommand = e.getActionCommand();
			      
	        	 try {
						recipetext A = new recipetext(buttonCommand);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "메뉴를 찾을 수 없습니다. 다시 입력하세요");
					}  
	        }
	    }
	 
	 private class ButtonListener implements ActionListener
		{
		 public void actionPerformed(ActionEvent e)
	        {
			 String buttonCommand = e.getActionCommand();
		   
			 try {
					recipetext A = new recipetext(buttonCommand);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
	        }
		}

	public cafe()
	{
		super("Cafe Menu");
		setSize(width, height);
		setLayout(new BorderLayout());
		JPanel searchPanel = new JPanel();
		searchPanel.setLayout(new GridLayout(2, 1));
		
		search = new JTextField("메뉴이름을 검색하세요.", NUMBER_OF_CHAR);
		search.setBackground(Color.white);
		searchPanel.add(search);
		
		JButton searchButton = new JButton("search");
		searchButton.addActionListener(new SearchListener());
		searchPanel.add(searchButton);
		add(searchPanel, BorderLayout.NORTH);
		
		JPanel caf = new JPanel();
		caf.setLayout(new GridLayout(4,4));
		
		JPanel ameri = new JPanel();
		ameri.setLayout(new BorderLayout());
		ameri.setBackground(Color.WHITE);
		ImageIcon ameimg = new ImageIcon("src//americano.jpg");
		Image ame = ameimg.getImage();
	    Image neame = ame.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon ameimg2 = new ImageIcon(neame);
		JLabel am = new JLabel(ameimg2);
		ameri.add(am, BorderLayout.CENTER);
		JButton americano = new JButton("americano");
		americano.addActionListener(new ButtonListener());
		ameri.add(americano, BorderLayout.SOUTH);
		
		JPanel lat = new JPanel();
		lat.setLayout(new BorderLayout());
		ImageIcon latimg = new ImageIcon("src//cafelatte.jpg");
		Image la = latimg.getImage();
		Image nela = la.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon latimg2 = new ImageIcon(nela);
		JLabel laaa = new JLabel(latimg2);
		JButton cafelatte = new JButton("cafelatte");
		cafelatte.addActionListener(new ButtonListener());
		lat.setBackground(Color.WHITE);
		lat.add(laaa, BorderLayout.CENTER);
		lat.add(cafelatte, BorderLayout.SOUTH);
		
		JPanel moc = new JPanel(); 
		moc.setLayout(new BorderLayout());
		ImageIcon mocimg = new ImageIcon("src//cafemocha.jpg");
		Image mo = mocimg.getImage();
		Image nemo = mo.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon mocimg2 = new ImageIcon(nemo);
		JLabel moo = new JLabel(mocimg2);
		JButton cafemocha = new JButton("cafemocha");
		cafemocha.addActionListener(new ButtonListener());
		moc.setBackground(Color.WHITE);
		moc.add(moo, BorderLayout.CENTER);
		moc.add(cafemocha, BorderLayout.SOUTH);
		
		JPanel van = new JPanel();
		van.setLayout(new BorderLayout());
		ImageIcon vanimg = new ImageIcon("src//vanillalatte.jpg");
		Image va = vanimg.getImage();
		Image neva = va.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon vanimg2 = new ImageIcon(neva);
		JLabel vaa = new JLabel(vanimg2);
		JButton vanillalatte = new JButton("vanillalatte");
		vanillalatte.addActionListener(new ButtonListener());
		van.setBackground(Color.WHITE);
		van.add(vaa, BorderLayout.CENTER);
		van.add(vanillalatte, BorderLayout.SOUTH);
		
		JPanel haz = new JPanel();
		haz.setLayout(new BorderLayout());
		ImageIcon hazimg = new ImageIcon("src//hazelnutslatte.jpg");
		Image ha = hazimg.getImage();
		Image neha = ha.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon hazimg2 = new ImageIcon(neha);
		JLabel haaa = new JLabel(hazimg2);
		JButton hazelnutslatte = new JButton("hazelnutslatte");
		hazelnutslatte.addActionListener(new ButtonListener());
		haz.setBackground(Color.WHITE);
		haz.add(haaa, BorderLayout.CENTER);
		haz.add(hazelnutslatte, BorderLayout.SOUTH);
		
		JPanel carf = new JPanel();
		carf.setLayout(new BorderLayout());
		ImageIcon carfimg = new ImageIcon("src//caramelfrappuccino.jpg");
		Image carF = carfimg.getImage();
		Image necarF = carF.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon carfimg2 = new ImageIcon(necarF);
		JLabel caF = new JLabel(carfimg2);
		JButton caramelfrappuccino = new JButton("caramelfrappuccino");
		caramelfrappuccino.addActionListener(new ButtonListener());
		carf.setBackground(Color.WHITE);
		carf.add(caF, BorderLayout.CENTER);
		carf.add(caramelfrappuccino, BorderLayout.SOUTH);
		
		JPanel carm = new JPanel();
		carm.setLayout(new BorderLayout());
		ImageIcon carmimg = new ImageIcon("src//caramelmacchiato.jpg");
		Image carM = carmimg.getImage();
		Image necarM = carM.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
		ImageIcon carmimg2 = new ImageIcon(necarM);
		JLabel caM = new JLabel(carmimg2);
		JButton caramelmacchiato = new JButton("caramelmacchiato");
		caramelmacchiato.addActionListener(new ButtonListener());
		carm.setBackground(Color.WHITE);
		carm.add(caM, BorderLayout.CENTER);
		carm.add(caramelmacchiato, BorderLayout.SOUTH);
		
		JPanel yog = new JPanel();
	     yog.setLayout(new BorderLayout());
	     ImageIcon yogimg = new ImageIcon("src//yogurtsmoothie.jpg");
	     Image yogg = yogimg.getImage();
	     Image neyogg = yogg.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon yogimg2 = new ImageIcon(neyogg);
	     JLabel yo = new JLabel(yogimg2);
	     JButton yogurtsmoothie = new JButton("yogurtsmoothie");
	     yogurtsmoothie.addActionListener(new ButtonListener());
	     yog.setBackground(Color.WHITE);
	     yog.add(yo, BorderLayout.CENTER);
	     yog.add(yogurtsmoothie, BorderLayout.SOUTH);
	     
	     JPanel lem = new JPanel();
	     lem.setLayout(new BorderLayout());
	     ImageIcon lemimg = new ImageIcon("src//lemonade.jpg");
	     Image lemm = lemimg.getImage();
	     Image nelemm = lemm.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon lemimg2 = new ImageIcon(nelemm);
	     JLabel le = new JLabel(lemimg2);
	     JButton lemonade = new JButton("lemonade");
	     lemonade.addActionListener(new ButtonListener());
	     lem.setBackground(Color.WHITE);
	     lem.add(le, BorderLayout.CENTER);
	     lem.add(lemonade, BorderLayout.SOUTH);
	     
	     JPanel graf = new JPanel(); 
	     graf.setLayout(new BorderLayout());
	     ImageIcon grafimg = new ImageIcon("src//grapefruitade.jpg");
	     Image graff = grafimg.getImage();
	     Image negraff = graff.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon grafimg2 = new ImageIcon(negraff);
	     JLabel gr = new JLabel(grafimg2);
	     JButton grapefruitade = new JButton("grapefruitade");
	     grapefruitade.addActionListener(new ButtonListener());
	     graf.setBackground(Color.WHITE);
	     graf.add(gr, BorderLayout.CENTER);
	     graf.add(grapefruitade, BorderLayout.SOUTH);
	     
	     JPanel chol = new JPanel();
	     chol.setLayout(new BorderLayout());
	     ImageIcon choimg = new ImageIcon("src//chocolatte.jpg");
	     Image choll = choimg.getImage();
	     Image necholl = choll.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon choimg2 = new ImageIcon(necholl);
	     JLabel cl = new JLabel(choimg2);
	     JButton chocolatte = new JButton("chocolatte");
	     chocolatte.addActionListener(new ButtonListener());
	     chol.setBackground(Color.WHITE);
	     chol.add(cl, BorderLayout.CENTER);
	     chol.add(chocolatte, BorderLayout.SOUTH);
	     
	     JPanel grel = new JPanel();
	     grel.setLayout(new BorderLayout());
	     ImageIcon grelimg = new ImageIcon("src//greentealatte.jpg");
	     Image grelll = grelimg.getImage();
	     Image negrelll = grelll.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon grelimg2 = new ImageIcon(negrelll);
	     JLabel gl = new JLabel(grelimg2);
	     JButton greentealatte = new JButton("greentealatte");
	     greentealatte.addActionListener(new ButtonListener());
	     grel.setBackground(Color.WHITE);
	     grel.add(gl, BorderLayout.CENTER);
	     grel.add(greentealatte, BorderLayout.SOUTH);
	     
	     JPanel mincl = new JPanel();
	     mincl.setLayout(new BorderLayout());
	     ImageIcon mclimg = new ImageIcon("src//mintchocolatte.jpg");
	     Image mcl = mclimg.getImage();
	     Image nemcl = mcl.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon mclimg2 = new ImageIcon(nemcl);
	     JLabel mc = new JLabel(mclimg2);
	     JButton mintchocolatte = new JButton("mintchocolatte");
	     mintchocolatte.addActionListener(new ButtonListener());
	     mincl.setBackground(Color.WHITE);
	     mincl.add(mc, BorderLayout.CENTER);
	     mincl.add(mintchocolatte, BorderLayout.SOUTH);
	     
	     JPanel chof = new JPanel();
	     chof.setLayout(new BorderLayout());
	     ImageIcon cF = new ImageIcon("src//chocofrappucino.jpg");
	     Image cf = cF.getImage();
	     Image necf = cf.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon cF2 = new ImageIcon(necf);
	     JLabel cFF = new JLabel(cF2);
	     JButton chocofrappucino = new JButton("chocofrappucino");
	     chocofrappucino.addActionListener(new ButtonListener());
	     chof.setBackground(Color.WHITE);
	     chof.add(cFF, BorderLayout.CENTER);
	     chof.add(chocofrappucino, BorderLayout.SOUTH);
	     
	     JPanel gref = new JPanel();
	     gref.setLayout(new BorderLayout());
	     ImageIcon grfimg = new ImageIcon("src//greenteafrappuccino.jpg");
	     Image grf = grfimg.getImage();
	     Image negrf = grf.getScaledInstance(230, 330, Image.SCALE_DEFAULT);
	     ImageIcon grfimg2 = new ImageIcon(negrf);
	     JLabel gF = new JLabel(grfimg2);
	     JButton greenteafrappuccino = new JButton("greenteafrappuccino");
	     greenteafrappuccino.addActionListener(new ButtonListener());
	     gref.setBackground(Color.WHITE);
	     gref.add(gF, BorderLayout.CENTER);
	     gref.add(greenteafrappuccino, BorderLayout.SOUTH);
		
		caf.add(ameri);
		caf.add(lat);
		caf.add(moc);
		caf.add(van);
		caf.add(haz);
		caf.add(carm);
		caf.add(carf);
		caf.add(yog);
	    caf.add(lem);
	    caf.add(graf);
	    caf.add(chol);
	    caf.add(grel);
	    caf.add(mincl);
	    caf.add(chof);
	    caf.add(gref);
	    add(caf, BorderLayout.CENTER);
	    
	    JScrollPane scroll = new JScrollPane(caf);
	    add(scroll);
		
		
		JMenu menu = new JMenu("menu");
		JMenuItem caffeine = new JMenuItem("caffeine");
		caffeine.addActionListener(this);
		menu.add(caffeine);
		JMenuItem noncaffeine = new JMenuItem("noncaffeine");
		noncaffeine.addActionListener(this);
		menu.add(noncaffeine);
		
		JMenuBar bar = new JMenuBar();
		bar.add(menu);
		setJMenuBar(bar);	
	
		setVisible(true);
		
	}		

	public void actionPerformed(ActionEvent e) {
		String buttonString = e.getActionCommand();
		
		if(buttonString.equals("caffeine"))
		{
			menu1 = new caffeine();
			menu1.setVisible(true);
		}
		else if(buttonString.equals("noncaffeine"))
		{
			menu2 = new noncaffeine();
			menu2.setVisible(true);
		}
		else
		{
			System.out.println("unexpected error");
		}
	}
	

}
