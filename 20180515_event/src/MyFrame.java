import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	 //�ʵ�: ��� �޼ҵ忡�� ������ �� �ִ� 
	JButton button;
	JTextField tf;
	JButton btn;
	
	MyFrame() {
		setSize(900,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("chois event frame");
		
		setLayout(new FlowLayout());

		button = new JButton("chois button"); //��ư ��ü ����
		add(button); //��ư ��ü�� �����ӿ� �߰�
		button.setActionCommand("button1");
		button.addActionListener(this); //�̺�Ʈ ������ ��ü ���
		
		btn = new JButton("�� ��° ��ư");
		add(btn);
		btn.setActionCommand("button2");
		btn.addActionListener(this); //�̺�Ʈ ������ ��ü ���

		tf = new JTextField(20);
		add(tf);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ((e.getActionCommand()).equals("button1")) {
			tf.setText("ù ��° ��ư");
		}
		else {
			tf.setText("�� ��° ��ư");
		}
		
		
		
//		System.out.println("OMG ��ư�� ���������!!!!");		
		//�׼��̺�Ʈ ��ü���� ������ ��ư ��ü(��ư��ü�� ���۷�����)�� �����´�.
//		button.setText("��ư�� �Ƕ� ���������!!!!");
	}
}
