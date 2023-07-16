
public class App {
	
	public static void main(String[] args) {
        Deck deck = new Deck();
                                
        Player player1 = new Player(deck.getCards(), 0, "Adam");
        Player player2 = new Player(deck.getCards(), 0, "Eve");
        deck.shuffle();
        
        for (int i = 0; i < 52; i++) {
    		if (i % 2 == 0) {
    			player1.draw(deck);
    		} else {
    			player2.draw(deck);
    		}
      
        } 
        Card p1FlippedCard = null;
        Card p2FlippedCard = null;
        
        for (int i = 0; i < 26; i++) {
        	p1FlippedCard = player1.flipCard();
        	p2FlippedCard = player2.flipCard();
        }
        
        if (p1FlippedCard == null || p2FlippedCard == null) {
			System.out.println("No cards to flip.");
		} else {
			if (p1FlippedCard.value > p2FlippedCard.value) {
				player1.incrementScore();
			} else {
				player2.incrementScore();
			}
		}
        
        int score1 = player1.score;
        int score2 = player2.score;

        if (score1 > score2) {
            System.out.println("Adam wins the game with a higher score.");
        } else if (score1 < score2) {
            System.out.println("Eve wins the game with a higher score.");
        } else {
            System.out.println("It's a tie. Both players have the same score.");
        
            System.out.println("Final Score:");
            System.out.println("Player 1: " + score1);
            System.out.println("Player 2: " + score2);

            if (score1 > score2) {
                System.out.println("Player 1 wins!");
            } else if (score1 < score2) {
                System.out.println("Player 2 wins!");
            } else {
                System.out.println("It's a draw!");
            }
        } 
     }
}

