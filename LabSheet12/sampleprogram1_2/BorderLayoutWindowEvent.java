package LabSheet12.sampleprogram1_2;

//BorderLayoutWindowEvent.java
/*This program shows how the BorderLayout layout manager and window-events
operate*/

import LabSheet12.sampleprogram1.BorderLayoutWindowEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestAnonymous extends JFrame{

    private JButton jb[];

    public static void main(String args[]) {
        TestAnonymous b = new TestAnonymous();
    }

    public TestAnonymous() {
        super("Demonstrating BorderLayout & WindowEvent");

        BorderLayout layout = new BorderLayout(6, 8);
        setLayout(layout);

        String regions[] = {BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST,
                BorderLayout.WEST, BorderLayout.CENTER};

        jb = new JButton[regions.length];

        for (int i = 0; i < regions.length; i++) {
            jb[i] = new JButton(regions[i]);
            add(jb[i],regions[i]);
        }

        setSize(400, 300);

        addWindowListener(new WindowListener(){ //anonymous inner class created here
                                                //and instantiated
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window now opened", "Opening Window",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            //hides the window on closing by default (so application is still actually running in background)
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Now closing window", "Closing Window",
                        JOptionPane.INFORMATION_MESSAGE);
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exiting Application Confirmation",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if (choice == JOptionPane.YES_OPTION)
                    dispose();
            }
            //method only called when dispose() is called on the relevant window from elsewhere
            public void windowClosed(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window Closed (Disposed)", "Window Closed (Disposed)",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            public void windowIconified(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window Minimised", "Window Minimised",
                        JOptionPane.INFORMATION_MESSAGE);

                int random = (int)(Math.random()*5);

                remove(jb[random]); //remove a random button from the JFrame window
            }
            public void windowDeiconified(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window Unminimised", "Window Unminimised",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            public void windowActivated(WindowEvent e) {
                //better to use console here to prevent logical error
                System.out.println("Window Activated");
            }
            public void windowDeactivated(WindowEvent e) {
                //better to use console here to prevent logical error
                System.out.println("Window Deactivated");
            }

        });
        setVisible(true);
    }
}