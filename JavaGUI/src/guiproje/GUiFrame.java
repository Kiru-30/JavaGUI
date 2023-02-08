package guiproje;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUiFrame extends JFrame{
	
	GUiFrame () {
		  // TODO Auto-generated method stub
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setTitle("CALCULATE SALARY");
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);

        //Screen size and position
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);

        //BACKGROUND
        JLabel background = new JLabel(new ImageIcon("123.jpg"));
        background.setSize(1280, 720);
        frame.setContentPane(background);
     
        
        //WELCOME
        JLabel welcome = new JLabel("WELCOME!");
        welcome.setFont(new Font("Saira Condensed", Font.BOLD, 55));
        welcome.setBounds(50, -330, 200, 50);
        welcome.setSize(800, 800);
        welcome.setForeground(Color.white);
        welcome.setOpaque(false);
   
        frame.add(welcome);
        
        //EMPLOYEE ID AND TEXTFIELD
        JLabel employeeID = new JLabel("EMPLOYEE ID :");
        employeeID.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        employeeID.setBounds(50, 115, 200, 50);
        employeeID.setSize(300, 30);
        employeeID.setForeground(Color.white);
        employeeID.setOpaque(false);
        frame.add(employeeID);
     
        
        JTextField employeeID1 = new JTextField();
        employeeID1.setBounds(50, 145, 200, 50);
        employeeID1.setSize(300, 30);
        employeeID1.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(employeeID1);
        employeeID1.setBackground(Color.decode("#ebedf0"));
   

        
        
        //EMPLOYEE NAME AND TEXTFIELD
        JLabel emplooyeeName = new JLabel("EMPLOYEE NAME :");
        emplooyeeName.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        emplooyeeName.setBounds(50, 172, 200, 50);
        emplooyeeName.setSize(300, 30);
        emplooyeeName.setForeground(Color.white);
        emplooyeeName.setOpaque(false);
        frame.add(emplooyeeName);
        
        
        JTextField emplooyeeName1 = new JTextField();
        emplooyeeName1.setBounds(50, 200, 200, 50);
        emplooyeeName1.setSize(300, 30);
        emplooyeeName1.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(emplooyeeName1);
        emplooyeeName1.setBackground(Color.decode("#D9D9D9"));
      
        
        
        //EMPLOYEE POSITION AND TEXFIELD
        JLabel Position = new JLabel("EMPLOYEE POSITION :");
        Position.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        Position.setBounds(50, 227, 200, 50);
        Position.setSize(300, 30);
        Position.setForeground(Color.white);
        Position.setOpaque(false);
        frame.add(Position);
      
        
        JTextField employeePosition1 = new JTextField();
        employeePosition1.setBounds(50, 253, 200, 50);
        employeePosition1.setSize(300, 30);
        employeePosition1.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(employeePosition1);
        employeePosition1.setBackground(Color.decode("#D9D9D9"));

        
      //EMPLOYEE WORKING HOUR AND TEXFIELD
        JLabel Workinghrs = new JLabel("WORKING HOUR :");
        Workinghrs.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        Workinghrs.setBounds(50, 280, 200, 50);
        Workinghrs.setSize(300, 30);
        Workinghrs.setForeground(Color.white);
        Workinghrs.setOpaque(false);
        frame.add(Workinghrs);
       
        
        JTextField Workinghrs1 = new JTextField();
        Workinghrs1.setBounds(50, 306, 200, 50);
        Workinghrs1.setSize(300, 30);
        Workinghrs1.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(Workinghrs1);
        Workinghrs1.setBackground(Color.decode("#D9D9D9"));
        
        
        
      //EMPLOYEE RATE  AND TEXFIELD
        JLabel employeeRate = new JLabel("RATE :");
        employeeRate.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        employeeRate.setBounds(50, 332, 200, 50);
        employeeRate.setSize(300, 30);
        employeeRate.setForeground(Color.white);
        employeeRate.setOpaque(false);
        frame.add(employeeRate);
        
        
        
        JTextField employeeRate1 = new JTextField();
        employeeRate1.setBounds(50, 359, 200, 50);
        employeeRate1.setSize(300, 30);
        employeeRate1.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(employeeRate1);
        employeeRate1.setBackground(Color.decode("#D9D9D9"));
   
        
        
      //EMPLOYEE RATE  AND TEXFIELD
        JLabel Overtime = new JLabel("OVERTIME :");
        Overtime.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        Overtime.setBounds(50, 387, 200, 50);
        Overtime.setSize(300, 30);
        Overtime.setForeground(Color.white);
        Overtime.setOpaque(false);
        frame.add(Overtime);
     
        
        JTextField Overtime1 = new JTextField();
        Overtime1.setBounds(50, 416, 200, 50);
        Overtime1.setSize(300, 30);
        Overtime1.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(Overtime1);
        Overtime1.setBackground(Color.decode("#D9D9D9"));

        
        JButton bottomButton = new JButton("CALCULATE");
        bottomButton.setBounds(100, 460, 200, 50);
        bottomButton.setSize(200, 50);
        bottomButton.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        bottomButton.setFocusable(false);
        frame.add(bottomButton);
        bottomButton.setFocusable(false);
        frame.setContentPane(background);
       
        
     // JOptionPane message
        UIManager.put("OptionPane.messageFont", new Font("Saira Condensed", Font.PLAIN, 12));
       
        // Add action listener for the bottom button
        bottomButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the employee information from the text fields
                String employeeName = emplooyeeName1.getText();
                String position = employeePosition1.getText();
                String workHrsInput = Workinghrs1.getText();
                String rateInput = employeeRate1.getText();
                String overtimeInput = Overtime1.getText();

                // CONVERTION
                float workHrs = Float.parseFloat(workHrsInput);
                float rate = Float.parseFloat(rateInput);
                float overtime = Float.parseFloat(overtimeInput);

                // TOTAL HR
                float totalhours = workHrs + overtime;

                // GROSS PAY
                float grossPay = (totalhours * rate) * 5 * 4;

                // CONTRIBUTIONS
                float philHealth = (float) (grossPay * 0.04);
                float pagIbig = (float) (grossPay * 0.02);
                float sss = (float) (grossPay * 0.012);

                // NET PAY
                float netPay = (float) grossPay - philHealth - sss - pagIbig;

                // MESSAGE DISPLAY
                String message = "EMPLOYEE NAME: " + employeeName +
                                 "\nPOSITION: " + position +
                                 "\nGROSS PAY: " + Float.toString(grossPay) +
                                 "\nPHILHEALTH: " + Float.toString(philHealth) +
                                 "\nPAG IBIG: " + Float.toString(pagIbig) +
                                 "\nSSS: " + Float.toString(sss) +
                                 "\nNETPAY: " + Float.toString(netPay);
                JOptionPane.showMessageDialog(null, message);
                
            }
        });

	}
}
	