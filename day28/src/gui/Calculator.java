package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//창 클래스(기본 폼)

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class CalFrame extends JFrame {
	// 폰트
	Font f1 = new Font("KoPub", Font.BOLD, 20);
	Font f2 = new Font("KoPub", Font.PLAIN, 25);
	// 제목
	private JPanel root = new JPanel();
	// ContentPane (JPanel)

	private JPanel underresult = new JPanel();
	// 결과보여줄 패널1
	private JPanel grid = new JPanel(new GridLayout(4, 4));
	// ContentPane 위에 올라갈 Grid 패널2

	private JLabel result = new JLabel("0", JLabel.LEFT);
	// 결과창

	private JButton[] btns = new JButton[16];
	// Grid 위에 배치될 버튼 16개 (일단 배열자리만)
	private String[] title = new String[] { "7", "8", "9", "+", "4", "5", "6", "*", "1", "2", "3", "/", "0", "C", "-",
			"=" }; // place에서 반복문으로 배치

	// memory, operator 저장
	long memory;
	String operator;

	public void place() {
		this.setContentPane(root);
		root.setLayout(new BorderLayout()); // new Border필요??

		root.add(underresult, BorderLayout.NORTH);

		result.setFont(f2);
		underresult.add(result, BorderLayout.EAST);
		underresult.setBackground(Color.YELLOW);
		root.setBackground(Color.LIGHT_GRAY);

		root.add(grid);
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(title[i]);
			btns[i].setFont(f1);
			grid.add(btns[i]);
		}

	}

	public void event() {

		ActionListener listener = e -> {
			String text = e.getActionCommand();
			switch (text) {
			// 숫자를 입력했으면 화면에 추가
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				// 앞에 0일 수 있으므로 int값으로 바꿨다가
				int n = Integer.parseInt(result.getText() + text);
				// 그걸 다시 String으로 변환
				result.setText(String.valueOf(n));
				break;
			// 기호를 입력했으면 입력된 숫자와 (기호)연산자를 각각 변수에 저장.
			case "+":
			case "-":
			case "*":
			case "/":
				memory = Integer.parseInt(result.getText());
				operator = text;
				// 기억하고있어야하므로 밖에다 선언
				result.setText("0");
				break;
			// C (지우기)
			case "C":
				result.setText("0");
				break;

			case "=":
				long resultValue = 0L;
				switch (operator) {
				case "+":
					resultValue = memory + Long.parseLong(result.getText());
					break;
				case "-":
					resultValue = memory + Long.parseLong(result.getText());
					break;
				case "*":
					resultValue = memory + Long.parseLong(result.getText());
					break;
				case "/":
					resultValue = memory + Long.parseLong(result.getText());
					break;
				}
				result.setText(String.valueOf(resultValue));
				memory = 0L;
				operator = null;
				break;
			}
		};

		for (int i = 0; i < btns.length; i++) {
			btns[i].addActionListener(listener);
		}
	}

	public CalFrame() {
		this.setTitle("로그인화면");
		this.place();
		this.event();
		this.setTitle("계산기");
		this.setLocationByPlatform(true);// 왼쪽 위 모서리 위치(x, y) - px
		this.setSize(400, 500);// 크기(폭,높이) - px(pixel,화소)
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);// 창 크기변경 불가
		
		this.setVisible(true);// 창을 보이게 하는 명령
	}
}

public class Calculator {
	// 클래스를 분리해 코드 짜기
	public static void main(String[] args) {
		CalFrame frame = new CalFrame();
	}
}
