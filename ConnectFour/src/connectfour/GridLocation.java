package connectfour;

import javax.swing.JLabel;

public class GridLocation {
    private Player player;
    private JLabel label;
    
    public GridLocation(JLabel label) {
        this.label = label;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public JLabel getLabel() {
        return label;
    }    
}
