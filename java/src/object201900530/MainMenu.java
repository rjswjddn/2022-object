package object201900530;

import java.util.Scanner;

//�ּ� 3: �������̽� ���
public class MainMenu implements MenuInterface {
	// �޴��� ��ü ���� �����Ư¡, ����, ������ ��
	//HistoryFeature HF = new HistoryFeature();
	TypeOfFood TOF = new TypeOfFood();
	Recipe R = new Recipe();
	
	// �޴��� ����ϴ� �޼ҵ�
	public void openMenu() {
		System.out.println("�ѱ��� �丮�� ��Ī.\n "
				+ "�ѽ�(����)�̶�� �θ��⵵ �Ѵ�. �ַ� �ѱ��� ����� �丮�� ���ϸ�, ���������� ��â���� �ѽ��� 'ǻ�� �ѽ�' �����ε� �Ҹ���.\n"
				+ "�ѽ������������ �ѱ����� ���Ǿ� �� �����, �׿� ������ ����Ḧ ����Ͽ� �ѱ� ������ �������,\n"
				+ "�׿� ������ ��������� �̿��Ͽ� ������� ���İ� �� ���İ� ���õ� ������������ �ڿ���Ȱ�� �� ���Ĺ�ȭ��\n"
				+ "\"�ѽ�\"���� �����ϰ� �ִ�");
		System.out.println("************************************************************************");
		System.out.println("		���");
		System.out.println("		1. �ѽ��� ����� Ư¡");
		System.out.println("		2. �ѽ��� ����");
		System.out.println("		3. �ѽ��� ������");
		System.out.println("************************************************************************");
		selectMenu();
	}
	
	// ����ڰ� �޴��� ���� �޼ҵ�
	public void selectMenu() {
		
		// ����ڰ� ��Ͽ��� ���ϴ� ���� ��
		System.out.print("���ϴ� ����� �̸��̳� ��ȣ�� �Է����ּ���: ");
		Scanner sc = new Scanner(System.in);
		String menu = sc.nextLine();
		
		// goMenu�� ����� ���ϴ� �޴��� �̵�
		goMenu(menu);
	}
	

	
	// ����ڰ� �� �޴��� �̵���
	public void goMenu(String menu) {
		
		// ����ڰ� �� �޴��� ��ü�� ����� open��
		if(menu.equals("�ѽ��� ����� Ư¡") || menu.equals("1")) {
			HistoryFeature HF = new HistoryFeature();
			HF.openMenu();
		}
		else if(menu.equals("�ѽ��� ����") || menu.equals("2")) {
			TOF.openMenu();
		}
		if(menu.equals("�ѽ��� ������") || menu.equals("3")) {
			R.openMenu();
		}
		// ��Ͽ� ���� ���� ���� selectMenu�� �ٽ� �����Ͽ� �ٽ� �Է��� ����
		else {
			System.out.println("��Ͽ� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
		}
		
		openMenu();
	}
	
}
