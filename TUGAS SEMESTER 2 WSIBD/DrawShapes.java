package drawshapes;
import java.awt.*;
import java.applet.*;
public class DrawShapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
public void init() {
        font = new Font("Arial", Font.ITALIC, 18);
        redColor = Color.red;
        backgroundColor = Color.orange;
        blueColor = new Color(0, 0, 122);
        setBackground(backgroundColor);
    }
public void stop() {}
public void paint(Graphics graph) {
        graph.setFont(font);
        graph.drawString("Draw Shapes", 90, 20);
        graph.setColor(blueColor);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);
        graph.setColor(redColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);
        graph.setColor(Color.CYAN);
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 60, 60);
    }

public static void main(String[] args) {
        Frame frame = new Frame("Draw Shapes");
        DrawShapes applet = new DrawShapes();
        frame.add(applet);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
