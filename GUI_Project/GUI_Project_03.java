//STUDY LINK) https://programmingsummaries.tistory.com/61

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GUI_Project_03 extends JFrame {

	JTextArea TextArea_1 = new JTextArea("내용을 입력해주세요.", 10, 20); //Scrool Bar가 없는 TextArea
	JScrollPane Scrool_TextArea_1 = new JScrollPane(TextArea_1);
	
	JMenuBar MenuBar_1 = new JMenuBar();
	JMenu Menu_File = new JMenu("FILE");
	JMenu Menu_Help = new JMenu("HELP");
	
	public GUI_Project_03() {
		JMenuItem MenuItem_NewFile = new JMenuItem("New File");
		JMenuItem MenuItem_OpenFile = new JMenuItem("Open File");
		JMenuItem MenuItem_SaveFile = new JMenuItem("Save File");
		JMenuItem MenuItem_Exit = new JMenuItem("Exit");
		
		JMenuItem MenuItem_Version = new JMenuItem("Version");
		JMenuItem MenuItem_Information = new JMenuItem("Information");
		
		Menu_File.add(MenuItem_NewFile);
		Menu_File.add(MenuItem_OpenFile);
		Menu_File.add(MenuItem_SaveFile);
		Menu_File.add(MenuItem_Exit);
		
		Menu_Help.add(MenuItem_Version);
		Menu_Help.add(MenuItem_Information);
		
		MenuBar_1.add(Menu_File);
		MenuBar_1.add(Menu_Help);
		
		//JFrame.setJMenuBar(MenuBar_1);
	}
	
	public static void main(String[] args) {
		
	}
}
