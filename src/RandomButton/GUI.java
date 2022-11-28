 package RandomButton;

    import java.awt.EventQueue;
    import java.util.Random;
    import java.util.Scanner;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.border.EmptyBorder;
    import javax.swing.JButton;
    import java.awt.Font;
    import java .awt.List;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
    import javax.swing.JTextField;
    import javax.swing.SwingConstants;
    import javax.swing.JLabel;

    public class GUI extends JFrame {

        private final JPanel contentPanel;
        private final JTextField textField;
        private JLabel label;

        /**
         * Launch the application.
     * @param args
         */
        public static void main(String[] args) {
            EventQueue.invokeLater(() -> {
                try {
                    GUI frame = new GUI();
                    frame.setVisible(true);
                    frame.setResizable(false);
                } catch (Exception e) {
                    
                }
            });
        }
    

        /**
         * Create the frame.
         */
        public GUI() {
            int x;
            int x2;
            int x3;
            int x4;
            int x5;
            int max ;
            String strMax;
            String strX;
            String strX2;
            String strX3;
            String strX4;
            String strX5;
            Scanner kb = new Scanner(System.in);
            
            
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 1280, 720);
            contentPanel = new JPanel();
            contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPanel);
            contentPanel.setLayout(null);

            //Text field code
            textField = new JTextField();
            textField.setText("1");
            textField.setHorizontalAlignment(SwingConstants.CENTER);
            textField.setBounds(450, 350, 414, 35);
            contentPanel.add(textField);
            textField.setColumns(10);

            //Randomize button code
            JButton btnNewButton = new JButton("Generate!");
            btnNewButton.setFont(new Font("TimesNewRoman", Font.BOLD, 40));
            btnNewButton.setBounds(450, 400, 414, 54);
            contentPanel.add(btnNewButton);

            // the listener
            btnNewButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    Random num = new Random();
                    String strMax = textField.getText();
                    int max = Integer.parseInt(strMax);
                    int x = num.nextInt(max) + 1;
                    String strX= String.valueOf(x);
                    
                    int x2 = num.nextInt(max) + 1;
                    String strX2= String.valueOf(x2);
                                                      
                    int x3 = num.nextInt(max) + 1;
                    String strX3= String.valueOf(x3);
                                     
                    int x4 = num.nextInt(max) + 1;
                    String strX4= String.valueOf(x4);
                                     
                    int x5 = num.nextInt(max) + 1;
                    String strX5= String.valueOf(x5);
                    
                    
                    label.setText(strX+" , "+strX2+" , "+strX3+" , "+strX4+" , "+strX5);
                }
            });

            //Label code
            label = new JLabel();
            label.setFont(new Font("TimesNewRoman", Font.PLAIN, 70));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setBounds(10, 11, 1280, 103);
            contentPanel.add(label);

            //math code
            Random num1 = new Random();
            label.setText(String.valueOf(num1.nextInt(Integer.parseInt(textField.getText())) + 1));
            
            label.setText(String.valueOf(num1.nextInt(Integer.parseInt(textField.getText())) + 1));
            
            label.setText(String.valueOf(num1.nextInt(Integer.parseInt(textField.getText())) + 1));
                   
            label.setText(String.valueOf(num1.nextInt(Integer.parseInt(textField.getText())) + 1));
                      
            label.setText(String.valueOf(num1.nextInt(Integer.parseInt(textField.getText())) + 1));
            
            
            
            
        }
    }