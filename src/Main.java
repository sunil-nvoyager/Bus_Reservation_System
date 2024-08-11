import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main implements Runnable {
    private final JFrame frame;

    public Main(JFrame frm) {
        this.frame = frm;
    }//constructor closed

    /**
     * Displays the frame by setting its visibility to true.
     * 
     * This method is typically called to make the user interface visible to the user.
     * It should be invoked after the frame has been initialized and configured.
     * 
     * @throws IllegalStateException if the frame has not been properly initialized
     *         or if it is already visible.
     */
    public void run() {
        
        frame.setVisible(true);
    }//run method closed

    /**
     * The entry point of the application.
     * 
     * This method initializes the splash screen with a duration of 3000 milliseconds
     * and then invokes the main application window, which is the login screen.
     * 
     * @param args Command-line arguments passed to the application. This parameter is not used in this implementation.
     * 
     * @throws IllegalArgumentException if the splash screen duration is negative.
     * @throws InterruptedException if the thread executing the splash screen is interrupted.
     * @throws Exception if any other unexpected error occurs during the initialization of the application.
     */
    public static void main(String args[]) {
        
        new frmSplash(3000);
        EventQueue.invokeLater(new Main(new LoginScreen()));
    }//main method closed

}//class closed
