//STUDY: " https://programmingsummaries.tistory.com/61 "

import java.awt.List;
import java.awt.TextArea;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GUI_Project_01 extends JFrame {
	
	String Ch_array[] = {"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���"};
	
	List list_1 = new List(4, false); //4������ ��������.(��������)
	//List list_2 = new List(3); : 3������ ��������.(���ϼ���)
	
	TextArea text_1 = new TextArea(5, 20);
	
	public GUI_Project_01() {
		setTitle("GUI_PROJECT_01");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		for (String str : Ch_array) //for(����:�迭) : �迭�� �ִ� ������ ������ ���Խ�Ű�� ����
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
