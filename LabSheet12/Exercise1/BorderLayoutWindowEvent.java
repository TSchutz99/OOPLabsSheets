package LabSheet12.Exercise1;

/* BorderLayoutWindowEvent.java
 * By: Faun Schutz
 * Start: 10/11/2020
 * Finish:
 *
 * This program shows how the BorderLayout layout manager and window-events
 * operate*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BorderLayoutWindowEvent extends JFrame{

    private JLabel label;
    private JTextArea input;

    public BorderLayoutWindowEvent() {
        super("Text Analyser");

        BorderLayout layout = new BorderLayout(6, 8);
        setLayout(layout);

        label = new JLabel("Please enter your text on the text-area below");
        add(label, BorderLayout.NORTH);

        input = new JTextArea();
        input.setForeground(Color.blue);
        input.setLineWrap(true);
        add(input, BorderLayout.CENTER);

        addWindowListener(new WindowEventHandler());
        setSize(400, 300);

        setVisible(true);
    }


    public static void main(String args[]) {
        BorderLayoutWindowEvent b = new BorderLayoutWindowEvent();
    }

    private class WindowEventHandler implements WindowListener {

        public void windowOpened(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Welcome to this niffy little GUI Application. It is deigned to take some user-supplied" +
                                                                      "\ntext entered onto a text-area and when the JFrame window is minimised, it will give" +
                                                                      "\nsome statistical information about the text entered. Then, when the window is" +
                                                                      "\nminimized, it will clear the text-area for new input.",
                                            "Opening Window", JOptionPane.INFORMATION_MESSAGE);
        }

        //hides the window on closing by default (so application is still actually running in background)
        public void windowClosing(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Thanks for using the program!", "Exiting Application",JOptionPane.INFORMATION_MESSAGE);
        }

        //method only called when dispose() is called on the relevant window from elsewhere
        public void windowClosed(WindowEvent e) {
            System.exit(0);
        }


        public void windowIconified(WindowEvent e) {
            String text = input.getText();
            int vowels = 0, letters = 0, digits = 0, words = 1, sentences = 0, wordsD = 0;

            for(int i = 0; i < text.length(); i++){
                if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' ||
                   text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O' || text.charAt(i) == 'U')
                    vowels++;

                if(Character.isLetter(text.charAt(i)))
                    letters++;

                if(Character.isDigit(text.charAt(i)))
                    digits++;

                if(text.charAt(i) == ' ')
                    words++;

                if(text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?')
                    sentences++;

                if(text.charAt(i) == 'd' && (text.charAt(i+1) == ' ' || text.charAt(i) == ',' || text.charAt(i) == '.' ||
                   text.charAt(i) == '!' || text.charAt(i) == '?'))
                    wordsD++;
            }

            JOptionPane.showMessageDialog(null, "Statistical Information for Text Entered" +
                                                                      "\n\n\nTotal number of characters: " + text.length() +
                                                                      "\nTotal number of vowels: " + vowels +
                                                                      "\nTotal number of letters: " + letters +
                                                                      "\nTotal number of digits: " + digits +
                                                                      "\nTotal number of words: " + words +
                                                                      "\nTotal number of sentences: " + sentences +
                                                                      "\nTotal number of ords ending with 'd': " + wordsD,
                                            "Program Data", JOptionPane.INFORMATION_MESSAGE);
            input.setText("");
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
    }
}
