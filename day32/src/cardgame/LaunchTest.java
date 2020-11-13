package cardgame;
//동물의 숲 카드 게임
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;

public class LaunchTest {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new TextureLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			System.out.println("스킨 에러");
		}
		AnimalCardGame frame = new AnimalCardGame();
	}
}
