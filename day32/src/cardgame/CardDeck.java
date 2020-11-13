package cardgame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//동물의 숲 카드 게임
//나만의 창 클래스 템플릿(기본폼)
class CardDeck extends JPanel{
	
	private JButton start = new JButton("start");
	
	private int count = 10; // 남은 카드 수
	private int time = 1000; // 10초
	private JPanel score = new JPanel();
	private JLabel leftPair = new JLabel("10 cards left", JLabel.CENTER);
	private JLabel leftTime = new JLabel("10 : 00", JLabel.CENTER);
	// Font
	Font f = new Font("Kopub", Font.BOLD, 30);

	// 아이콘(Icon) : 컴포넌트(label, button등)에 삽입하는 이미지
	// - 크기변경이 불가능하며 바꾸고 싶다면 Image로 변환하여 조정한 뒤 다시 돌려야 한다.
	private ImageIcon icon1 = new ImageIcon("image/julian.jpg");
	private ImageIcon icon2 = new ImageIcon("image/summer.jpg");
	private ImageIcon icon3 = new ImageIcon("image/iris.jpg");
	private ImageIcon icon4 = new ImageIcon("image/buzz.jpg");
	private ImageIcon icon5 = new ImageIcon("image/ben.jpg");
	private ImageIcon icon6 = new ImageIcon("image/blank.jpg");

	// private JButton [] btns =new JButton [10];
	private List<JButton> btns = new ArrayList<>();
	private List<ImageIcon> icns = new ArrayList<>();

	
	public void setCards(Boolean b) {
		for (int i = 0; i < btns.size(); i++) {
			btns.get(i).setEnabled(b);
		}
	}
	
	public void cardFlip(JButton target) {
		target.setBackground(Color.cyan); // 선택한 카드색 하늘색으로 변경
		int index = btns.indexOf(target);
		target.setIcon(icns.get(index));
	}
	
	public void cardFlipBack(JButton target) {
		target.setIcon(icon6);
		target.setBackground(null);
	}
	
	public void showTime(int time) {
		int sec = time / 100;
		int mil = time % 100;

		Format f = new DecimalFormat("00");
		String text = f.format(sec) + " : " + f.format(mil);
		leftTime.setText(text);
	}
	public void showTime(String text) {
		leftTime.setText(text);
	}
	public void finish() {
		if(count!=0) {	//fail
			for(int i=0; i <btns.size();i++) {
				btns.get(i).setBackground(null);
			}
		}
		else  { //sucess
			for(int i=0; i <btns.size();i++) {
				btns.get(i).setBackground(Color.YELLOW);
			}
		}

		start.setEnabled(true);
		setCards(false);
	}
	public void init() {
		for(int i=0; i <btns.size();i++) {
			btns.get(i).setIcon(icon6);
			btns.get(i).setBackground(null);
		}
		count = 10;
		time = 1000;
		showTime(time);
		setCards(true);
		Collections.shuffle(icns);	//start할때마다 셔플
	}

	// 멤버 메소드 : 배치기능
	public void place() {
		score.setLayout(new GridLayout(1, 3));

		score.add(leftPair);
		score.add(leftTime);
		score.add(start);

		leftPair.setFont(f);
		leftTime.setFont(f);
		start.setFont(f);

		for (int i = 0; i < 2; i++) {
			icns.add(icon1);
			icns.add(icon2);
			icns.add(icon3);
			icns.add(icon4);
			icns.add(icon5);
		}

		for (int i = 0; i < 10; i++) {
			btns.add(new JButton());
			this.add(btns.get(i));
			btns.get(i).setIcon(icon6);
		}
		setCards(false);
		// start를 누르기 전까지는 비활성화
	}

	// 첫번째 버튼만큼은 기억하고 있어야하니까 변수로 만든다.
	private JButton first; // :첫 번째로 선택

	// 멤버 메소드 : 이벤트 설정
	public void event() {
		/*
		 * start버튼을 누르면 시간이 흐른다. => 10초가 지나면 Timeover
		 */
		start.addActionListener(e -> {
			Runnable r = () -> {
				try {
					init();
					while (true) {
						Thread.sleep(10L);
						time--;
						if(count == 0) {
							break;
						}
						if (time == 0) {
							showTime("TIME OVER");
							
							finish();
							break;
						} else
							showTime(time);
					}
				} catch (InterruptedException e1) {
				}
			};
			Thread t1 = new Thread(r);
			t1.setDaemon(true);
			t1.start();
		});
		/*
		 * 카드 게임
		 */
		ActionListener listener = e -> {
			JButton target = (JButton) e.getSource(); // 왜 object로 저장됐나?
			// 자바에서는 속도때문에 object로 저장
			// 다운캐스팅을 통해 원래 형태로 되돌려줌

			if (first == null) { // 첫번째 선택일 때
				cardFlip(target);
				first = target; // 누른 버튼을 first로 기억

			} else { // 두번째 선택일 때
				Runnable r = () -> {
					try {
						cardFlip(target);
						Thread.sleep(200L);
						if (first != target && first.getIcon().equals(target.getIcon())) {
							// 첫번째와 두번째 카드가 동일하지 않으면서 같은 값을 갖고있다면
							// 성공!
							first.setBackground(Color.yellow);
							target.setBackground(Color.yellow);
							first.setEnabled(false);
							target.setEnabled(false);
							count -= 2;
							leftPair.setText(count + " cards left");
							if(count == 0) {
								leftTime.setText("YOU WIN!");
								finish();
								
							}
						} else {
							cardFlipBack(first);
							cardFlipBack(target);
						}
						first = null;
					} catch (InterruptedException e1) {
					}
				};
				Thread t = new Thread(r);
				t.setDaemon(true);
				t.start();

			}
		};
		for (JButton bt : btns) {
			bt.addActionListener(listener);
		}

	}

	public JPanel getScore() {
		return score;
	}

	public void setScore(JPanel score) {
		this.score = score;
	}

	public JLabel getLeftTime() {
		return leftTime;
	}

	public void setLeftTime(JLabel leftTime) {
		this.leftTime = leftTime;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public JButton getStart() {
		return start;
	}

	public void setStart(JButton start) {
		this.start = start;
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	// 멤버 메소드 : 메뉴 설정
	public void menu() {

	}

	public JLabel getLeftPair() {
		return leftPair;
	}

	public void setLeftPair(JLabel leftPair) {
		this.leftPair = leftPair;
	}

}
