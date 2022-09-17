import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JSlider;
import javax.swing.JToolBar;

public class Gui extends JFrame {

    CriaFundo cf = new CriaFundo();
    int n = 1;
    // barra de menu (inserir componente)
    private JToolBar barraComandos = new JToolBar();
    private JButton jbMudaDesenho = new JButton("Mudar");
    private JLabel divs = new JLabel("Divisões: %d", n);
    //private JLabel desenho = cf.inicio();
   

    public Gui(int larg, int alt) {
        super("Desenho com retas");

        setSize(larg, alt);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        barraComandos.add(jbMudaDesenho); // Adiciona na barra de comandos o botao de mudar desenho
        barraComandos.add(divs); // Adiciona na barra de comandos a label
        add(barraComandos, BorderLayout.NORTH);

        jbMudaDesenho.addActionListener(e -> {
            
        });

    }
}
