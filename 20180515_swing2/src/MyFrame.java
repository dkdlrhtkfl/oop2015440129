import java.awt.FlowLayout;
import javax.swing.*;

//JFrame���� ��ӹ��� Ŭ�󽺸� �����
public class MyFrame extends JFrame {
	public MyFrame() {
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("chois 2nd frame");
		
		//���ο� ������Ʈ�� �����ӿ� �߰�
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
//		this.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("�� �ڸ� ������ �Է��ϼ���"); //���̺� ��ü ����
		JTextField tf = new JTextField(20); //�ؽ�Ʈ�ʵ� ��ü ����
		JButton button = new JButton("chois button"); //��ư ��ü ����
		
		button.setText("�ּ���");
		tf.setText("���� ���̷ε� ��������");
		//�г� ����
		JPanel panel = new JPanel();
		panel.add(label); //���̺� ��ü�� �����ӿ� �߰�
		panel.add(tf); //�ؽ�Ʈ�ʵ� ��ü�� �����ӿ� �߰�

		this.add(button); //��ư ��ü�� �����ӿ� �߰�
		this.add(panel);
		
//		this.pack(); //������Ʈ�� �°� ������ ũ�� �ڵ� ����
		this.setVisible(true);
	}
}
