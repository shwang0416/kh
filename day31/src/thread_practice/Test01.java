package thread_practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.Format;

import javax.swing.JButton;

//창 클래스(기본 폼)

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import com.jtattoo.plaf.mcwin.McWinLookAndFeel;

class MyFrame01 extends JFrame {

	private int time = 0;
	private JPanel root = new JPanel();

	private JLabel lcd = new JLabel();
	private JPanel btns = new JPanel(new GridLayout(3, 1));
//	Q. Integer.toString()과 String.ValueOf() 의 차이?
//	뭐든 상관없나?

	private JButton start = new JButton("start");
	private JButton stop = new JButton("stop");
	private JButton reset = new JButton("reset");
	// 폰트
	private Font f = new Font("koPub", 20, 50);

	// 다른 actionListener에서도 쓰기 위해 event메소드에서 클래스로 뺌
	// Thread는 한 번 interrupt되어 종료되고나면 새로 생성해줘야함
	
	class StopWatch extends Thread{
		
		//생성자
		public StopWatch() {
			this.setDaemon(true); // main의 노예가 돼라(종속)
			//생성자에 넣어서 객체가 생성될 때부터 종속되도록 함
		}
		
		//Thread클래스를 상속받으면 무조건 run메소드가 포함되어있으므로 오버라이딩해준다.
		// = > Runnable r로 생성했던 것을 run메소드안에 넣어줌
		@Override
		public void run() {
			try {
				while (true) {
					time++;
					display(time);
					Thread.sleep(10L);
				}
			} catch (InterruptedException e1) {
				// break?
				// interrupt가 발생하면 while문을 빠져나오게 되므로 break 쓸 필요X
				// Q. 그럼 break보다 효율적인건가? 아니면 똑같은건가?
			}
		}
	}
	
	//Thread 대신에 Thread를 상속받은 StopWatch 객체 생성
	private StopWatch t;	//여기선 선언만 해뒀다가 start가 실행될 때마다 StopWatch생성함

	// 멤버 메소드: 이 클래스에 필요한 기능(코드)를 저장
	// - 컴포넌트 배치 기능, 이벤트 설정, 메뉴 설정
	// - 주인공(frame)은 this라고 부른다.
	public void place() {
		this.setContentPane(root);
		root.setLayout(new BorderLayout());// 중요!

		root.add(lcd, BorderLayout.CENTER); // 큰 면적을 차지할때는 Border - Center
		root.add(btns, BorderLayout.EAST);
		lcd.setBackground(Color.RED);
		lcd.setFont(f);
		
		btns.add(start);
		btns.add(stop);
		btns.add(reset);
		stop.setEnabled(false);
	}

	public void event() {

		start.addActionListener(e -> { // 익명중첩클래스(람다식)
			start.setEnabled(false);
			stop.setEnabled(true);

			
			t = new StopWatch();
			// Thread는 한 번 interrupt되어 종료되고나면 새로 생성해줘야함
			// stop에서도 Thread t에 접근할 수 있어야 하기 때문에 선언은 밖에서 하고
			// start할때마다 new Thread()를 생성해 넣어주면 된다.
			// => Thread()에서 StopWatch로 생성자 대체됨
			
			t.start();
		});
		stop.addActionListener(e -> { // 익명중첩클래스(람다식)
			start.setEnabled(true);
			stop.setEnabled(false);
			t.interrupt();
		});
		reset.addActionListener(e -> { // 익명중첩클래스(람다식)
			time = 0;
			display(0);
		});
	}
	
	public void display(int time) {
		this.time = time;
		int sec = this.time / 100;
		int mil = this.time % 100;
		
		//10진법 수를 나타내는 format? : DecimalFormat
		Format f = new DecimalFormat("00");	//1자리여도 2자리로 표시해라
		
		lcd.setText(f.format(sec) + " : " + f.format(mil));
	}

	public MyFrame01() {
		this.place();
		this.display(0);
		this.event();
		this.setTitle("초시계");
		this.setLocation(100, 100);
		this.setSize(400, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}

public class Test01 {
	// 클래스를 분리해 코드 짜기

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new McWinLookAndFeel());
		} catch (Exception e) {
			System.err.println("스킨을 불러올 수 없습니다");
		}
		MyFrame01 frame = new MyFrame01();
	}
}
