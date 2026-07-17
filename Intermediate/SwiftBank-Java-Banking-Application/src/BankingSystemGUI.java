import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

public class BankingSystemGUI extends JFrame implements ActionListener {

    CardLayout cardLayout;
    JPanel mainPanel, loginPanel, menuPanel;

    JTextField accField;
    JPasswordField pinField;

    JButton loginBtn;
JButton createAccountBtn;
JButton checkBalanceBtn;
JButton depositBtn;
JButton withdrawBtn;
JButton transferBtn;
JButton historyBtn;
JButton logoutBtn;

    private BankService bankService;
    private BankAccount currentAccount;


    public BankingSystemGUI() {

        bankService = new BankService();


        UIManager.put("Label.font",
                new Font("SansSerif", Font.PLAIN, 14));

        UIManager.put("Button.font",
                new Font("SansSerif", Font.BOLD, 14));


        cardLayout = new CardLayout();

        mainPanel = new JPanel(cardLayout);


        createLoginPanel();

        createMenuPanel();


        add(mainPanel);


        setTitle("ATM Banking System");

        setSize(450,450);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);


        cardLayout.show(mainPanel,"Login");
    }



    private void createLoginPanel(){


        loginPanel = new JPanel(new GridBagLayout());


        loginPanel.setBackground(
                new Color(58,123,213)
        );


        GridBagConstraints gbc =
                new GridBagConstraints();


        gbc.insets =
                new Insets(10,10,10,10);



        JLabel title =
                new JLabel("ATM Login");


        title.setFont(
                new Font("SansSerif",
                        Font.BOLD,
                        24)
        );


        title.setForeground(Color.WHITE);



        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=2;


        loginPanel.add(title,gbc);



        gbc.gridwidth=1;


        gbc.gridy++;


        JLabel accLabel =
                new JLabel("Account Number");


        accLabel.setForeground(Color.WHITE);


        gbc.gridx=0;

        loginPanel.add(accLabel,gbc);



        accField =
                new JTextField(15);


        gbc.gridx=1;


        loginPanel.add(accField,gbc);




        gbc.gridx=0;

        gbc.gridy++;


        JLabel pinLabel =
                new JLabel("PIN");


        pinLabel.setForeground(Color.WHITE);


        loginPanel.add(pinLabel,gbc);




        pinField =
                new JPasswordField(15);


        gbc.gridx=1;


        loginPanel.add(pinField,gbc);



        loginBtn =
                new JButton("Login");


        loginBtn = new JButton("Login");
loginBtn.addActionListener(this);

createAccountBtn = new JButton("Create Account");
createAccountBtn.addActionListener(this);

gbc.gridx = 0;
gbc.gridy++;
gbc.gridwidth = 1;
loginPanel.add(loginBtn, gbc);

gbc.gridx = 1;
loginPanel.add(createAccountBtn, gbc);



        mainPanel.add(loginPanel,"Login");

    }
        private void createMenuPanel(){

    menuPanel = new JPanel(new GridBagLayout());

    menuPanel.setBackground(
            new Color(220,235,255)
    );

    GridBagConstraints gbc =
            new GridBagConstraints();

    gbc.insets =
            new Insets(10,10,10,10);

    checkBalanceBtn = createButton("Check Balance");

    depositBtn = createButton("Deposit");

    withdrawBtn = createButton("Withdraw");

    transferBtn = createButton("Transfer");

    historyBtn = createButton("Transaction History");

    logoutBtn = createButton("Logout");

    JButton buttons[] =
    {
        checkBalanceBtn,
        depositBtn,
        withdrawBtn,
        transferBtn,
        historyBtn,
        logoutBtn
    };

    for(int i=0;i<buttons.length;i++){

        gbc.gridx = 0;
        gbc.gridy = i;

        menuPanel.add(buttons[i], gbc);
    }

    mainPanel.add(menuPanel, "Menu");
}



    private JButton createButton(String text){


        JButton button =
                new JButton(text);


        button.setPreferredSize(
                new Dimension(220,40)
        );


        button.addActionListener(this);


        button.setBackground(
                new Color(0,150,136)
        );


        button.setForeground(Color.WHITE);


        return button;

    }





    @Override
    public void actionPerformed(ActionEvent e){



        // LOGIN

        if(e.getSource()==loginBtn){


            try{


                int accountNumber =
                        Integer.parseInt(
                                accField.getText()
                        );


                int pin =
                        Integer.parseInt(
                                new String(
                                        pinField.getPassword()
                                )
                        );



                currentAccount =
                        bankService.login(
                                accountNumber,
                                pin
                        );



                if(currentAccount!=null){


                    JOptionPane.showMessageDialog(
                            this,
                            "Login Successful"
                    );


                    cardLayout.show(
                            mainPanel,
                            "Menu"
                    );


                }
                else{


                    JOptionPane.showMessageDialog(
                            this,
                            "Invalid Login"
                    );

                }



            }
            catch(Exception ex){


                JOptionPane.showMessageDialog(
                        this,
                        "Enter valid details"
                );

            }


        }


        else if(e.getSource() == createAccountBtn){

    try{

        String name = JOptionPane.showInputDialog(
                this,
                "Enter Account Holder Name:"
        );

        if(name == null || name.trim().isEmpty()){
            JOptionPane.showMessageDialog(
                    this,
                    "Name cannot be empty."
            );
            return;
        }

        String pinStr = JOptionPane.showInputDialog(
                this,
                "Enter 4-digit PIN:"
        );

        int pin = Integer.parseInt(pinStr);

        if(String.valueOf(pin).length() != 4){
            JOptionPane.showMessageDialog(
                    this,
                    "PIN must be exactly 4 digits."
            );
            return;
        }

        String balanceStr = JOptionPane.showInputDialog(
                this,
                "Enter Opening Balance:"
        );

        double openingBalance = Double.parseDouble(balanceStr);

        if(openingBalance < 0){
            JOptionPane.showMessageDialog(
                    this,
                    "Opening balance cannot be negative."
            );
            return;
        }

        BankAccount account =
                bankService.createAccount(
                        name,
                        pin,
                        openingBalance
                );

        JOptionPane.showMessageDialog(
                this,
                "Account Created Successfully!\n\n"
                + "Account Number : "
                + account.getAccountNumber()
                + "\nName : "
                + account.getAccountHolderName()
                + "\nOpening Balance : ₹"
                + account.getBalance()
        );

    }
    catch(NumberFormatException ex){

        JOptionPane.showMessageDialog(
                this,
                "Please enter valid numeric values."
        );

    }
}
        // BALANCE

        else if(e.getSource()==checkBalanceBtn){


            JOptionPane.showMessageDialog(
                    this,
                    "Balance : ₹"
                    + currentAccount.getBalance()
            );


        }



        // DEPOSIT

        else if(e.getSource()==depositBtn){


            String value =
                    JOptionPane.showInputDialog(
                            "Enter deposit amount"
                    );


            try{


                double amount =
                        Double.parseDouble(value);



                if(amount<=0){

                    throw new InvalidAmountException();

                }


                bankService.deposit(
                        currentAccount,
                        amount
                );


                JOptionPane.showMessageDialog(
                        this,
                        "Deposit Successful"
                );



            }
            catch(Exception ex){


                JOptionPane.showMessageDialog(
                        this,
                        ex.getMessage()
                );

            }


        }



        // WITHDRAW

        else if(e.getSource()==withdrawBtn){


            String value =
                    JOptionPane.showInputDialog(
                            "Enter withdrawal amount"
                    );



            try{


                double amount =
                        Double.parseDouble(value);



                if(amount<=0){

                    throw new InvalidAmountException();

                }


                if(amount >
                        currentAccount.getBalance()){


                    throw new InsufficientBalanceException();

                }



                bankService.withdraw(
                        currentAccount,
                        amount
                );



                JOptionPane.showMessageDialog(
                        this,
                        "Withdrawal Successful"
                );



            }
            catch(Exception ex){


                JOptionPane.showMessageDialog(
                        this,
                        ex.getMessage()
                );

            }


        }
                // TRANSFER

        else if(e.getSource()==transferBtn){


            try{


                String receiver =
                        JOptionPane.showInputDialog(
                                "Enter receiver account number"
                        );


                String value =
                        JOptionPane.showInputDialog(
                                "Enter transfer amount"
                        );


                int receiverAccount =
                        Integer.parseInt(receiver);



                double amount =
                        Double.parseDouble(value);



                if(amount<=0){

                    throw new InvalidAmountException();

                }



                if(amount >
                        currentAccount.getBalance()){


                    throw new InsufficientBalanceException();

                }



                boolean result =
                        bankService.transfer(
                                currentAccount,
                                receiverAccount,
                                amount
                        );



                if(result){


                    JOptionPane.showMessageDialog(
                            this,
                            "Transfer Successful"
                    );


                }
                else{


                    JOptionPane.showMessageDialog(
                            this,
                            "Receiver account not found"
                    );


                }



            }
            catch(Exception ex){


                JOptionPane.showMessageDialog(
                        this,
                        ex.getMessage()
                );

            }


        }





        // TRANSACTION HISTORY

        else if(e.getSource()==historyBtn){


            List<Transaction> history =
                    currentAccount.getTransactionHistory();



            if(history.isEmpty()){


                JOptionPane.showMessageDialog(
                        this,
                        "No transactions available"
                );


            }
            else{


                StringBuilder sb =
                        new StringBuilder();


                sb.append(
                        "Transaction History\n\n"
                );



                for(Transaction transaction : history){


                    sb.append(
                            transaction.toString()
                    );


                    sb.append("\n");

                }



                JTextArea area =
                        new JTextArea(
                                sb.toString()
                        );


                area.setEditable(false);



                JScrollPane scroll =
                        new JScrollPane(area);



                scroll.setPreferredSize(
                        new Dimension(350,300)
                );



                JOptionPane.showMessageDialog(
                        this,
                        scroll,
                        "History",
                        JOptionPane.INFORMATION_MESSAGE
                );


            }


        }





        // LOGOUT

        else if(e.getSource()==logoutBtn){


            currentAccount = null;


            accField.setText("");

            pinField.setText("");



            cardLayout.show(
                    mainPanel,
                    "Login"
            );


        }

    }


}