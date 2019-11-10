package com.isofh.bvp.dashboard.web;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestImage extends JPanel {

        private BufferedImage image;
        private BufferedImage image1;

        public TestImage() {
            try {
                image = ImageIO.read(new URL(
                        "https://api.release.isofh.com/images/a9_99a0a61a_8055_49fc_8cb8_dd40448a2cc9.png"));
                image1 = ImageIO.read(new URL(
                        "https://isofh.com/images/logo.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            image = process(image);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(image.getWidth(), image.getHeight());
        }

        private BufferedImage process(BufferedImage old) {

            int w = old.getWidth() / 1;
            int h = old.getHeight() / 1;
            BufferedImage img = new BufferedImage(
                    w, h, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = img.createGraphics();
            g2d.drawImage(old, 0, 0, w, h, this);
            g2d.setPaint(Color.red);
            g2d.setFont(new Font("Serif", Font.BOLD, 20));
            String s = "Hello, Manh!";
            FontMetrics fm = g2d.getFontMetrics();
            int x = img.getWidth()/2;
//            int x = img.getWidth() - fm.stringWidth(s) - 5;
//            int y = fm.getHeight();
            int y =img.getHeight()/2;
            System.out.println("gia tri w-h: "+w+"--"+h );
            System.out.println("gia tri x-y: "+x+"--"+y );

            g2d.drawImage(image1,x,y,null);
            g2d.drawImage(image1,x/2,y/2,null);
//            Color FogOfWarColor = new Color(0, 0, 0, 127);
//            Color FogOfWarColor = new Color(255, 255, 0);//set mau sac
//            g2d.setColor(FogOfWarColor);
//            g2d.setStroke(new BasicStroke(10));//set do rong duong` ve~
            g2d.drawLine(x,y,x/2,y/2);//ve giua 2 toa do
//            g2d.drawString(s, x, y);
//            g2d.drawString(s, 0, 20);
            g2d.dispose();
            return img;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null);
        }

        private static void create() {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.add(new TestImage());
            f.pack();
            f.setVisible(true);
        }

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    create();
                }
            });
        }

}
