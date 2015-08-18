import javax.swing.JApplet;
import java.awt.Graphics;

public class HelloWorld extends JApplet {

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
			g.drawString("Hello World", 50, 100);
	}
}