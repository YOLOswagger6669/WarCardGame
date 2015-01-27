import java.util.*;
public class CardList {
  private ArrayList <Card> cards;
  private Random random=new Random();
  public CardList() {
    cards=new ArrayList<Card>();
  }
  public int size() {
    return cards.size();
  }
  public void addCardToBottom(Card n) {
    cards.add(n);
  }
  public void addCardToTop(Card n) {
    cards.add(0, n);
  }
  public Card takeCardFromTop() {
    cards.remove(0);
    Card card=cards.get(0);
    return card;
  }
  public Card removeRandomCard() {
    int randCardNum=random.nextInt(cards.size());
    cards.remove(cards.get(randCardNum));
    return cards.get(randCardNum);
  }
  public Card get(int n) {
    return cards.get(n);
  }
}
