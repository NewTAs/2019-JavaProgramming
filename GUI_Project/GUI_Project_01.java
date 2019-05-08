//STUDY: " https://programmingsummaries.tistory.com/61 "

import java.awt.List;
import java.awt.TextArea;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GUI_Project_01 extends JFrame {
	
	String Ch_array[] = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
	
	List list_1 = new List(4, false); //4행으로 보여진다.(복수선택)
	//List list_2 = new List(3); : 3행으로 보여진다.(단일선택)
	
	TextArea text_1 = new TextArea(5, 20);
	
	public GUI_Project_01() {
		setTitle("GUI_PROJECT_01");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		for (String str : Ch_array) //for(변수:배열) : 배열에 있는 값들을 변수에 대입시키는 역할
			list_1.add(str);
		
		add(list_1);
		add(text_1);
		
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GUI_Project_01();
	}

}
