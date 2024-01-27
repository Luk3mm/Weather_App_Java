import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WeatherAppGui extends JFrame {
    public WeatherAppGui(){
        super("Weather App");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(450, 650);

        setLocationRelativeTo(null); //centraliza a tela

        setLayout(null);

        setResizable(false);

        addGuiComponents();
    }

    private void addGuiComponents(){
        JTextField searchTextField = new JTextField();
        searchTextField.setBounds(15, 15, 350, 45);
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(searchTextField);

        //button
        JButton searchButton = new JButton(loadImage("src/images/lupa.png"));
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
        add(searchButton);

        JLabel weatherConditionImage = new JLabel(loadImage("src/images/cloud.png"));
        weatherConditionImage.setBounds(0, 125, 450, 217);
        add(weatherConditionImage);

        JLabel temperatureText = new JLabel("10 C");
        temperatureText.setBounds(0, 350, 450, 54);
        temperatureText.setFont(new Font("Dialog", Font.BOLD, 48));
        temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperatureText);

        JLabel weatherConditionDescription = new JLabel("Cloudy");
        weatherConditionDescription.setBounds(0, 405, 450, 36);
        weatherConditionDescription.setFont(new Font("Dialog", Font.PLAIN, 32));
        weatherConditionDescription.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherConditionDescription);

        JLabel humidityImage = new JLabel(loadImage("src/images/umidade.png"));
        humidityImage.setBounds(12, 510, 74, 66);
        add(humidityImage);

        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityText.setBounds(75, 512, 85, 55);
        humidityText.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(humidityText);
    }

    private ImageIcon loadImage(String resourcePath){
        try{
            BufferedImage image = ImageIO.read(new File(resourcePath));
            return new ImageIcon(image);
        }
        catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("Could not find resource");
        return null;
    }
}
