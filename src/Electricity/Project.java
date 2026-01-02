
package Electricity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Project extends JFrame implements ActionListener {
    String meter;// Armazena o número do medidor do usuário logado
    Project(String meter, String person){
        super("Electricity Billing System");
        this.meter = meter;// Guarda o meter recebido do login

        setSize(1920,1030);

        //adcionando imagem de fundo

        ImageIcon ic = new ImageIcon(ClassLoader.
                getSystemResource("icon/elect1.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel label1 = new JLabel(icc3);
        add(label1);

        // ================= FIRST COLUMN - MASTER =================
        JMenuBar jMenuBar = new JMenuBar();
        JMenu master = new JMenu("Master");
        JMenuItem mi1 = new JMenuItem("New Customer");
        JMenuItem mi2= new JMenuItem("Customer Details");
        JMenuItem mi3 = new JMenuItem("Deposit Details");
        JMenuItem mi4 = new JMenuItem("Calculate Bill");
        master.setForeground(Color.BLUE);


        //============customer details================
        mi1.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        mi1.setIcon(new ImageIcon(image1));
        mi1.setMnemonic('D');// tecla Alt + D
        mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        mi1.setBackground(Color.WHITE);


        /*======= meter details ========*/
        mi2.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        mi2.setIcon(new ImageIcon(image2));
        mi2.setMnemonic('M');// tecla Alt + M
        mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        mi2.setBackground(Color.WHITE);


        /*============== deposit details =============*/
        mi3.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("Icon/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        mi3.setIcon(new ImageIcon(image3));
        mi3.setMnemonic('N');// tecla Alt + N
        mi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        mi3.setBackground(Color.WHITE);

        mi4.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("Icon/icon5.png"));
        Image image5 = icon5.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        mi4.setIcon(new ImageIcon(image5));
        mi4.setMnemonic('B');// tecla Alt + B
        mi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        mi4.setBackground(Color.WHITE);

        // Registra os eventos
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);

        //================================

        // ================= SECOND COLUMN - INFORMATION =================
        JMenu info =new JMenu("Information");
        JMenuItem info1 = new JMenuItem("Update Information");
        JMenuItem info2 = new JMenuItem("View Information");

        info.setForeground(Color.RED);

        /*======= pay bill==========*/
        info1.setFont(new Font("menospaced", Font.PLAIN,12));
        ImageIcon icon41 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image41 = icon41.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        info1.setIcon(new ImageIcon(image41));
        info1.setMnemonic('P');
        info1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        info1.setBackground(Color.WHITE);


        /*==========last bill===============*/
        info2.setFont(new Font("menospaced", Font.PLAIN,12));
        ImageIcon icon42 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image42 = icon42.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        info2.setIcon(new ImageIcon(image42));
        info2.setMnemonic('L');
        info2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        info2.setBackground(Color.WHITE);

        info1.addActionListener(this);
        info2.addActionListener(this);

        //--------------------------------------------------------------------------------------------

        // ================= USER MENU =================
        JMenu user = new JMenu("User");
        JMenuItem u1 = new JMenuItem("Pay Bill");

        JMenuItem u3 = new JMenuItem("Bill Details");
        user.setForeground(Color.RED);

        /*=========Pay Bill==============*/
        u1.setFont(new Font("menospaced", Font.PLAIN,12));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image4 = icon4.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);


        /*============Last Bill=============*/
        u3.setFont(new Font("menospaced", Font.PLAIN,12));
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        u3.setIcon(new ImageIcon(image6));
        u3.setMnemonic('L');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        u3.setBackground(Color.WHITE);

        u1.addActionListener(this);
        u3.addActionListener(this);

        // ================= REPORT MENU =================
        JMenu report = new JMenu("Report");
        JMenuItem r1 = new JMenuItem("Generate Bill");

        report.setForeground(Color.BLUE);

        /*Report*/
        r1.setFont(new Font("menospaced", Font.PLAIN,12));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image7 = icon7.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image7));
        u1.setMnemonic('R');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);

        r1.addActionListener(this);

        //=======================================================================================================


        // ================= UTILITY MENU =================
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("NotePad");
        JMenuItem ut2= new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.RED);

        /*========Calender===========*/
        ut1.setFont(new Font("menospaced", Font.PLAIN,12));
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image8 = icon8.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image8));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);

        /*========Calculator=============*/
        ut2.setFont(new Font("menospaced", Font.PLAIN,12));
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image9 = icon9.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image9));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);

        /*========Web Browser=============*/
        ut3.setFont(new Font("menospaced", Font.PLAIN,12));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon10.png"));
        Image image10 = icon10.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);

        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);

        //==============================================================================

        // ================= LOGOUT MENU =================

        JMenu exit = new JMenu("Logout");
        JMenuItem ex = new JMenuItem("logout");
        exit.setForeground(Color.BLUE);

        /*===== exit ======*/
        ex.setFont(new Font("menospaced", Font.PLAIN,12));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image11 = icon11.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('E');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);

        //===================================================================================

        // ================= ADICIONANDO ITENS AOS MENUS =================
        master.add(mi1);
        master.add(mi2);
        master.add(mi3);
        master.add(mi4);

        info.add(info1);
        info.add(info2);

        user.add(u1);
        user.add(u3);

        report.add(r1);

        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);

        exit.add(ex);
        // ================= CONTROLE DE ACESSO =================

        if (person.equals("Admin")){
            jMenuBar.add(master);
        }else {
            jMenuBar.add(info);
            jMenuBar.add(user);
            jMenuBar.add(report);
        }
        jMenuBar.add(utility);
        jMenuBar.add(exit);

        setJMenuBar(jMenuBar);

        // Configurações finais da janela

        setFont(new Font("Senserif", Font.BOLD, 16));
        setLayout(new FlowLayout());
        setVisible(true);

    }
    // ================= EVENTOS DOS MENUS =================
    public void actionPerformed(ActionEvent ae){
        /*
         * getActionCommand():
         * Retorna o TEXTO do JMenuItem que foi clicado.
         */
        String msg = ae.getActionCommand();
        // ================= MASTER MENU =================

        if(msg.equals("Customer Details")){// Abre a tela de detalhes dos clientes
            new CustomerDetails().setVisible(true);

        }else if(msg.equals("New Customer")){// Abre o formulário para cadastrar um novo cliente
            new NewCustomer().setVisible(true);

        }else if(msg.equals("Calculate Bill")){// Abre a tela para calcular a conta de energia
            new CalculateBill().setVisible(true);


            // ================= USER MENU =================

            /*
             * Abre a tela de pagamento da conta.
             * O número do medidor (meter) é enviado
             * para saber QUAL cliente está pagando.
             */

        }else if(msg.equals("Pay Bill")){
            new PayBill(meter).setVisible(true);

            // ================= UTILITY MENU =================

            /*
             * Abre o Bloco de Notas do Windows.
             * Runtime.getRuntime().exec()
             * executa programas do sistema operacional.
             */

        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                // Evita que o programa quebre caso o app não seja encontrado
            }
            /*
             * Abre a Calculadora do Windows
             */
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){

            }
            /*
             * Abre o navegador Microsoft Edge
             * Caminho absoluto do executável
             */

        }else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)" +
                        "\\Microsoft\\Edge\\Application\\msedge.exe");
            }catch(Exception e){

            }

            // ================= LOGOUT =================
            /*
             * Fecha a janela atual (Project)
             * e retorna para a tela de Login
             */
        }else if(msg.equals("Logout")){
            this.setVisible(false);
            new Login().setVisible(true);

            // ================= REPORT MENU =================

            /*
             * Gera a conta de energia do cliente logado
             * usando o número do medidor
             */
        }else if(msg.equals("Generate Bill")){
            new GenerateBill(meter).setVisible(true);

            // ================= MASTER MENU (ADMIN) =================

            /*
             * Abre os detalhes de depósito/pagamentos
             */

        }else if(msg.equals("Deposit Details")){
            new DepositDetails().setVisible(true);

            // ================= INFORMATION MENU =================

            /*
             * Exibe as informações do cliente logado
             */
        }else if(msg.equals("View Information")){
            new ViewInformation(meter).setVisible(true);

            /*
             * Permite atualizar os dados do cliente
             */
        }else if(msg.equals("Update Information")){
            new UpdateInformation(meter).setVisible(true);

            // ================= BILL DETAILS =================

            /*
             * Mostra o histórico de contas do cliente
             */
        }else if(msg.equals("Bill Details")){
            new BillDetails(meter).setVisible(true);
        }

    }
    public static void main(String[] args){
        new Project("", "").setVisible(true);
    }

}