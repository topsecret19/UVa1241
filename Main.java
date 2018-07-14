import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tests = sc.nextInt();
	for(int i=0; i<tests; i++) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int numberOfPlayers = (int) Math.pow(2,N);
		boolean [] players= new boolean[numberOfPlayers];
		for(int j=0; j<M; j++) {
			int player= sc.nextInt();
			players[player-1]=true;
		}
		boolean latest=false;
		int count=0;
		boolean result;
		for(int k=0; k<numberOfPlayers; k+=2) {
			if(players[k]==players[k+1]&&!(players[k]&players[k+1])) {
				result=true;
			}else {
				result = players[k]^players[k+1];
				if(result) {
					count++;
				}
			}
			if(k>1&&latest^result) {
				count++;
			}
			latest=result;
			
		}
		System.out.println(count);
		count=0;
		latest=false;
	}
}
}
