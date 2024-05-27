package src.main;

import java.awt.Color;
import javax.swing.JFrame;

public class Window extends JFrame {

    Cookie cookie;
    Text text;
    Upgrade upgrade;

    Window() {
        int width = 600;
        int height = 600;

        text = new Text();
        cookie = new Cookie(text);
        upgrade = new Upgrade(text);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(width, height);
        this.getContentPane().setBackground(new Color(5, 5, 15));

        // import
        this.add(upgrade.levelUpUpgrade);
        this.add(cookie.button);
        this.add(text.box);
        //
        this.setVisible(true);

    }

}
