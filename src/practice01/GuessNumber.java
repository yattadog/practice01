package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {

		// 랜덤 초기화(생성)
		Random random = new Random();

		// Scanner 생성( 표준입력 )
		Scanner scanner = new Scanner(System.in);

		// 전체 게임은 무한루프
		boolean exitGame = false;
		do {
			// 랜덤 수 생성(1 ~ 100)
			int numberRandom = random.nextInt(100) + 1;
			System.out.println( "수를 결정하였습니다. 맞추어 보세요." );

			// 범위(최소값) 초기화
			int min = 1;
			// 범위(최대값) 초기화
			int max = 100;
			// 맞추기 회 수 초기화
			int count = 0;
			
			// 맞추기 시작
			while (true) {
				// 범위 출력
				System.out.println(min + "-" + max);
				// 회 수 출력
				System.out.print(++count);
				// 입력 프롬프트
				System.out.print(">>");

				// 입력 대기
				int numberGuess = scanner.nextInt();

				// 결과
				if (numberGuess == numberRandom) {
					System.out.println("맞았습니다.");
					break;
				}

				// 틀린 경우
				if (numberGuess > numberRandom) {
					max = numberGuess;
					System.out.println("더 낮게");
				} else {
					min = numberGuess;
					System.out.println("더 높게");
				}

			}
		
			// 게임 한번 더?
			String answer;
			do {
				System.out.print( "다시 하시겠습니까(y/n)>>" );
				answer = scanner.next();
				if( answer.equals( "n" ) == true ){  // 안하겠다면...
					exitGame = true;
					break;
				}
			} while( answer.equals( "y" ) == false );
			
		} while( exitGame == false );
		
		// 자원 정리
		scanner.close();
	}
}