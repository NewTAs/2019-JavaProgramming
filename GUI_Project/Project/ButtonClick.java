import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ButtonClick implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		JButton Login_Button_Clicker = (JButton) e.getSource();

		if (Login_Button_Clicker.getText().equals("ȸ������"))
			new MakeID();
		if (Login_Button_Clicker.getText().equals("ID ã��"))
			System.out.println("ID ã�� ��ư");
		if (Login_Button_Clicker.getText().equals("PW ã��"))
			System.out.println("PW ã�� ��ư");
		if (Login_Button_Clicker.getText().equals("Login"))
			System.out.println("Login �Ϸ�");
	
		JButton MakeID_Button_Clicker = (JButton) e.getSource();

		if (MakeID_Button_Clicker.getText().equals("�ߺ�Ȯ��"))
			System.out.println("���̵� �ߺ� Ȯ�� ��ư");
		if (MakeID_Button_Clicker.getText().equals("<html>��й�ȣ<br> ����</html>"))
			System.out.println("��й�ȣ ���� ��ư");
		if (MakeID_Button_Clicker.getText().equals("�ߺ� Ȯ��"))
			System.out.println("�г��� �ߺ� Ȯ�� ��ư");
		if (MakeID_Button_Clicker.getText().equals("Ȯ��"))
			System.out.println("Ȯ�� ��ư");
		if (MakeID_Button_Clicker.getText().equals("���"))
			System.out.println("���");
	}

}
