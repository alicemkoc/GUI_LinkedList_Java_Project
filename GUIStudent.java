import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUIStudent extends JFrame {
	
	private JPanel centerPanel=new JPanel();
	JPanel studentPanel=new JPanel();
	
	public GUIStudent(){
		this.setBounds(new Rectangle(400, 400));
		this.setTitle("Class Room Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		createStudentMenuPanel();
		buildCenterPanel();
		this.setVisible(true);
		
		
		
	}
	public static void main(String []args){
		new GUIStudent();
		
	}
	
	private void createStudentMenuPanel(){
		MyButtonListener myListener=new MyButtonListener();
		
		JButton inserBtn=new JButton("Insert Student");
		JButton printBtn=new JButton("Print Students");
		studentPanel.setLayout(new FlowLayout()	);
		studentPanel.add(inserBtn);
		studentPanel.add(printBtn);
		
		inserBtn.addActionListener(myListener);
		
		//studentPanel.setVisible(true);
		this.getContentPane().add(studentPanel,BorderLayout.NORTH);
	}
	private class MyButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			centerPanel.setVisible(true);
		}
		
	}
	private void buildCenterPanel(){
		//JPanel centerPanel=new JPanel();
		centerPanel.setBorder( BorderFactory.createRaisedBevelBorder());
		centerPanel.setLayout(new FlowLayout());
		JLabel nameLabel=new JLabel("Name Surname:");
		JTextField nameTxtField=new JTextField(10);
		centerPanel.add(nameLabel);
		centerPanel.add(nameTxtField);
		centerPanel.setVisible(false);
		this.getContentPane().add(centerPanel,BorderLayout.CENTER);
				
	}

}
