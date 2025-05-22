package calcPackage;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Themes extends calcMainFrame {
    
    private calcMainFrame calFrame; // Store the reference

    // Constructor to receive the calcMainFrame instance
    public Themes(calcMainFrame frame) {
        this.calFrame = frame;
    }
    
    public void changeTextFieldPropertiesUI(JTextField field, int r, int g, int b, Color clr) {
        
        field.setBackground(new Color(r, g, b));
        field.setForeground(clr);
    }
    
    public void changeButtonPropertiesUI(JButton button, int r, int g, int b, Color clr) {
        
        button.setBackground(new Color(r, g, b));
        button.setForeground(clr);
    }
    
    public void DefaultTheme() {

        //displayTextField setup
        changeTextFieldPropertiesUI(calFrame.getDisplayTextField(), 255, 255, 255, Color.BLACK);

        //resultDisplay setup
        changeTextFieldPropertiesUI(calFrame.getResultDisplay(), 255, 255, 255, Color.BLACK);

        //Buttons
        //C [102,96,255]
        changeButtonPropertiesUI(calFrame.getClearButton(), 102, 96, 255, Color.WHITE);

        //Percentage
        changeButtonPropertiesUI(calFrame.getPercentButton(), 102, 96, 255, Color.WHITE);

        //Division
        changeButtonPropertiesUI(calFrame.getDivisionButton(), 102, 96, 255, Color.WHITE);

        //Backspace
        changeButtonPropertiesUI(calFrame.getBackspaceButton(), 102, 96, 255, Color.WHITE);

        //Multiplication [255,160,76]
        changeButtonPropertiesUI(calFrame.getTimesButton(), 255, 160, 76, Color.WHITE);

        //Substraction
        changeButtonPropertiesUI(calFrame.getMinusButton(), 255, 160, 76, Color.WHITE);

        //Sum
        changeButtonPropertiesUI(calFrame.getPlusButton(), 255, 160, 76, Color.WHITE);

        //Equals
        changeButtonPropertiesUI(calFrame.getEqualsButton(), 255, 160, 76, Color.WHITE);

        //Number Buttons[249,249,249]
        //7 Button
        changeButtonPropertiesUI(calFrame.getButton7(), 249, 249, 249, Color.BLACK);

        //8 Button
        changeButtonPropertiesUI(calFrame.getButton8(), 249, 249, 249, Color.BLACK);

        //9 Button
        changeButtonPropertiesUI(calFrame.getButton9(), 249, 249, 249, Color.BLACK);

        //4 Button
        changeButtonPropertiesUI(calFrame.getButton4(), 249, 249, 249, Color.BLACK);

        //5 Button
        changeButtonPropertiesUI(calFrame.getButton5(), 249, 249, 249, Color.BLACK);

        //6 Button
        changeButtonPropertiesUI(calFrame.getButton6(), 249, 249, 249, Color.BLACK);

        //1 Button
        changeButtonPropertiesUI(calFrame.getButton1(), 249, 249, 249, Color.BLACK);

        //2 Button
        changeButtonPropertiesUI(calFrame.getButton2(), 249, 249, 249, Color.BLACK);

        //3 Button
        changeButtonPropertiesUI(calFrame.getButton3(), 249, 249, 249, Color.BLACK);

        //0 Button
        changeButtonPropertiesUI(calFrame.getButton0(), 249, 249, 249, Color.BLACK);

        //. Button
        changeButtonPropertiesUI(calFrame.getPeriodButton(), 249, 249, 249, Color.BLACK);
        
        calFrame.getMainPanelCalc().setBackground(Color.WHITE);
        
    }
    
}
