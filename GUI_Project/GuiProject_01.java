/*   Study 참조 링크: https://brian-s.tistory.com/97   */

/* Why not Playing
import java.awt.*; //모든 GUI 컴포넌트의 최상위 Class
import javax.swing.*; //Swing 컴포넌트의 최상위 Class
*/

import java.awt.FlowLayout;

import java.awt.Dimension;
import java.awt.Toolkit;

import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel; //액자. html에서의  <div> 와 같은 기능

import javax.swing.ImageIcon; //이미지를 출력하는 기능

import javax.swing.JTextField; //텍스트 입력을 받는 줄이 생김

class GUI_Playing extends JFrame {
	GUI_Playing() {
		Toolkit kit = Toolkit.getDefaultToolkit(); //Toolkit 클래스 생성(기능 사용)
		Dimension screenSize = kit.getScreenSize(); //화면의 크기를 파악
		
		setLocation((screenSize.width / 2)-500, (screenSize.height / 2)-400);
		//화면 폭의 1/2 지점, 화면 높이의 1/2 지점에 시작 포인트(창의 왼쪽 상단)을 맞추는 기능
		
		setSize(1000, 800); //띄울 창의 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X버튼을 눌렀을 때 종료되도록
		setTitle("MainFrame"); //창의 제목
		
		Image img = kit.getImage("pra_icon.jpg");
		setIconImage(img);
		
		setLayout(new FlowLayout()); //AWT 기능. 흐름대로 배치되도록 기능함
		
		/* this.add()는 JFrame의 메소드이기 때문에 꼭 this를 적을 필요가 없다.
	                즉 여기서의 this는 강조로 생각하고, 생략해도 된다. */
		
		JPanel panel_1 = new JPanel();
		JLabel label_1 = new JLabel("This is Button1"); //글씨 삽입
		JButton button_1 = new JButton("Button1");
		panel_1.add(label_1);
		panel_1.add(button_1);
		
		button_1.setEnabled(false); //버튼 1을 사용 불가하게 만듦
		
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
		text_2.setText("안녕하세요");
		
		String copytext_1 = new String();
		text_3.setEnabled(false);
		copytext_1 = text_1.getText();
		text_3.setText(copytext_1);
		panel_5.add(text_1);
		panel_5.add(text_2);
		panel_5.add(text_3);
		this.add(panel_5);

		/* 창 설정: (setVisible(true) 아래의 창 설정 코드는 실행되지 않음) */
		setVisible(true); //창을 띄울지 말지를 결정(True / False)
		setResizable(false); //창의 크기를 사용자가 변경할수 있도록 하는지 결정(True-기본)/False)
	}
	
}

public class GuiProject_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GUI_Playing MF = new GUI_Playing(); //생성자를 불러옴
	}

}
