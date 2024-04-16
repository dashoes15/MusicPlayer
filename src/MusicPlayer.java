import javax.swing.*;
import java.awt.*;

public class MusicPlayer {

    public MusicPlayer(){
        String [] songList = {"GORG.wav", "Dumbbells.wav"};

        JFrame frame = new JFrame("Music Player");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));

        JPanel buttonPanel = new JPanel();
        JButton playButton = new JButton("Play");
        JButton pauseButton = new JButton("Pause");
        buttonPanel.add(playButton);
        buttonPanel.add(pauseButton);

        JPanel labelPanel = new JPanel();
        JLabel currentTime = new JLabel("Current Time: 0s");
        JLabel totalTime = new JLabel("total time : 0s");
        labelPanel.add(currentTime);
        labelPanel.add(totalTime);

        JPanel dropDown = new JPanel();
        JComboBox<String> songSelector = new JComboBox<>(songList);
        dropDown.add(songSelector);

        panel.add(dropDown);
        panel.add(buttonPanel);
        panel.add(labelPanel);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MusicPlayer();
    }
}
