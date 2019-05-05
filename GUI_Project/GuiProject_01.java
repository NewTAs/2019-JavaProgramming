/*   Study ���� ��ũ: https://brian-s.tistory.com/97   */

/* Why not Playing
import java.awt.*; //��� GUI ������Ʈ�� �ֻ��� Class
import javax.swing.*; //Swing ������Ʈ�� �ֻ��� Class
*/

import java.awt.FlowLayout;

import java.awt.Dimension;
import java.awt.Toolkit;

import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel; //����. html������  <div> �� ���� ���

import javax.swing.ImageIcon; //�̹����� ����ϴ� ���

import javax.swing.JTextField; //�ؽ�Ʈ �Է��� �޴� ���� ����

class GUI_Playing extends JFrame {
	GUI_Playing() {
		Toolkit kit = Toolkit.getDefaultToolkit(); //Toolkit Ŭ���� ����(��� ���)
		Dimension screenSize = kit.getScreenSize(); //ȭ���� ũ�⸦ �ľ�
		
		setLocation((screenSize.width / 2)-500, (screenSize.height / 2)-400);
		//ȭ�� ���� 1/2 ����, ȭ�� ������ 1/2 ������ ���� ����Ʈ(â�� ���� ���)�� ���ߴ� ���
		
		setSize(1000, 800); //��� â�� ũ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X��ư�� ������ �� ����ǵ���
		setTitle("MainFrame"); //â�� ����
		
		Image img = kit.getImage("pra_icon.jpg");
		setIconImage(img);
		
		setLayout(new FlowLayout()); //AWT ���. �帧��� ��ġ�ǵ��� �����
		
		/* this.add()�� JFrame�� �޼ҵ��̱� ������ �� this�� ���� �ʿ䰡 ����.
	                �� ���⼭�� this�� ������ �����ϰ�, �����ص� �ȴ�. */
		
		JPanel panel_1 = new JPanel();
		JLabel label_1 = new JLabel("This is Button1"); //�۾� ����
		JButton button_1 = new JButton("Button1");
		panel_1.add(label_1);
		panel_1.add(button_1);
		
		button_1.setEnabled(false); //��ư 1�� ��� �Ұ��ϰ� ����
		
		this.add(panel_1);

		JPanel panel_2 = new JPanel();
		JLabel label_2 = new JLabel("This is Button2");
		JButton button_2 = new JButton("Button2");
		panel_2.add(label_2);
		panel_2.add(button_2);
		this.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		JLabel label_3 = new JLabel("This is Button3");
		JButton button_3 = new JButton("Button3");
		panel_3.add(label_3);
		panel_3.add(button_3);
		this.add(panel_3);
		
		/*
		JPanel panel_4 = new JPanel();
		ImageIcon Image = new ImageIcon("KakaoTalk_20190408_145755712.jpg");
		JLabel Image_1 = new JLabel(Image);
		panel_4.add(Image_1);
		this.add(panel_4);
		*/
		
		JPanel panel_5 = new JPanel();
		JTextField text_1 = new JTextField(10);
		JTextField text_2 = new JTextField(10);
		JTextField text_3 = new JTextField(10);
		text_2.setEnabled(false);
		text_2.setText("�ȳ��ϼ���");
		
		String copytext_1 = new String();
		text_3.setEnabled(false);
		copytext_1 = text_1.getText();
		text_3.setText(copytext_1);
		panel_5.add(text_1);
		panel_5.add(text_2);
		panel_5.add(text_3);
		this.add(panel_5);

		/* â ����: (setVisible(true) �Ʒ��� â ���� �ڵ�� ������� ����) */
		setVisible(true); //â�� ����� ������ ����(True / False)
		setResizable(false); //â�� ũ�⸦ ����ڰ� �����Ҽ� �ֵ��� �ϴ��� ����(True-�⺻)/False)
	}
	
}

public class GuiProject_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GUI_Playing MF = new GUI_Playing(); //�����ڸ� �ҷ���
	}

}
