//import java.awt.Color;
import java.awt.Graphics;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;

//import javax.swing.JLabel;
import javax.swing.JPanel;
import reta.FiguraRetas;

public class CriaFundo extends JPanel {

    int espaco = 2;

    // Desenho inicial
    public void inicio(int larg, int alt) {

        Graphics g = getGraphics();
        FiguraRetas.desenharReta(g, 0, 0, larg, alt, 4);
        FiguraRetas.desenharReta(g, larg, 0, 0, alt, 4);
    }

    // Muda para os proximos
    public void mudaDesenhoRetas(int vzs, int larg, int alt) {
        Graphics g = getGraphics();
        // numRetas =
        for (int i = 0; i < vzs; i++) {
            FiguraRetas.desenharReta(g, 0, 0, larg / espaco, alt / espaco, 4);
            FiguraRetas.desenharReta(g, larg / espaco, 0, 0, alt / espaco, 4);
            // espaco
        }
    }
}
