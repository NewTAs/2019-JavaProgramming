import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class GUI_Project_02 extends JFrame {

	public GUI_Project_02() {
		setTitle("GUI_PROJECT_02");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JOptionPane.showMessageDialog(this, "축하합니다.");
		//간단한 메세지창
		
		System.out.println(JOptionPane.showConfirmDialog(this, "선택하시겠습니까?"));
		//간단한 확인창. YES:0 NO:1 CANCEL:2
		System.out.println(JOptionPane.showInputDialog(this, "이름은?"));
		//사용자 입력창(간단한 입력값을 받는 창)
		
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GUI_Project_02();
		
	}

}
