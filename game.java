//Guesser Game Project
import java.util.Scanner;

class Guesser {
    int num;

    int GuessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gesser!! Kindly Enter Your Number:");
        num = scan.nextInt();
        return num;
    }
}

class Player {
    int numFromPlayer;

    int GuessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player!! Enter Your Number: ");
        numFromPlayer = scan.nextInt();
        return numFromPlayer;
    }

}

class Umpire {
    int numFromGesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void CollectFromGuesser() {

        Guesser n1 = new Guesser();
        numFromGesser = n1.GuessingNumber();
    }

    void CollectFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.GuessingNumber();
        numFromPlayer2 = p2.GuessingNumber();
        numFromPlayer3 = p3.GuessingNumber();

    }

    void Compare() {

        if (numFromGesser == numFromPlayer1) {
            if (numFromGesser == numFromPlayer2 && numFromGesser == numFromPlayer3) {
                System.out.println("Everyone won the match!!");
            } else if (numFromGesser == numFromPlayer2) {
                System.out.println("Player 1 and Player 2won the match!!");
            } else if (numFromGesser == numFromPlayer3) {
                System.out.println("Player 1 and Player 3 won the match!!");
            } else {
                System.out.println("Player 1 won the game");
            }

        } else if (numFromGesser == numFromPlayer2) {
            if (numFromGesser == numFromPlayer3) {
                System.out.println("Player 2 and Player 3 won the match!!");
            } else {
                System.out.println("Player 2 won the game");
            }

        } else if (numFromGesser == numFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("Everyone lose the game!! please try again.");
        }

    }

}

public class game {
    public static void main(String[] args) {
        System.out.println("Game Started");

        Umpire u = new Umpire();
        u.CollectFromGuesser();
        u.CollectFromPlayer();
        u.Compare();

    }
}
