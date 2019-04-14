import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;

public class gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
<<<<<<< HEAD
		// student id:300293244
        // sumit singh

=======
		/* Name: Yan Cheng Ren
		 Student ID: 300179993
		*/
>>>>>>> daac8bb34850f11efa89b2cadafcb8eaf83c164f
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnHello = new JButton("Hello");
		btnHello.setBounds(83, 122, 89, 23);
		frame.getContentPane().add(btnHello);
	}
}
