import java.awt.*;

public class ShowDesign2 {
	public static void main(String[] args) {
	DrawingPanel panel = new DrawingPanel(300, 100);
        Graphics g = panel.getGraphics();
		  drawFigure(g, 300, 100);
	}
	public static void drawFigure(Graphics g, int w, int h) {
		  for(int i=1; i<=4; i++) {
		  		g.drawRect(i*(w/10), i*(h/10), ((-w/10)*2)*i+w, ((-h/10)*2)*i+h);
		  }
}
}
