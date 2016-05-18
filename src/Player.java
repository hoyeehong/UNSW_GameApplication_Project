import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
/**
 * 
 * @author Yeehong
 *
 */
public class Player extends Object{

	public Player(int x, int y) 
	{
        super(x, y);

        URL loc = this.getClass().getResource("playerIcon.jpg");
        ImageIcon startIcon = new ImageIcon(loc);
        Image image = startIcon.getImage();
        this.setImage(image);
    }

    public void move(int x, int y)
    {
        int nx = this.x() + x;
        int ny = this.y() + y;
        this.setX(nx);
        this.setY(ny);
    }
}
