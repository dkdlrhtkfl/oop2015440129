import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{
	JTextField tf;
	int tempNum1=0, tempNum2=0, resultNum=0;
	JButton bt[];
	int result=0;
	
	public Calculator() {
		
		
//		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("PLUS Calculator");
		
		//새로운 컴포넌트를 프레임에 추가
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		JLabel label = new JLabel("정수를 입력하세요"); //레이블 객체 생성
		tf = new JTextField(20); //텍스트필드 객체 생성
		
		bt = new JButton[13];
		
		for(int i=0; i<=9; i++) {
			bt[i] = new JButton(String.valueOf(i));
		}
		bt[10] = new JButton("+");
		bt[11] = new JButton("=");
		bt[12] = new JButton("C");
		
		for(int i=0; i<=12; i++) {
			bt[i].addActionListener(this);
		}
		
		
		//패널 생성
		JPanel upperpanel = new JPanel();
		upperpanel.add(label); //레이블 객체를 프레임에 추가
		upperpanel.add(tf); //텍스트필드 객체를 프레임에 추가

		
		add(upperpanel);

		JPanel lowerpanel = new JPanel();

		for(int i=0; i<=12; i++) {
			lowerpanel.add(bt[i]); //버튼 객체를 프레임에 추가
		}

		add(lowerpanel);

		pack(); //컴포넌트에 맞게 프레임 크기 자동 조절
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<=9; i++)	{
			if(e.getSource()==bt[i]) {
				if(result==1) {
					tempNum1=0;
					result=0;
				}
				tempNum1 = tempNum1*10;
				tempNum1 = tempNum1 + i;
				tf.setText(String.valueOf(tempNum1));
				break;
			}
		}

		if(e.getSource()==bt[10]) {
			if(result==1) {
				tempNum1 = 0;
			}
			tempNum2 = tempNum2 + tempNum1;
			tempNum1 = 0;
			result=0;
		}
		if(e.getSource()==bt[11]) {

			tempNum2 = tempNum2 + tempNum1;
			tf.setText(String.valueOf(tempNum2));

			result=1;
		}
		if(e.getSource()==bt[12]) {
			tempNum1 = 0;
			tempNum2 = 0;
			tf.setText(String.valueOf(tempNum1));
		}

	}
}
