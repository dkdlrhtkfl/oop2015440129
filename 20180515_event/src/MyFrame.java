import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	 //필드: 모든 메소드에서 접근할 수 있다 
	JButton button;
	JTextField tf;
	JButton btn;
	
	MyFrame() {
		setSize(900,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("chois event frame");
		
		setLayout(new FlowLayout());

		button = new JButton("chois button"); //버튼 객체 생성
		add(button); //버튼 객체를 프레임에 추가
		button.setActionCommand("button1");
		button.addActionListener(this); //이벤트 리스너 객체 등록
		
		btn = new JButton("두 번째 버튼");
		add(btn);
		btn.setActionCommand("button2");
		btn.addActionListener(this); //이벤트 리스너 객체 등록

		tf = new JTextField(20);
		add(tf);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ((e.getActionCommand()).equals("button1")) {
			tf.setText("첫 번째 버튼");
		}
		else {
			tf.setText("두 번째 버튼");
		}
		
		
		
//		System.out.println("OMG 버튼이 눌러졌어요!!!!");		
		//액션이벤트 객체에서 눌려진 버튼 객체(버튼객체의 레퍼런스값)를 가져온다.
//		button.setText("버튼이 또또 눌러졌어요!!!!");
	}
}
