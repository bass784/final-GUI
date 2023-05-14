
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class new_game extends JFrame {

    public static String gameData;
     public static boolean guest;
    public static String whitePlayer ;
    public static String blackPlayer ;
    public static String Winner;
    public static String status2;
    public static String Time;
    //method to check password
    public static boolean isNotNumeric(String strNum) {
        if (strNum == null) {
            return true;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return true;
        }
        return false;
    } public new_game(boolean if_guest)
    {
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setResizable(false);
        frame.setTitle("chess game");
        ImageIcon image = new ImageIcon("C:\\Users\\bassa\\OneDrive\\Documents\\FinalProject\\test-project\\Test1\\src\\resources\\logo.jpg");
        frame.setIconImage(image.getImage());
        JLabel label = new JLabel();
        ImageIcon cover = new ImageIcon("C:\\Users\\bassa\\OneDrive\\Documents\\FinalProject\\test-project\\Test1\\src\\resources\\new page44_802x800.jpeg");
        label.setIcon(cover);
        label.setBounds(250, 100, 400, 100);
        JLabel White = new JLabel("White Player: ");
        White.setBounds(200, 100, 300, 100);
        White.setFont(new Font("Callibri", Font.BOLD, 20));
        White.setForeground(new Color(247, 252, 252));
        label.add(White);
        JLabel Black = new JLabel("Black Player: ");
        Black.setBounds(200, 170, 300, 100);
        Black.setFont(new Font("Callibri", Font.BOLD, 20));
        Black.setForeground(new Color(247, 252, 252));
        label.add(Black);
        JLabel Timer = new JLabel("Timer: ");
        Timer.setBounds(230, 220, 300, 100);
        Timer.setFont(new Font("Callibri", Font.BOLD, 22));
        Timer.setForeground(new Color(247, 252, 252));
        label.add(Timer);

        JTextField BlackPlayer = new JTextField();
        BlackPlayer.setBounds(328, 140, 260, 40);
        BlackPlayer.setFont(new Font("Callibri", Font.BOLD, 15));
        BlackPlayer.setForeground(Color.black);
        label.add(BlackPlayer);
        JTextField WhitePlayer = new JTextField();
        WhitePlayer.setBounds(328, 200, 260, 40);
        WhitePlayer.setFont(new Font("Callibri", Font.BOLD, 15));
        WhitePlayer.setForeground(Color.black);
        label.add(WhitePlayer);
        JTextField Time = new JTextField();
        Time.setBounds(328, 260, 260, 40);
        Time.setFont(new Font("Callibri", Font.BOLD, 15));
        Time.setForeground(Color.black);
        label.add(Time);
        JButton BACKButton = new JButton("Back");
        BACKButton.setBounds(328, 350, 120, 50);
        BACKButton.setFont(new Font("Callibri", Font.BOLD, 24));
        BACKButton.setBackground(new Color(210, 209, 209));
        BACKButton.setForeground(new Color(0, 0, 0));
        BACKButton.setFocusable(false);
        JButton start = new JButton("Start");
        start.setBounds(470, 350, 120, 50);
        start.setFont(new Font("Callibri", Font.BOLD, 24));
        start.setBackground(new Color(210, 209, 209));
        start.setForeground(new Color(0, 0, 0));
        start.setFocusable(false);
        label.add(start);
        label.add(BACKButton);
        frame.add(label);
        frame.setVisible(true);
//        start.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                String timer = Time.getText();
//
//                if(isNotNumeric(timer))         // check if timer is numbers only
//                {
//                    System.out.println("Input correct timer");
//                    JOptionPane.showMessageDialog(null, "input correct timer");
//
//                }
//                else {
//
//                    System.out.println("White player is: " + WhitePlayer.getText());
//                    System.out.println("Black player is: " + BlackPlayer.getText());
//                    System.out.println("Time allowed is: " + Time);
//                    dispose();
//                    try {
//                        game Game = new game(WhitePlayer.getText(), BlackPlayer.getText(),Time.getText());
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                }
//            }
//        });
//        BACKButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//
//                if(if_guest)        //GOOO back to login or guest page if its a guest
//                {
//                    System.out.println("this is a guest!!");
//                    firstPage guest_ = new firstPage();
//                    guest_.show();   //show the first page
//                    dispose();   //close new game page
//                }
//                else{        //this is a user
//                    System.out.println("this is a user !!!!!");
//
//                    Main_jr user = new Main_jr();
//                    user.show();   //show the first page
//                    dispose();   //close new game page
//
//                }
//            }
//        });
//    }
//
//
//    public static void main(String args[])
//    {
//        new new_game(true);
//    }
//}
//
//
//
//
//


//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;
//
//public class new_game extends JFrame {
//
//    //method to check password
//    public static boolean isNotNumeric(String strNum) {
//        if (strNum == null) {
//            return true;
//        }
//        try {
//            int d = Integer.parseInt(strNum);
//        } catch (NumberFormatException nfe) {
//            return true;
//        }
//        return false;
//    }
//    private JLabel white_lab = new JLabel();
//    public static String Winner;
//    public static String Time;
//    public static String status2;
//
//    public static String whitePlayer;
//    public static String blackPlayer;
//
//    private JTextField white_name = new JTextField();
//    private JLabel black_lab =new JLabel();
//    private JTextField black_name =new JTextField();
//    private JLabel timer_lab=new JLabel();
//    private JTextField timer_value=new JTextField();
//    private JButton start_btn=new JButton("Start");
//    private JButton back_btn=new JButton("Back");

//
//
//    public new_game(boolean if_guest)
//    {
//        // Set up the JFrame
//        setTitle("New Game");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(500, 400);
//
//        // Create a new JPanel with a GridLayout
//        // Create the main panel
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new GridBagLayout());
//
//        // Create the components
//        guest = if_guest;
//        white_lab = new JLabel("white");
//        white_lab.setFont(new Font("Algerian", Font.PLAIN, 20));
//        white_name = new JTextField(20);
//        black_lab = new JLabel("black");
//        black_lab.setFont(new Font("Algerian", Font.PLAIN, 20));
//        black_name = new JTextField(20);
//        timer_lab = new JLabel("time");
//        timer_lab.setFont(new Font("Algerian", Font.PLAIN, 20));
//        timer_value = new JTextField(20);
//        start_btn = new JButton("start");
//        back_btn = new JButton("back");
//
//        // Add the components to the main panel using GridBagLayout
//        GridBagConstraints constraints = new GridBagConstraints();
//
//        // Add white label and text field
//        constraints.gridx = 0;
//        constraints.gridy = 0;
//        constraints.insets = new Insets(10, 10, 10, 10);
//        constraints.anchor = GridBagConstraints.WEST;
//        mainPanel.add(white_lab, constraints);
//
//        constraints.gridx = 1;
//        mainPanel.add(white_name, constraints);
//
//        // Add black label and text field
//        constraints.gridx = 0;
//        constraints.gridy = 1;
//        mainPanel.add(black_lab, constraints);
//
//        constraints.gridx = 1;
//        mainPanel.add(black_name, constraints);
//
//        // Add timer label and text field
//        constraints.gridx = 0;
//        constraints.gridy = 2;
//        mainPanel.add(timer_lab, constraints);
//
//        constraints.gridx = 1;
//        mainPanel.add(timer_value, constraints);
//
//        // Add start and back buttons
//        constraints.gridx = 0;
//        constraints.gridy = 3;
//        constraints.gridwidth = 1;
//        constraints.anchor = GridBagConstraints.CENTER;
//        mainPanel.add(back_btn, constraints);
//
//        constraints.gridx = 1;
//        mainPanel.add(start_btn, constraints);
//
//        // Add the main panel to the content pane
//        getContentPane().add(mainPanel);
//        // Add the JPanel to the JFrame
//        add(mainPanel);
//
//        // Set the JFrame visible
//        setVisible(true);
//
//
      start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String timer =Time.getText();

                if(isNotNumeric(timer))         // check if timer is numbers only
                {
                    System.out.println("Input correct timer");
                    JOptionPane.showMessageDialog(null, "input correct timer");

                }
                else {

                    System.out.println("White player is: " + WhitePlayer.getText());
                    System.out.println("Black player is: " + BlackPlayer.getText());
                    System.out.println("Time allowed is: " +Time);
                    frame.dispose();
                    try {
                        game Game = new game(WhitePlayer.getText(), BlackPlayer.getText(), Time.getText());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                       whitePlayer = WhitePlayer.getText();
                         blackPlayer = BlackPlayer.getText();
//                       timer = Time.getText();
//
//                    gameData = White1+ "%" + Black1 + "%" + Winner +"%"+ Time;
//                    User.WriteToFile(gameData);// save data entered in the file of user
                }
            }
        });
        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(if_guest)        //GOOO back to login or guest page if its a guest
                {
                    System.out.println("this is a guest!!");
                    firstPage guest_ = new firstPage();
                    guest_.show();   //show the first page
                    frame.dispose();   //close new game page
                }
                else{        //this is a user
                    System.out.println("this is a user !!!!!");

                    Main_jr user = new Main_jr();
                    user.show();   //show the first page
                   frame. dispose();   //close new game page

                }
            }
        });

    }


    public static void endData(String winner, String time,String status) {
         Winner = winner;
         Time = time;
         status2=status;


    }



    public static void main(String args[])
    {
        new new_game(true);
    }
}



