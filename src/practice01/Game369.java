package practice01;

public class Game369 {

	public static void main(String[] args) {
		
		for( int i = 1; i <= 100; i++ ) {
			
			// int ->  String 변환
			String number = String.valueOf( i );
			
			// '짝' 수 세기
			int length = number.length();
			int count = 0;
			for( int j = 0; j < length; j++ ){
				char c = number.charAt( j ); 
				if( c == '3' || c == '6' || c == '9' ) {
					count++;
				}
			}
			
			// 결과출력
			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " ");
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );
		}
	}
}
