import java.util.Random;
import java.util.Scanner;

public class rock_scissor_paper {

	public static void main(String[] args) {
		
		int mt = 555;
		Random random = new Random();
		int go = 999;
	while(go > 1) {
		System.out.println("������������ �غ��ô�. ����~ ����~");
		
		Scanner sc = new Scanner(System.in);
		var Str = sc.nextLine();
		
		int go2 = 999;
		
		switch(Str) {

		case "����" :
			mt = 0;
			break;
			
		case "����" :
			mt = 1;
			break;
		case "��" :
			mt = 2;
			break;
			
		case "����" :
			go2 = 0;
			mt = 999;
			
		default :
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
			
		
		String[] game= new String[3];
		game[0] = "����";
		game[1] = "����";
		game[2] = "��";
		
		var yt = random.nextInt(3);
		
		if(Math.abs(yt-mt) <1){
			System.out.printf("���� %s�� �½��ϴ�. �����ϴ�.\n",game[yt]);
		}
		else if (0 < yt-mt && yt-mt <= 1) {
			System.out.printf("���� %s�� �½��ϴ�. ����� �����ϴ�.\n", game[yt]);
		}
		else if (1 < yt-mt && yt-mt <= 2) {
			System.out.printf("���� %s�� �½��ϴ�. ����� �̰���ϴ�.\n", game[yt]);
		}
		else if (-1 <= yt-mt && yt-mt < 0) {
			System.out.printf("���� %s�� �½��ϴ�. ����� �̰���ϴ�.\n", game[yt]);
		}
		else if (-2 <= yt-mt && yt-mt < -1) {
			System.out.printf("���� %s�� �½��ϴ�. ����� �����ϴ�.\n", game[yt]);
		}
		else {
				System.out.println(" ���������� ������ �����մϴ�.\n");
			}

go = go2;
	}
	}

}