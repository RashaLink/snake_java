import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame() {

        // instead of instantiating the whole object
        //GamePanel panel = new GamePanel();

        // shortcut of instantiating the above object (more direct)
        this.add(new GamePanel());  // removed panel and placed second part
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //pack the components we add in the frame properly
        this.pack();


        this.setVisible(true);
        // makes frame appear in the middle of the screen
        this.setLocationRelativeTo(null);



    }

}
