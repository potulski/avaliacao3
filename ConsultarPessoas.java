import java.awt.*;
import javax.swing.*;

public class ConsultarPessoas extends JFrame {

    JTextArea pessoas = new JTextArea(10,30);

    public ConsultarPessoas() {

        super("Consultar Pessoa ");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(pessoas);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(360,250);
        this.setVisible(true);
    }

    public static void main(String[] args){
        ConsultarPessoas janela = new ConsultarPessoas();
    }
}