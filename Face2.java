import java.awt.*;

public class Face2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(520, 180);
        Graphics g = panel.getGraphics();
		  drawFigure(g, 10, 30);
		  drawFigure(g, 110, 30);
		  drawFigure(g, 210, 30);
		  drawFigure(g, 310, 30);
		  drawFigure(g, 410, 30);
		  
		  
		  

		  
    }
	 public static void drawFigure(Graphics g, int x, int y) {
	 g.setColor(Color.BLACK);
    g.drawOval(x, y, 100, 100);
	 
	 g.setColor(Color.BLUE);
        g.fillOval(x + 20, y + 30, 20, 20);     
        g.fillOval(x + 60, y + 30, 20, 20);


	  g.setColor(Color.RED);          
     g.drawLine(x + 30, y + 70, x + 70, y + 70);
	  
	  }
}
		  