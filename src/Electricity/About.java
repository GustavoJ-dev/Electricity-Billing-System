package Electricity;

import javax.swing.*;          // Importar JFrame, JButton, JLabel
import java.awt.*;             // Importar TextArea, Font, Color
import java.awt.event.*;       // Importar ActionEvent e ActionListener

// A classe About é uma janela (JFrame) e escuta eventos de ação (botões)
public class About extends JFrame implements ActionListener {

    // Variáveis de instância (para poder acessar em tod o objeto)
    private JButton b1;
    private JLabel l1;
    private TextArea t1;
    private String s;
    private Font fTitle, fText, fLabel;

    // Construtor da janela
    public About() {

        // Layout manual: vamos definir posição e tamanho de cada componente
        setLayout(null);

        // ===================== Botão "Exit" =====================
        b1 = new JButton("Exit");          // Cria botão
        b1.setBounds(180, 430, 120, 30);   // Define posição e tamanho (x, y, width, height)
        b1.addActionListener(this);        // Registra o clique do botão
        add(b1);                           // Adiciona o botão à janela

        // ===================== Fonte do título =====================
        fTitle = new Font("RALEWAY", Font.BOLD, 20); // Fonte do título
        fText = new Font("RALEWAY", Font.PLAIN, 14); // Fonte do texto

        // ===================== Texto da descrição =====================
        s = "About Projects\n\n"
                + "Electricity Billing System is a software-based application "
                + "developed in Java programming language. The project aims at serving "
                + "the department of electricity by computerizing the billing system. "
                + "It mainly focuses on the calculation of units consumed during the "
                + "specified time and the money to be paid to electricity offices. "
                + "This computerized system will make the overall billing system easy, "
                + "accessible, comfortable and effective for consumers.";

        t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL); // Cria a TextArea com scroll vertical
        t1.setEditable(false);     // Não permite que o usuário edite o texto
        t1.setBounds(20, 100, 450, 300); // Posição e tamanho
        t1.setFont(fText);         // Aplica fonte ao texto
        add(t1);                    // Adiciona à janela

        // ===================== Título =====================
        l1 = new JLabel("About Project"); // Cria JLabel
        l1.setBounds(150, 20, 200, 50);  // Posição e tamanho
        l1.setForeground(Color.RED);     // Cor do texto
        l1.setFont(fTitle);              // Aplica fonte
        add(l1);                         // Adiciona à janela

        // ===================== Configurações da janela =====================
        setTitle("About Project");        // Título da janela
        setBounds(700, 220, 500, 550);   // Posição e tamanho da janela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha a janela sem encerrar o programa
        setVisible(true);                 // Torna a janela visível
    }

    // Método chamado quando o botão é clicado
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) { // Verifica se o botão Exit foi clicado
            dispose();             // Fecha a janela
        }
    }

    // Método principal para executar a aplicação
    public static void main(String[] args) {
        new About(); // Cria a janela About
    }
}