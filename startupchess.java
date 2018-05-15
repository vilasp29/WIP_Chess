import java.util.Scanner;

public class startupchess {
	int player;
	public void getPlayer() {
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Player: ");
		try {
			player = reader.nextInt(); // Scans the next token of the input as an int.
		}
		catch (InputMismatchException e) {
			System.out.println("Enter either 1 or 2 please or your will get: " + e);
		}
		//once finished
		reader.close();
	}

	public void com_or_play() {
		board b = new board();
		if (player == 1) {System.out.println("Board Code");b.colorBoard();b.printBoard();System.out.println("Your Turn"); }
		if (player == 2) {System.out.println("Board Code");b.colorBoard();b.printBoard();System.out.println("Computers Turn");}
			
	}

	public static void main(String[] args) {
		startupchess s = new startupchess();

		s.getPlayer();
		s.com_or_play();
	}
}
