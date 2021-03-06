import java.util.Random;
import java.util.Scanner;

class DiceGame {
	int diceFace;
	int userGuess;

	private void RollDice() {
		Random random = new Random();
		// diceFace = (int) (Math.random() * 6) + 1;
		diceFace = random.nextInt(6) + 1;
	}

	private void printPrompt(String prompt) {
		System.out.println(prompt);
	}

	private int getUserInput() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private boolean checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("맞았습니다.");
		return true;
		} else {
			System.out.println("틀렸습니다.");
		return false;
		}
	}

	public void startPlaying() {
		while (true) { // 반복하는 구간
			printPrompt("예상값을 입력하세요.");
			userGuess = getUserInput();
			RollDice();
			checkUserGuess();
			boolean result = checkUserGuess();
			if (result) {
				break;
			}
		}
	}
}
