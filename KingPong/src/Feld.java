import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swt.SWTResourceManager;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;


public class Feld extends JFrame {
int possy1 = 116;
int possy2 = 116;
int größe = 15;
int Count = 0;
int possy3 = 208;

// ;_;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feld frame = new Feld();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Feld() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Canvas spl2 = new Canvas();
		
		
		spl2.setBackground(Color.BLUE);
		spl2.setBounds(409, 116, 15, 55);
		contentPane.add(spl2);
		
		Canvas spl1 = new Canvas();
		
		
		
		spl1.setBackground(Color.RED);
		spl1.setBounds(10, 116, 15, 55);
		contentPane.add(spl1);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.WHITE);
		canvas.setBounds(210, 0, 3, 261);
		contentPane.add(canvas);
		
		Canvas Shlook = new Canvas();
		Shlook.setBackground(Color.WHITE);
		Shlook.setBounds(208, 128, 15, 15);
		contentPane.add(Shlook);
		
		
	
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_S) {
					possy1 = possy1 + größe;
					spl1.setBounds(10, possy1, 15, 55);
					System.out.println(possy1);
					System.out.println("DOWN1");
				}
				
				if(e.getKeyCode() == KeyEvent.VK_W) {
				System.out.println("UP1");
				possy1 = possy1 - größe;
				spl1.setBounds(10, possy1, 15, 55);
				}
				
			}});
				addKeyListener(new KeyAdapter() {
					public void keyPressed(KeyEvent d) {
					
					
						if(d.getKeyCode() == KeyEvent.VK_DOWN) {
							possy2 = possy2 + größe;
							spl2.setBounds(409, possy2, 15, 55);
							System.out.println(possy2);
							System.out.println("DOWN2");
						}
						
						if(d.getKeyCode() == KeyEvent.VK_UP) {
						System.out.println("UP2");
						possy2 = possy2 - größe;
						spl2.setBounds(409, possy2, 15, 55);
						}
						
					}});
				
			  
		
		
	}	
	
	
	public void move1() {
		  while (Count < 20) {
			  possy3 = possy3 - 5;
			  Shlook.setBounds(208, 128, 15, 15);
}}}
		

