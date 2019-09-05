package Graphics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BarGraph extends JPanel {

    private List<Integer> bars = new ArrayList<>();
    private JFrame frame;
    private BarGraph graph;

    @Override
    protected void paintComponent(Graphics g) {
        int width = (getWidth() / bars.size()) - 2;
        int x = 1;
        for (Integer bar : bars){
            int height = getHeight() / bars.size() * bar;
            g.setColor(Color.GREEN);
            g.fillRect(x, getHeight() - height, width, height);
            x += width + 2;
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(bars.size() * 10 + 2, 50);
    }

    public void getBarGraph(String sortName, List<Integer> numbers) {
        frame = new JFrame(sortName);
        bars = numbers;

        frame.getContentPane().add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void updateBars(List<Integer> numbers) {
        bars = numbers;
        frame.repaint();
    }
}
