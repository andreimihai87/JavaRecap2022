package amd.caveofprogramming.section33.l413.controller;

import amd.caveofprogramming.section33.l413.gui.ArtPanel;
import amd.caveofprogramming.section33.l413.gui.MainFrame;

public class Controller {

    private ArtPanel artPanel;
    private MainFrame mainFrame;

    public Controller() {
        artPanel = new ArtPanel(new Rule(22));
        mainFrame = new MainFrame();

        mainFrame.setContentPane(artPanel);
    }

}
