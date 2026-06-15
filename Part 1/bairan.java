import javax.swing.*;
import java.awt.*;

public class bairan extends JFrame {

    JLabel lyricsLabel;

    public bairan() {
        setTitle("Bairan Lyrics");
        setSize(900, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lyricsLabel = new JLabel("", SwingConstants.CENTER);
        lyricsLabel.setFont(new Font("Arial", Font.BOLD, 26));

        add(lyricsLabel);

        setVisible(true);

        displayLyrics();
    }

    public void displayLyrics() {
        String[] lyrics = {
                "Ho, manne sambh-sambh rakhe tere jhanjhara ke jode",
                "Meri gel ro-ro ye bhi chhori bawle se hore",
                "Manne aaye jaave khyaal tere, khaye jaave khyaal tere",
                "Jeen koni deti, haaye bairi tanhaayi manne",
                "Geetaan mein gaayi, kade chhaati ke lagaayi manne",
                "Jit bhi gaya re, teri yaad khadi paayi manne",
                "Sambh-sambh rakhi bahut, chhaati ke lagaayi manne",
                "Jit bhi gaya re, teri yaad khadi paayi manne"
        };

        new Thread(() -> {
            try {
                for (String line : lyrics) {
                    lyricsLabel.setText(line);
                    Thread.sleep(3000); // 4 sec per line
                }
                lyricsLabel.setText("♪ End of Lyrics ♪");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new bairan());
    }
}