import javax.swing.*;

public class AppLaucher {
    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
          @Override
            public void run(){
              new WeatherAppGui().setVisible(true);
          }
        });
    }
}
