import java.awt.FlowLayout;
import javax.swing.*;

//JFrame에서 상속받은 클라스를 만든다
public class MyFrame extends JFrame {
	public MyFrame() {
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("chois 2nd frame");
		
		//새로운 컴포넌트를 프레임에 추가
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
//		this.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("네 자리 정수를 입력하세요"); //레이블 객체 생성
		JTextField tf = new JTextField(20); //텍스트필드 객체 생성
		JButton button = new JButton("chois button"); //버튼 객체 생성
		
		button.setText("최성종");
		tf.setText("봄은 봄이로되 졸립구먼");
		//패널 생성
		JPanel panel = new JPanel();
		panel.add(label); //레이블 객체를 프레임에 추가
		panel.add(tf); //텍스트필드 객체를 프레임에 추가

		this.add(button); //버튼 객체를 프레임에 추가
		this.add(panel);
		
//		this.pack(); //컴포넌트에 맞게 프레임 크기 자동 조절
		this.setVisible(true);
	}
}
