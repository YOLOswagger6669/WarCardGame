public class Card extends PlayingCard implements Comparable <Card> {
  public Card(int cardSuit, int cardRank) {
    super(cardSuit, cardRank);
  }
  public String toString() {
    String a="";
    if(getSuit()==1) {
      a+="S-";
    }
    if(getSuit()==2) {
      a+="D-";
    }
    if(getSuit()==3) {
      a+="C-";
    }
    if(getSuit()==4) {
      a+="H-";
    }
    a+=getRank();
    return a;
  }
  public int compareTo(Card otherCard) {
    return getRank()-otherCard.getRank();
  }
}
