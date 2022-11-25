package amd.caveofprogramming.section33.l413.application;

import javax.swing.SwingUtilities;

import amd.caveofprogramming.section33.l413.controller.Controller;

public class App {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(Controller::new);
        
    }

}
