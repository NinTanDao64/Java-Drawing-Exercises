import java.awt.*;

public class ShowDesign {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(200, 200);
      Graphics g = panel.getGraphics();
      drawFigure(g, 200, 200);      
   }
   
   public static void drawFigure(Graphics g, int w, int h) {
      for(int i=1; i<=4; i++) {
         g.drawRect(i*(w/10), i*(h/10), -20*i+(200-20*i), -20*i+(200-20*i));
      }
   }
}