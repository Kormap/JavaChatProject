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

//JFrame �� Ȱ���� �α��� â 
//ȸ������ �� DB�� ������ ������ ��Ī�̵Ǹ� �α����� �� �� �ֵ��� ��ġ

public class Login extends JFrame {
	private JPanel Panel;
	private JTextField userid; // �Է� ĭ (getText() �޼ҵ�� ���ڿ��� �о� �α��θ�ġ�� ����)
	private JPasswordField userpw;
	private JLabel idLabel; // ���÷��� (�Ѱ�)
	private JLabel pwLabel;

	// private dao (�ӽ�) DAO Ŭ���� ���� �ʿ�

	public Login() {
		JPanel Panel = new JPanel(new GridLayout(3,2)); // JPanel �� GridLayout ����
		JLabel idLabel = new JLabel("���̵�:"); // ���̵�, ��й�ȣ Display�� ���ִ� ���
		JLabel pwLabel = new JLabel("��й�ȣ:");
		JTextField userid = new JTextField(); // ���̵� �Է� ĭ
		JPasswordField userpw = new JPasswordField(); // �н����� �Է�ĭ
		JButton loginButton = new JButton("�α���"); // �α��� ��ư ����

		this.userid = userid; // �Է¹��� ������ �������������� �־��ش�.
		this.userpw = userpw;

		setTitle("�α��� ȭ��"); // Title�� �̸� set
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ���� ��� ��ư (����: �ּ�ȭ,�ִ�,â�ݱ�)
		setBounds(1000, 1000, 1000, 1000); // ������ġ,������ġ,���α���,���α��� ����
		
		setContentPane(Panel); // ������ ����
		Panel.add(idLabel); // ID, Display ��ư ����
		Panel.add(userid); // ID,�Է� ĭ ����
		Panel.add(pwLabel);  //PW Display ��ư ����
		Panel.add(userpw);  // PW �Է� ĭ ����
		Panel.add(loginButton); // �α��� Ŭ�� ��ư ����
//		idLabel.setBounds(100,100, 100, 100);
//		userid.setBounds(100,100, 100, 100);
//		pwLabel.setBounds(100,100, 100, 100);
//		userpw.setBounds(100,100, 100, 100);
//		loginButton.setBounds(100,100, 100, 100);
		
		setSize(500,300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//ȸ������ �� DAO�� ����� ID,PW ������� ���Ͽ� ��ġ �� �α��εǰ� ����
		loginButton.addActionListener(new ActionListener() { 
			// actionPerformed(ActionEvent evt) ��������� �������̽� ����
			
			public void actionPerformed(ActionEvent e) {  // �α��� ��ư�� ���������� ���۱��� �޼ҵ�
				
				try {
					boolean login;
					// �α��θ޼ҵ��ʺҷ��ÿ���.
//					login= dao.login(userid.getText(), new String(userpw.getPassword()));			}
				
			}
			
			
		});


	}

	public static void main(String[] ar) {
		// new Login( dao Ŭ���� ��ü �����κ� (�ӽ�))
		Login loginkey = new Login();

	}
}