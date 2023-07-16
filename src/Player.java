import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	Player(List<Card> hand, int score, String name){
		this.hand = hand;
		this.score = 0;
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Player: " + name);
		((Card) hand).describe();
		System.out.println("score: " + score);
	}
		

	
	public Card flipCard(){
		if(!hand.isEmpty()) {
			return hand.remove(0);
		}else {
			return null;
		}
		
	}
	
	public Card draw(Deck deck) {
		Card drawnCard = deck.draw();
		if(drawnCard != null) {
			hand.add(drawnCard);
		}else {
			System.out.println("No more cards left.");
		}
		return drawnCard;
	}
	
	public void incrementScore() {
		score++;
	}

}
