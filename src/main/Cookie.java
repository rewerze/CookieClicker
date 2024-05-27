package src.main;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Cookie {

    JButton button;
    Text text;
    ImageIcon cookie;
    ImageIcon smallerCookie;

    Cookie(Text text) {
        this.text = text;
        int WH = 300;

        URL imgURL = Main.class.getClassLoader().getResource("res/cookie.png");
        cookie = new ImageIcon(imgURL);

        // transorm the icon into and image to enlarge it then it tranforms it back
        Image image = cookie.getImage();
        Image newimg = image.getScaledInstance(WH, WH, java.awt.Image.SCALE_SMOOTH);
        cookie = new ImageIcon(newimg);

        // Create a smaller version of the icon
        int smallerWH = (int) (WH * 0.9); // 90% of the original size
        Image smallerImage = image.getScaledInstance(smallerWH, smallerWH, java.awt.Image.SCALE_SMOOTH);
        smallerCookie = new ImageIcon(smallerImage);

        // button properties
        button = new JButton();
        button.setBounds(140, 220, WH, WH);
        button.setFocusable(false);
        button.setIcon(cookie);
        button.setBorder(null);
        button.setBackground(new Color(5, 5, 15));
        button.setContentAreaFilled(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.countOfCookies += text.clickLevel;
                text.count.setText(text.countOfCookiesTXT + text.countOfCookies);
            }
        });
    }
}