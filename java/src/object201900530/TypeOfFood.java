package object201900530;
import java.util.Scanner;
import java.util.InputMismatchException;
import food.*;


public class TypeOfFood {
	
	// ��Ű�� food�� Foodmenu ��ü�� ������.
	Foodmenu foodmenu = new Foodmenu();
	
	// ������ ���� ��ü�� ����
	Meat meat = new Meat();
	Seafood seafood = new Seafood();
	Soup soup = new Soup();
	
	
	// �޴��� ����ϴ� �޼ҵ�
	public void openMenu() {
		System.out.println("************************************************************************");
		System.out.println("		���");
		System.out.println("		1. ���");
		System.out.println("		2. �ػ깰");
		System.out.println("		3. ��, ��, �");
		System.out.println("		4. �ڷ�");
		System.out.println("************************************************************************");
		selectMenu();
	}
	
	// ����ڰ� �޴��� ���� �޼ҵ�
	public void selectMenu() {
		System.out.print("���ϴ� ����� ��ȣ�� �Է����ּ���: ");
		Scanner scan = new Scanner(System.in);
		
		// �޴��� ���ڿ� �޴��� �̸� ����
		int menuNum;
		String menuName;
		
		while(true) {
			// ���׸� 4�� ����ó��
			// ����� ��ȣ�� �Է¹޴´�.
			// int�� �ƴ� �ڷ����� �ԷµǸ� ����ó���Ѵ�.
			// 1~4�� �ƴ� �ٸ� ������ �ԷµǸ� ����ó���Ѵ�.
			try {
				menuNum = scan.nextInt();
				if(menuNum == 4) {
					return;
				}
				menuName = foodmenu.foodType[menuNum-1];	
				break;
			}
			catch(InputMismatchException e) {
				scan = new Scanner(System.in);
				System.out.println("�߸��� �Է��Դϴ�. ��ȣ�� �Է����ּ���.");
				System.out.print("���ϴ� ����� ��ȣ�� �Է����ּ���: ");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				scan = new Scanner(System.in);
				System.out.println("�߸��� �Է��Դϴ�. 1~4�� �Է����ּ���.");
				System.out.print("���ϴ� ����� ��ȣ�� �Է����ּ���: ");
			}

		}
		

		System.out.println(menuName);
		goMenu(menuNum);
	}
	// ����ڰ� �� �޴��� �̵���
	public void goMenu(int num) {
		
		// �޴��� �����̸� ���
		if(num == 1) {
			foodmenu.print(meat);
			foodmenu.addFood(meat);
		}
		else if(num == 2) {
			foodmenu.print(seafood);
			foodmenu.addFood(seafood);
		}
		else {
			foodmenu.print(soup);
			foodmenu.addFood(soup);
		}
		openMenu();
		
		
	}
}
