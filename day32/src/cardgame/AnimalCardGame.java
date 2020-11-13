package cardgame;
//동물의 숲 카드 게임
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnimalCardGame extends JFrame {
	// - 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();
	private CardDeck carddeck = new CardDeck();

	// 생성자 : 창에 대한 설정
	public AnimalCardGame() {
		this.place();
		carddeck.place();
		carddeck.event();
		this.setTitle("Animal Crossing Card Game");
		this.setLocation(100, 100);
		this.setSize(1000, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public void place() {
		// root를 Frame의 ContentPane으로 설정
				// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
				this.setContentPane(root);
				root.setLayout(new BorderLayout());

				root.add(carddeck.getScore(), BorderLayout.NORTH);
				carddeck.setLayout(new GridLayout(2, 5));


				root.add(carddeck, BorderLayout.CENTER);
		
	}



}
