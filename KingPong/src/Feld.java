import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JApplet;

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
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;


public class Feld extends JFrame {
int possy1 = 116;
int possy2 = 116;
int größe = 15;
int Count = 0;
int possy3 = 208;

int ballSpeedX = 1;
int ballSpeedY = 1;
int ballRadius = 20;
int posX;		
int posY;
int width = 450;
int height = 300;
int yes= 1;
JLabel ball;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Thread move = new Thread (this);
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
		contentPane.setBorder(new LineBorder(Color.CYAN, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		  ball = new JLabel("");
		 ball.setIcon(new ImageIcon("C:\\Users\\davids3\\Desktop\\F5OqdKdHDwu.png"));
		 ball.setBounds(204, 128, 16, 16);
		 contentPane.add(ball);
		
		 Canvas spl2 = new Canvas();
		 spl2.setBackground(Color.BLUE);
		 spl2.setBounds(409, 116, 15, 55);
		 contentPane.add(spl2);
		
		  Canvas spl1 = new Canvas();
		  spl1.setBackground(Color.RED);
		  spl1.setBounds(10, 116, 15, 55);
		  contentPane.add(spl1);
		  
		  Canvas linie = new Canvas();
		  linie.setBackground(Color.WHITE);
		  linie.setBounds(210, 0, 3, 261);
		  contentPane.add(linie);
		
		  
		
	//bewegen
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
				
				
	runo();			
		
		
	}
	

	public void runo() {
		System.out.println("yes");
		Thread Thread = new Thread();
		
try {	   
	        while (true) {
	          
	            posX += ballSpeedX;
	            posY += ballSpeedY;
	            ball.setLocation(posX,posY);
	            if (posX < 0) {
	                ballSpeedX = -ballSpeedX; 
	                posX = 0; 
	            } else if (posX + ballRadius > width) {
	                ballSpeedX = -ballSpeedX;
	                posX = width - ballRadius;

	                posY = 0;
	            } else if (posY + ballRadius > height) {
	                ballSpeedY = -ballSpeedY;
	                posY = height - ballRadius;
	            }
	         
	          Thread.sleep(100);
	        }
}catch(InterruptedException e){}
	}
	}

		

