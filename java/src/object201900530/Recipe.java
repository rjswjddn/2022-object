package object201900530;
import java.io.*;
import java.util.Scanner;


public class Recipe{
	
	
	File dir = new File("./recipe");
	// �޴��� ����ϴ� �޼ҵ�
	public void openMenu() {
		String filelist[] = dir.list();
		System.out.println("************************************************************************");
		for(String name:filelist) {
			System.out.println(name);
		}
		System.out.println("************************************************************************");
		selectMenu();
	}
	// ����ڰ� �޴��� ���� �޼ҵ�
	public void selectMenu() {
		System.out.print("�ڷ� ���ðڽ��ϱ�? Y/N: ");
		Scanner sc = new Scanner(System.in);
		String yn = sc.nextLine();
		
		if(yn.equals("Y")) {
			return;
		}
		
		// ����ڰ� ����, �߰��� �� ������ ��
		System.out.print("�����Ǹ� �߰��Ͻðڽ��ϱ�? Y/N: ");
		sc = new Scanner(System.in);
		yn = sc.nextLine();
		
		// ����ڰ� �����Ǹ� �߰���
		if(yn.equals("Y")) {
			System.out.println("�߰��� �������� �̸��� �Է����ּ���: ");
			sc = new Scanner(System.in);
			String foodname = sc.nextLine();
			String recipefile = foodname + ".txt";
			editrecipe(recipefile);
		}
		// ����ڰ� �����Ǹ� ��
		else if (yn.equals("N")) {
			System.out.println("������� �������� �̸��� �Է����ּ���: ");
			sc = new Scanner(System.in);
			String foodname = sc.nextLine();
			String recipefile = foodname + ".txt";
			goMenu(recipefile);
		}

		openMenu();
	}
	
	
	//�ּ� 8: ���� ��/��� ���
	// ����ڰ� �� �޴��� �̵���
	public void goMenu(String recipefile) {
		int data;
		// �ּ� 4: ����ó��
		try {
			Reader reader = new FileReader("./recipe/"+recipefile);
			while(true) {
				data = reader.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
				
			}
			System.out.println();
			reader.close();
		} catch (IOException e) {
			System.out.println("�����ǰ� �������� �ʽ��ϴ�.");
			return;
		}
		

	}
	
	
	//�ּ� 8: ���� ��/��� ���
	public void editrecipe(String recipefile) {
		File file = new File("./recipe/"+recipefile);
		if (file.exists()) {
			System.out.println("�̹� �����ǰ� �����մϴ�.");
		}
		else {
			System.out.print("�����Ǹ� �� �ٷ� �Է����ּ��� : ");
			Writer writer;
			// �ּ� 4: ����ó��
			try {
				writer = new FileWriter("./recipe/"+recipefile);
				Scanner scan = new Scanner(System.in);
				String recipe = scan.nextLine();
				writer.write(recipe);
				writer.flush();
				writer.close();	
			} catch (IOException e) {
				System.out.println("������ ������ϴ�.");
				openMenu();
			}

			
		}
	}
}
