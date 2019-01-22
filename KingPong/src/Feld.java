import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swt.SWTResourceManager;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;


public class Feld extends JFrame {
int possy1 = 116;
int possy2 = 116;

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
		
		
		spl2.setBackground(Color.WHITE);
		spl2.setBounds(409, 116, 15, 55);
		contentPane.add(spl2);
		
		Canvas spl1 = new Canvas();
		
		
		
		spl1.setBackground(Color.WHITE);
		spl1.setBounds(10, 116, 15, 55);
		contentPane.add(spl1);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.WHITE);
		canvas.setBounds(210, 0, 3, 261);
		contentPane.add(canvas);
	
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_S) {
					possy1 = possy1 + 5;
					spl1.setBounds(10, possy1, 15, 55);
					System.out.println(possy1);
					System.out.println("DOWN");
				}
				
				if(e.getKeyCode() == KeyEvent.VK_W) {
				System.out.println("UP");
				possy1 = possy1 - 5;
				spl1.setBounds(10, possy1, 15, 55);
			
			
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					possy2 = possy2 + 5;
					spl2.setBounds(409, possy2, 15, 55);
					System.out.println(possy1);
					System.out.println("DOWN");
				}
				
				if(e.getKeyCode() == KeyEvent.VK_UP) {
				System.out.println("UP");
				possy2 = possy2 - 5;
				spl2.setBounds(409, possy2, 15, 55);
				
			}}
				}});
		

