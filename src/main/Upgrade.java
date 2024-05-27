package src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Upgrade {
    Text text;
    JButton levelUpUpgrade;
    String levelUpTXT = "Cost: ";
    int levelUpCost = 100;

    Upgrade(Text text) {
        this.text = text;

        levelUpUpgrade = new JButton();
        levelUpUpgrade.setBounds(270, 22, 300, 25);
        levelUpUpgrade.setText(levelUpTXT + levelUpCost);
        levelUpUpgrade.setForeground(Color.WHITE);
        levelUpUpgrade.setFont(new Font("Monocraft", Font.PLAIN, 20));
        levelUpUpgrade.setHorizontalAlignment(SwingConstants.RIGHT);
        levelUpUpgrade.setBorderPainted(false);
        levelUpUpgrade.setContentAreaFilled(false);
        levelUpUpgrade.setFocusPainted(false);

        levelUpUpgrade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.countOfCookies >= levelUpCost) {
                    text.countOfCookies -= levelUpCost;
                    text.count.setText(text.countOfCookiesTXT + text.countOfCookies);

                    text.clickLevel += 1;
                    text.level.setText(text.clickLevelTXT + text.clickLevel);

                    levelUpCost *= 2;
                    levelUpUpgrade.setText(levelUpTXT + levelUpCost);
                }
            }
        });
    }
}
