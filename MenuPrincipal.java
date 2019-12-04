
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

    //Botões para cadastrar
    JButton cadastrarPessoa = new JButton("Cadastrar Pessoa");
    JButton cadastrarDivida = new JButton("Cadastrar Divida");
    JButton cadastrarProvento = new JButton("Cadastrar Provento");
    
    //Botões para consultar
    JButton consultarPessoa = new JButton("Consultar Pessoa");
    JButton consultarDivida = new JButton("Consultar Divida");
    JButton consultarProvento = new JButton("Consultar Provento");

    public MenuPrincipal() {
        super("Controle Financeiro");

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        
        pane.add(cadastrarPessoa);
        pane.add(cadastrarDivida);
        pane.add(cadastrarProvento);

        pane.add(consultarPessoa);
        pane.add(consultarDivida);
        pane.add(consultarProvento);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250,300);
        this.setVisible(true);

        ActionListener handlerAction = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == cadastrarPessoa){
                    new CadastrarPessoa();
                } else if(e.getSource() == cadastrarDivida){
                    new CadastrarDivida();
                } else if(e.getSource() == cadastrarProvento){
                    new CadastrarProventos();
                } else if(e.getSource() == consultarPessoa){
                    new ConsultarPessoas();
                } else if(e.getSource() == consultarDivida){
                    new ConsultarDividas();
                } else if(e.getSource() == consultarProvento){
                    new ConsultarProventos();
                }
            }
        };
        //Botões cadastrar
        cadastrarPessoa.addActionListener(handlerAction);
        cadastrarDivida.addActionListener(handlerAction);
        cadastrarProvento.addActionListener(handlerAction);
        
        //Botões consultar
        consultarPessoa.addActionListener(handlerAction);
        consultarDivida.addActionListener(handlerAction);
        consultarProvento.addActionListener(handlerAction);


    }
    public static void main(String[] args) {
        MenuPrincipal consulta = new MenuPrincipal();
    }
}