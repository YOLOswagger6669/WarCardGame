public class War  {
 public static void main(String[] args) {
  CardDeck deck=new CardDeck();
  CardList handA=new CardList();
  CardList handB=new CardList();
  CardList stackA=new CardList();
  CardList stackB=new CardList();
  for(int i=0; i<26; i++) {
    handA.addCardToTop(deck.takeCardFromTop());
    handB.addCardToTop(deck.takeCardFromTop());
  }
  System.out.println("A --- Player --- B");
  int round=1;
  while(handA.size()>0 && handB.size()>0) { //wIlD LooP
    if(handA.size()<2) {
      System.out.println("Player A can't wage war");
      for(int i=0; i<stackB.size(); i=0) {
        handB.addCardToTop(stackA.takeCardFromTop());
        handB.addCardToTop(stackB.takeCardFromTop());
      }
      if(handA.size()>0) {
        handB.addCardToTop(handA.takeCardFromTop());
      }
    }
    else if(handB.size()<2) {
      System.out.println("Player B can't wage war");
      System.out.println(handB.size());
      for(int i=0; i<stackB.size(); i=0) {
        handA.addCardToTop(stackB.takeCardFromTop());
        handA.addCardToTop(stackA.takeCardFromTop());
      }
      if(handB.size()>0) {
        handA.addCardToTop(handB.takeCardFromTop());
      }
    }
    else if(stackB.size()==0 || stackA.get(0).compareTo(stackB.get(0))>0) {
      for(int i=0; i<stackB.size(); i++) {
        handA.addCardToTop(stackA.takeCardFromTop());
        handA.addCardToTop(stackB.takeCardFromTop());
      }
    }
    else {
      System.out.println("-----War!-----");
      stackA.addCardToTop(handA.takeCardFromTop());
      stackA.addCardToTop(handA.takeCardFromTop());
      stackB.addCardToTop(handB.takeCardFromTop());
      stackB.addCardToTop(handB.takeCardFromTop());
      System.out.println("   "+stackA.get(0).toString()+":"+stackB.get(0).toString()+"   ");
      for(int i=0; i<stackA.size(); i++) {
        handB.addCardToTop(stackB.takeCardFromTop());
        handA.addCardToTop(stackA.takeCardFromTop());
      }
    }
    round++;
  }
  if(handA.size()!=0) {
    System.out.println("--GAME OVER!--");
    System.out.println("Player A wins. Player B owes S.A. $320.");
    }
  else {
    System.out.println("--GAME OVER!--");
    System.out.println("Player B wins. Player A owes S.A. $320.");
  }
 }
}
