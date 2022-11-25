package amd.caveofprogramming.section33.l413.gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JPanel;

import amd.caveofprogramming.section33.l413.controller.Rule;

public class ArtPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private static final int ON_COLOR = 0x00FF00;
    private static final int OFF_COLOR = 0x006400;
    private BufferedImage image;
    private Rule rule;
    private Random random = new Random();

    public ArtPanel(Rule rule) {
        this.rule = rule;
    }

    @Override
    protected void paintComponent(Graphics g) {

        int width = getWidth();
        int height = getHeight();

        if (image == null || image.getWidth() != width || image.getHeight() != height) {
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        }

        boolean on = true;
        for (int x = 0; x < width; x++) {
            image.setRGB(x, 0, on ? ON_COLOR : OFF_COLOR);
            if (random.nextInt(20) == 0) {
                on = !on;
            }
        }

        for (int y = 1; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int xLeft = x == 0 ? width - 1 : x - 1;
                int xRight = x == width - 1 ? 0 : x + 1;

                int leftColor = image.getRGB(xLeft, y - 1) & 0xFFFFFF;
                int aboveColor = image.getRGB(x, y - 1) & 0xFFFFFF;
                int rightColor = image.getRGB(xRight, y - 1) & 0xFFFFFF;

                int left = leftColor == ON_COLOR ? 1 : 0;
                int center = aboveColor == ON_COLOR ? 1 : 0;
                int right = rightColor == ON_COLOR ? 1 : 0;

                int pixelOn = (left << 2) | (center << 1) | right;

                int value = rule.get(pixelOn);
                image.setRGB(x, y, value == 1 ? ON_COLOR : OFF_COLOR);
            }
        }

        g.drawImage(image, 0, 0, null);

    }

}
