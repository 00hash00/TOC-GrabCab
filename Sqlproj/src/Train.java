import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Train extends JFrame {

    private JTextArea Chatarea = new JTextArea();
    private JTextArea Chatarea1 = new JTextArea();


    private JTextField name = new JTextField();
    private JTextField num = new JTextField();
    private JTextField add = new JTextField();
    private JTextField from = new JTextField();
    private JTextField to = new JTextField();
    private JTextField date = new JTextField();
    private JTextField time = new JTextField();
    private JTextField fare = new JTextField();
    /* private JTextField pass = new JTextField(); */
    private JTextField user_id = new JTextField();
    private JPasswordField pw = new JPasswordField();

    //creating a public constructor
    public Train() {
        /* Frames */
        JFrame frame = new JFrame();
        JFrame frame1 = new JFrame();
        JFrame frame2 = new JFrame();
        JFrame frame3 = new JFrame();
        JFrame frame4 = new JFrame();
        JFrame frame5 = new JFrame();
        /* Panels and Lables */
        JPanel panel0 = new JPanel();
        JLabel label0 = new JLabel();
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel();
        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel();
        JPanel panel3 = new JPanel();
        JLabel label3 = new JLabel();
        JPanel panel4 = new JPanel();
        JLabel label4 = new JLabel();
        JPanel panel5 = new JPanel();
        JLabel label5 = new JLabel();
        JPanel panel6 = new JPanel();
        JLabel label6 = new JLabel();
        JPanel panel7 = new JPanel();
        JLabel label7 = new JLabel();
        JPanel panel8 = new JPanel();
        JLabel label8 = new JLabel();
        JPanel panel9 = new JPanel();
        JLabel label9 = new JLabel();
        JPanel panel10 = new JPanel();
        JLabel label10 = new JLabel();
        JPanel panel11 = new JPanel();
        JLabel label11 = new JLabel();
        JPanel panel12 = new JPanel();
        JLabel label12 = new JLabel();
        JPanel panel13 = new JPanel();
        JLabel label13 = new JLabel();
        JPanel panel14 = new JPanel();
        JLabel label14 = new JLabel();
        JPanel panel15 = new JPanel();
        JLabel label15 = new JLabel();
        JPanel panel16 = new JPanel();
        JLabel label16 = new JLabel();
        JPanel panel17 = new JPanel();
        JLabel label17 = new JLabel();
        JPanel panel18 = new JPanel();
        JLabel label18 = new JLabel();
        JPanel panel19 = new JPanel();
        JLabel label19 = new JLabel();
        /* Buttons */
        JButton user = new JButton("USER");
        user.setFont(new Font("CASTELLAR", Font.BOLD, 25));
        JButton admin = new JButton("ADMIN");
        admin.setFont(new Font("CASTELLAR", Font.BOLD, 25));
        JButton register = new JButton("Register");
        register.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        JButton b4 = new JButton("LOG IN");
        b4.setFont(new Font("CASTELLAR", Font.BOLD, 25));
        JButton back = new JButton("Back");
        back.setFont(new Font("CASTELLAR", Font.BOLD, 25));
        JButton hmpg = new JButton("Homepage");
        hmpg.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        JButton logout = new JButton("LOG OUT");
        logout.setFont(new Font("CASTELLAR", Font.BOLD, 25));
        JButton edit = new JButton("EDIT");
        edit.setFont(new Font("CASTELLAR", Font.BOLD, 25));

        //Frame Work
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(680, 800);
        frame.setTitle("Train Ticket Management System");

        user.setBounds(150, 450, 150, 50);
        user.setBackground(Color.BLUE);
        user.setForeground(Color.CYAN);
        admin.setBounds(400,450,150,50);
        admin.setBackground(Color.blue);
        admin.setForeground(Color.CYAN);
        register.setBounds(450, 650, 150, 50);
        register.setBackground(Color.BLUE);
        register.setForeground(Color.CYAN);
        b4.setBounds(300, 550, 150, 30);
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.CYAN);
        hmpg.setBounds(100, 650, 200, 50);
        hmpg.setBackground(Color.BLUE);
        hmpg.setForeground(Color.CYAN);
        back.setBounds(500, 550, 150, 30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.CYAN);
        logout.setBounds(200, 700, 200, 30);
        logout.setBackground(Color.BLUE);
        logout.setForeground(Color.CYAN);
        edit.setBounds(450, 700, 150, 30);
        edit.setBackground(Color.BLUE);
        edit.setForeground(Color.CYAN);

        panel.setBounds(100, 2, 500, 50);
        panel.setBackground(Color.yellow);
        label.setText("Train Reservation System");
        label.setForeground(Color.BLUE);
        label.setBounds(100, 2, 500, 0);
        label.setFont(new Font("CASTELLAR", Font.BOLD, 25));
        frame.add(panel);
        panel.add(label);
        frame.add(user);
        frame.add(admin);
        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

frame.setVisible(false);

        frame1.getContentPane().setBackground(Color.DARK_GRAY);
        frame1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setResizable(false);
        frame1.setLayout(null);
        frame1.setSize(780, 1000);
        frame1.setTitle("Train Ticket Management System");

        frame1.add(name);
        frame1.add(num);
        frame1.add(add);
        frame1.add(from);
        frame1.add(to);
        frame1.add(date);
        frame1.add(time);
        frame1.add(fare);

        name.setBackground(Color.CYAN);
        num.setBackground(Color.CYAN);
        add.setBackground(Color.CYAN);
        from.setBackground(Color.CYAN);
        to.setBackground(Color.CYAN);
        date.setBackground(Color.CYAN);
        time.setBackground(Color.CYAN);
        fare.setBackground(Color.CYAN);

        //Panels and Labels
        panel0.setBounds(100, 2, 550, 50);
        panel0.setBackground(Color.YELLOW);
        label0.setText("Train Reservation System");
        label0.setBounds(100, 2, 550, 50);
        label0.setFont(new Font("CASTELLAR", Font.BOLD, 25));
        label0.setForeground(Color.BLUE);
        //Panel and Label 1
        panel1.setBounds(100, 100, 200, 30);
        label1.setBounds(100, 100, 200, 30);
        label1.setText(" name :");
        label1.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        label1.setForeground(Color.BLUE);
        //panel and lable 2
        panel2.setBounds(100, 150, 200, 30);
        label2.setText("Contact :");
        label2.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        label2.setBounds(100, 150, 200, 30);
        label2.setForeground(Color.BLUE);
        //panel and lable 3
        panel3.setBounds(100, 200, 200, 30);
        label3.setBounds(100, 200, 200, 30);
        label3.setText(" Address :");
        label3.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        label3.setForeground(Color.BLUE);
        //panel and lable 4
        panel4.setBounds(100, 300, 200, 30);
        label4.setBounds(100, 300, 200, 30);
        label4.setText(" From :");
        label4.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        label4.setForeground(Color.BLUE);
        //panel and lable 5
        panel5.setBounds(100, 350, 200, 30);
        label5.setBounds(100, 350, 200, 30);
        label5.setText(" To :");
        label5.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        label5.setForeground(Color.BLUE);
                //panel and lable 6
        panel6.setBounds(100, 450, 200, 30);
        label6.setBounds(100, 450, 200, 30);
        label6.setText(" Date :");
        label6.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        label6.setForeground(Color.BLUE);
                //panel and lable 7
        panel7.setBounds(100, 500, 200, 30);
        label7.setBounds(100, 500, 200, 30);
        label7.setText(" Time :");
        label7.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        label7.setForeground(Color.BLUE);
                //panel and lable 8
        panel8.setBounds(100, 58, 500, 30);
        label8.setBounds(100, 58, 500, 30);
        label8.setText(" User's Info ");
        panel8.setBackground(Color.LIGHT_GRAY);
        label8.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        label8.setForeground(Color.BLUE);
                //panel and lable 9
        panel9.setBounds(100, 250, 500, 30);
        label9.setBounds(100, 250, 500, 30);
        label9.setText(" Destination ");
        label9.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        panel9.setBackground(Color.LIGHT_GRAY);
        label9.setForeground(Color.BLUE);
        //panel and label 10
        panel10.setBounds(100, 400, 500, 30);
        label10.setBounds(100, 400, 500, 30);
        label10.setText(" Date / Time ");
        label10.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        panel10.setBackground(Color.LIGHT_GRAY);
        label10.setForeground(Color.BLUE);

        panel11.setBounds(100, 550, 500, 30);
        label11.setBounds(100, 550, 500, 30);
        label11.setText(" Amount ");
        label11.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        panel11.setBackground(Color.LIGHT_GRAY);
        label11.setForeground(Color.BLUE);

        panel12.setBounds(100, 600, 200, 30);
        label12.setBounds(100, 600, 200, 30);
        label12.setText(" Amount :");
        label12.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        panel12.setBackground(Color.LIGHT_GRAY);
        label12.setForeground(Color.BLUE);



        // Text Field
        name.setSize(250, 30);
        name.setLocation(350, 100);
        num.setSize(250, 30);
        num.setLocation(350, 150);
        add.setSize(250, 30);
        add.setLocation(350, 200);
        from.setSize(250, 30);
        from.setLocation(350, 300);
        to.setSize(250, 30);
        to.setLocation(350, 350);
        date.setSize(250, 30);
        date.setLocation(350, 450);
        time.setSize(250, 30);
        time.setLocation(350, 500);
        fare.setSize(250, 30);
        fare.setLocation(350, 600);

        frame1.add(panel0);
        panel0.add(label0);
        frame1.add(panel1);
        panel1.add(label1);
        frame1.add(panel2);
        panel2.add(label2);
        frame1.add(panel3);
        panel3.add(label3);
        frame1.add(panel4);
        panel4.add(label4);
        frame1.add(panel5);
        panel5.add(label5);
        frame1.add(panel6);
        panel6.add(label6);
        frame1.add(panel7);
        panel7.add(label7);
        frame1.add(panel8);
        panel8.add(label8);
        frame1.add(panel9);
        panel9.add(label9);
        frame1.add(panel10);
        panel10.add(label10);
        frame1.add(panel11);
        panel11.add(label11);
        frame1.add(panel12);
        panel12.add(label12);
        frame3.add(panel15);
        panel15.add(label15);
        frame1.add(register);
        frame1.add(hmpg);

                register.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        frame1.add(panel13);
                        panel13.add(label13);
                        panel13.setBounds(100, 730, 500, 30);
                        label13.setBounds(100, 730, 500, 30);
                        label13.setText(" Your reservation has been registered Thank You");
                        label13.setFont(new Font("CASTELLAR", Font.BOLD, 15));
                        panel13.setBackground(Color.LIGHT_GRAY);
                        label13.setForeground(Color.BLUE);

                        String gtext = name.getText();
                        Chatarea.append("\nName :" + gtext + "\n");
                        name.setText(" ");
                        String gnum = num.getText();
                        Chatarea.append("Contact :" + gnum + "\n");
                        num.setText(" ");
                        String gadd = add.getText();
                        Chatarea.append("Address :" + gadd + "\n");
                        add.setText(" ");
                         String gfrom = from.getText();
                        Chatarea.append("From :" + gfrom + "\n");
                        from.setText(" ");
                        String gto = to.getText();
                        Chatarea.append("To :" + gto + "\n");
                        to.setText(" ");
                        String gdate = date.getText();
                        Chatarea.append("Date :" + gdate + "\n");
                        date.setText(" ");
                        String gtime = time.getText();
                        Chatarea.append("Time :" + gtime + "\n");
                        time.setText(" ");
                        String gfare = fare.getText();
                        Chatarea.append("Fare :" + gfare + "\n");
                        fare.setText(" ");

                        /*
                            String gtext1 = name.getText();
                            Chatarea1.append("\nName :" + gtext1 + "\n");
                            name.setText(" ");
                            String gnum1 = num.getText();
                            Chatarea1.append("Contact :" + gnum1 + "\n");
                            num.setText(" ");
                            String gadd1 = add.getText();
                            Chatarea1.append("Address :" + gadd1 + "\n");
                            add.setText(" ");
                            String gfrom1 = from.getText();
                            Chatarea1.append("From :" + gfrom1 + "\n");
                            from.setText(" ");
                            String gto1 = to.getText();
                            Chatarea1.append("To :" + gto1 + "\n");
                            to.setText(" ");
                            String gdate1 = date.getText();
                            Chatarea1.append("Date :" + gdate1 + "\n");
                            date.setText(" ");
                            String gtime1 = time.getText();
                            Chatarea1.append("Time :" + gtime1 + "\n");
                            time.setText(" ");
                            String gfare1 = fare.getText();
                            Chatarea1.append("Fare :" + gfare1 + "\n");
                            fare.setText(" ");
                        }*/
                    }
                });

                hmpg.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame1.setVisible(false);

                        frame.setVisible(true);

                    }
                });



            }
        });
        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
        frame3.getContentPane().setBackground(Color.DARK_GRAY);
        frame3.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame3.setVisible(true);
        frame3.setResizable(false);
        frame3.setLayout(null);
        frame3.setSize(780, 1000);
        frame3.setTitle("Train Ticket Management System");
        panel19.setBounds(100, 2, 500, 50);
        panel19.setBackground(Color.YELLOW);
        label19.setText("Train Reservation System");
        label19.setBounds(100, 2, 500, 0);
        label19.setFont(new Font("CASTELLAR", Font.BOLD, 25));
        label9.setForeground(Color.BLUE);

        panel15.setBounds(100, 450, 200, 30);
        label15.setBounds(100, 450, 200, 30);
        label15.setText(" Password :");
        label15.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        label15.setForeground(Color.BLUE);

        panel18.setBounds(100, 350, 200, 30);
        label18.setBounds(100, 350, 200, 30);
        label18.setText(" User Id :");
        label18.setFont(new Font("CASTELLAR", Font.BOLD, 15));
        label18.setForeground(Color.BLUE);

        panel16.setBounds(50, 100, 650, 50);
        panel16.setBackground(Color.YELLOW);
        label16.setBounds(50, 100, 650, 50);
        label16.setText(" Please Enter Your Admin Password");
        label16.setFont(new Font("CASTELLAR", Font.BOLD, 25));
        label16.setForeground(Color.BLUE);

        pw.setSize(250, 30);
        pw.setLocation(350, 450);
        pw.setBackground(Color.CYAN);
        user_id.setSize(250, 30);
        user_id.setLocation(350, 350);
        user_id.setBackground(Color.CYAN);
        frame3.add(b4);
        frame3.add(panel19);
        panel19.add(label19);
        frame3.add(panel15);
        panel15.add(label15);
        frame3.add(panel16);
        panel16.add(label16);
        frame3.add(panel18);
        panel18.add(label18);
        frame3.add(pw);
        frame3.add(user_id);
        frame3.add(b4);
        frame3.add(back);

                back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame3.setVisible(false);

                        frame.setVisible(true);

                    }
                });


                    b4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            String gpass = pw.getText();
                            String g_user_id = user_id.getText();

                            if (gpass.contains("54321") && g_user_id.contains("12345") ) {
                                user_id.setText(" ");
                                pw.setText(" ");
                                frame3.setVisible(false);
                                frame2.getContentPane().setBackground(Color.DARK_GRAY);
                                frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
                                frame2.setVisible(true);
                                frame2.setResizable(false);
                                frame2.setLayout(null);
                                frame2.setSize(800, 800);
                                frame2.setTitle("Train Reservations");

                                JScrollBar s=new JScrollBar();
                                s.setBounds(630,0, 20,600);
                                s.setVisible(true);

                                /*JPanel scroll = new JPanel();
                                JScrollPane jScrollPane = new JScrollPane(scroll);
                                jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                                jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                                frame2.getContentPane().add(jScrollPane);*/

                                panel14.setBounds(0, 0, 680, 50);
                                label14.setBounds(0, 0, 680, 50);
                                label14.setText(" Reservations");
                                label14.setFont(new Font("CASTELLAR", Font.BOLD, 25));
                                panel14.setBackground(Color.YELLOW);
                                label14.setForeground(Color.BLUE);
                                Chatarea.setSize(650, 600);
                                Chatarea.setLocation(2, 60);
                                Chatarea.setBackground(Color.cyan);
                                Chatarea.setEditable(false);
                                Chatarea.setRows(5);
                                frame2.add(Chatarea);
                              Chatarea.add(s);
                                frame2.add(Chatarea1);
                                frame2.add(panel14);
                                panel14.add(label14);
                                frame2.add(logout);
                                frame2.add(edit);

                                logout.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        frame2.setVisible(false);

                                        frame3.setVisible(true);

                                    }
                                });

                                edit.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                       Chatarea.setEditable(true);

                                    }
                                });


                            }else {
                                user_id.setText(" ");
                                pw.setText(" ");
                                frame3.add(panel17);
                                panel17.add(label17);
                                panel17.setBounds(150, 500, 300, 30);
                                panel17.setBackground(Color.YELLOW);
                                label17.setBounds(150, 500, 300, 30);
                                label17.setText(" Incorrect Password! ");
                                label17.setFont(new Font("CASTELLAR", Font.BOLD, 15));
                                label17.setForeground(Color.BLUE);


                            }

                        }
                    });
            }
        });
    }
}