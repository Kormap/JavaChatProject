package ChatLogin;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//JFrame 을 활용한 로그인 창 
//회원가입 시 DB에 저장한 정보와 매칭이되면 로그인이 될 수 있도록 조치

public class Login extends JFrame {
	private JPanel Panel;
	private JTextField userid; // 입력 칸 (getText() 메소드로 문자열을 읽어 로그인매치할 예정)
	private JPasswordField userpw;
	private JLabel idLabel; // 디스플레이 (겉값)
	private JLabel pwLabel;

	// private dao (임시) DAO 클래스 선언 필요

	public Login() {
		JPanel Panel = new JPanel(new GridLayout(3,2)); // JPanel 에 GridLayout 적용
		JLabel idLabel = new JLabel("아이디:"); // 아이디, 비밀번호 Display만 해주는 기능
		JLabel pwLabel = new JLabel("비밀번호:");
		JTextField userid = new JTextField(); // 아이디 입력 칸
		JPasswordField userpw = new JPasswordField(); // 패스워드 입력칸
		JButton loginButton = new JButton("로그인"); // 로그인 버튼 생성

		this.userid = userid; // 입력받은 값들을 전역변수쪽으로 넣어준다.
		this.userpw = userpw;

		setTitle("로그인 화면"); // Title바 이름 set
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 우측 상단 버튼 (순서: 최소화,최대,창닫기)
		setBounds(1000, 1000, 1000, 1000); // 가로위치,세로위치,가로길이,세로길이 설정
		
		setContentPane(Panel); // 프레임 생성
		Panel.add(idLabel); // ID, Display 버튼 부착
		Panel.add(userid); // ID,입력 칸 부착
		Panel.add(pwLabel);  //PW Display 버튼 부착
		Panel.add(userpw);  // PW 입력 칸 부착
		Panel.add(loginButton); // 로그인 클릭 버튼 생성
//		idLabel.setBounds(100,100, 100, 100);
//		userid.setBounds(100,100, 100, 100);
//		pwLabel.setBounds(100,100, 100, 100);
//		userpw.setBounds(100,100, 100, 100);
//		loginButton.setBounds(100,100, 100, 100);
		
		setSize(500,300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//회원가입 시 DAO로 저장된 ID,PW 정보들과 비교하여 일치 시 로그인되게 구현
		loginButton.addActionListener(new ActionListener() { 
			// actionPerformed(ActionEvent evt) 사용을위한 인터페이스 구현
			
			public void actionPerformed(ActionEvent e) {  // 로그인 버튼이 눌렸을때의 동작구현 메소드
				
				try {
					boolean login;
					// 로그인메소드쪽불러올예정.
//					login= dao.login(userid.getText(), new String(userpw.getPassword()));			}
				
			}
			
			
		});


	}

	public static void main(String[] ar) {
		// new Login( dao 클래스 객체 생성부분 (임시))
		Login loginkey = new Login();

	}
}