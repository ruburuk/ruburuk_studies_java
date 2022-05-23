import java.util.Random;
import java.util.Scanner;

public class rock_scissor_paper {

	public static void main(String[] args) {
		
		int mt = 555;
		Random random = new Random();
		int go = 999;
	while(go > 1) {
		System.out.println("가위바위보를 해봅시다. 가위~ 바위~(\"종료를 입력하면 게임이 종료됩니다\")");
		
		Scanner sc = new Scanner(System.in);
		var Str = sc.nextLine();
		
		int go2 = 999;
		
		switch(Str) {

		case "가위" :
			mt = 0;
			break;
			
		case "바위" :
			mt = 1;
			break;
		case "보" :
			mt = 2;
			break;
			
		case "종료" :
			go2 = 0;
			mt = 999;
			System.out.println("가위바위보 게임을 종료합니다.\n");
			break;
			
		default :
			System.out.println("다시 입력하세요");
			mt = 555;
		}
		
			
		
		String[] game= new String[3];
		game[0] = "가위";
		game[1] = "바위";
		game[2] = "보";
		
		var yt = random.nextInt(3);
		
		if(Math.abs(yt-mt) <1){
			System.out.printf("상대는 %s를 냈습니다. 비겼습니다.\n",game[yt]);
		}
		else if (0 < yt-mt && yt-mt <= 1) {
			System.out.printf("상대는 %s를 냈습니다. 당신은 졌습니다.\n", game[yt]);
		}
		else if (1 < yt-mt && yt-mt <= 2) {
			System.out.printf("상대는 %s를 냈습니다. 당신은 이겼습니다.\n", game[yt]);
		}
		else if (-1 <= yt-mt && yt-mt < 0) {
			System.out.printf("상대는 %s를 냈습니다. 당신은 이겼습니다.\n", game[yt]);
		}
		else if (-2 <= yt-mt && yt-mt < -1) {
			System.out.printf("상대는 %s를 냈습니다. 당신은 졌습니다.\n", game[yt]);
		}
go = go2;
	}
	}

}