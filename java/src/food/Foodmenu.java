package food;

import java.util.Scanner;

public class Foodmenu {
	// ���׸� 6�� ���� Ÿ��(�迭)
	// ������ ������ ����ִ� �迭
	public String foodType[] = {"Meat", "Seafood", "Soup"};
	
	// ���׸� 5�� ������
	// TypeOfFood���� ��û�� �������� �����̸��� ����Ѵ�.
	public void print(Food food) {
		food.printFood();
	}
	
	
	// ���׸� 5�� ������
	// TypeOfFood���� ��û�� ���������� �����̸��� �߰��Ѵ�.
	public void addFood(Food food) {
		
		// ��ĳ�ʷ� ������ �̸��� �Է¹޴´�.
		System.out.print("�߰��� ������ �̸��� �Է����ּ���. �߰��� ������ ���ٸ� '����'�� �Է����ּ���: ");
		Scanner scan = new Scanner(System.in);
		String foodname = scan.nextLine();
		
		//���� �����̸��� �����̸� return�Ͽ� �޼ҵ� ����
		if(foodname.equals("����")) {
			return;
		}
		
		// ����������ü�� setFood�� boolean�� return �޴´�.
		// true�̸� ���������� ������ �߰� O
		// false�� �̹� ���� ������ �־� �߰� x
		boolean result;
		result = food.setFood(foodname);
		
		if(result) {
			System.out.println("������ �߰��߽��ϴ�.");
		}
		else {
			System.out.println("�̹� ������ �����մϴ�.");
		}
	}
	
	
	
}
