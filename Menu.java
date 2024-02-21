"""
TiahManda Clock App
Version 1.0

Author: TiahManda
Date: February 21, 2024
File: Menu.java


Description:
This clock app displays - the current time in a user-friendly interface.
                        - the UTC time
                        - Time of the region you need
                        - Customised time

License: "MIT"
"""

import javax.swing.*;

public class Menu {
    private JFrame frame;

    // Constructor
    public Menu() {

    }

    // Method to create the menu
    public void createMenu(JFrame frame) {
        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu settingsMenu = new JMenu("Settings");
        JMenu preferenceMenu = new JMenu("Preference");

        // Add menus to the menu bar
        menuBar.add(settingsMenu);
        menuBar.add(preferenceMenu);

        // Add JMenuItem items to the Settings menu
        JMenuItem setActualTimeItem = new JMenuItem("Set Actual Time");
        JMenuItem setToUtcItem = new JMenuItem("Set to UTC");
        JMenuItem setToAnotherRegionItem = new JMenuItem("Set to Another Region");
        JMenuItem customizeTimeItem = new JMenuItem("Customize Time");

        settingsMenu.add(setActualTimeItem);
        settingsMenu.add(setToUtcItem);
        settingsMenu.add(setToAnotherRegionItem);
        settingsMenu.add(customizeTimeItem);

        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);
    }

}
