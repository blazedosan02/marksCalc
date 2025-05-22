package calcPackage;

import java.awt.Color;

public class Themes extends calcMainFrame {

    private calcMainFrame calFrame; // Store the reference

    // Constructor to receive the calcMainFrame instance
    public Themes(calcMainFrame frame) {
        this.calFrame = frame;
    }

    public void DefaultTheme() {
        
        //displayTextField setup
        calFrame.getDisplayTextField().setBackground(Color.WHITE);


    }

}
