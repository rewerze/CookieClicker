package src.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JLabel;

public class Text {
    // boxing the texts
    Box box = Box.createVerticalBox();

    // first label: amount
    JLabel count = new JLabel();
    String countOfCookiesTXT = "Amount of Cookies: ";
    int countOfCookies = 0;

    // second label: level
    JLabel level = new JLabel();
    String clickLevelTXT = "Level: ";
    int clickLevel = 1;

    Text() {

        count.setForeground(Color.WHITE);
        count.setFont(new Font("Monocraft", Font.PLAIN, 20));
        count.setText(countOfCookiesTXT + countOfCookies);
        count.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        box.add(count);

        level.setForeground(Color.WHITE);
        level.setFont(new Font("Monocraft", Font.PLAIN, 20));
        level.setText(clickLevelTXT + clickLevel);
        level.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        box.add(level);
    }

}
