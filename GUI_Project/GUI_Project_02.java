import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class GUI_Project_02 extends JFrame {

	public GUI_Project_02() {
		setTitle("GUI_PROJECT_02");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JOptionPane.showMessageDialog(this, "�����մϴ�.");
		//������ �޼���â
		
		System.out.println(JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?"));
		//������ Ȯ��â. YES:0 NO:1 CANCEL:2
		System.out.println(JOptionPane.showInputDialog(this, "�̸���?"));
		//����� �Է�â(������ �Է°��� �޴� â)
		
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GUI_Project_02();
		
	}

}
