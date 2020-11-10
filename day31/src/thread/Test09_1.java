  
package thread;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import com.jtattoo.plaf.mcwin.McWinLookAndFeel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame09_1 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();

	private int time = 0;
	
	//private JLabel lcd = new JLabel("" + 0, JLabel.CENTER);
	private JLabel lcd = new JLabel(String.valueOf(time), JLabel.CENTER);
	
	private JButton start = new JButton("시작");
	private JButton stop = new JButton("정지");
	private JButton reset = new JButton("초기화");
	
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
		
		//layout을 null로 설정하면 모든 컴포넌트에 좌표를 부여해서 배치가 가능
		// - 복잡한 화면에 유리함
		root.setLayout(null);
		
		root.add(lcd);
		root.add(start);
		root.add(stop);
		root.add(reset);
		
		lcd.setBounds(10, 10, 280, 100);
		Font font = new Font("굴림", Font.BOLD, 50);
		lcd.setFont(font);
		
		start.setBounds(300, 10, 80, 30);
		stop.setBounds(300, 45, 80, 30);
		reset.setBounds(300, 80, 80, 30);
	}
	
	//멤버 메소드 : 이벤트 설정
	public void event() {
		//시작버튼 : 누르면 시간이 증가하도록 구현(time이 10ms당 1씩 증가)
		start.addActionListener(e->{
			
			Runnable r = ()->{
				while(true) {
					time++;
					lcd.setText(String.valueOf(time));
					
					try {
						Thread.sleep(10L);
					}
					catch(Exception ex) {}
				}
			};
			Thread t = new Thread(r);
			t.setDaemon(true);
			t.start();
			
		});
	}
	
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame09_1() {
		this.place();
		this.menu();
		this.event();
		this.setTitle("초시계");
		this.setLocation(100, 100);
		this.setSize(400, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}


	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		try {
			UIManager.setLookAndFeel(new McWinLookAndFeel());
		}
		catch(Exception e) {
			System.err.println("스킨을 불러올 수 없습니다");
		}
		MyFrame09_1 frame = new MyFrame09_1();
	}
}