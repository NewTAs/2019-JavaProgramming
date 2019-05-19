import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ButtonClick implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		JButton Login_Button_Clicker = (JButton) e.getSource();

		if (Login_Button_Clicker.getText().equals("회원가입"))
			new MakeID();
		if (Login_Button_Clicker.getText().equals("ID 찾기"))
			System.out.println("ID 찾기 버튼");
		if (Login_Button_Clicker.getText().equals("PW 찾기"))
			System.out.println("PW 찾기 버튼");
		if (Login_Button_Clicker.getText().equals("Login"))
			System.out.println("Login 완료");
	
		JButton MakeID_Button_Clicker = (JButton) e.getSource();

		if (MakeID_Button_Clicker.getText().equals("중복확인"))
			System.out.println("아이디 중복 확인 버튼");
		if (MakeID_Button_Clicker.getText().equals("<html>비밀번호<br> 설정</html>"))
			System.out.println("비밀번호 설정 버튼");
		if (MakeID_Button_Clicker.getText().equals("중복 확인"))
			System.out.println("닉네임 중복 확인 버튼");
		if (MakeID_Button_Clicker.getText().equals("확인"))
			System.out.println("확인 버튼");
		if (MakeID_Button_Clicker.getText().equals("취소"))
			System.out.println("취소");
	}

}
