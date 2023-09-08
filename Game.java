import java.util.Scanner;

public class Game {

    public void play() {
        System.out.println("==========BlackJack==========");
        Scanner sc = new Scanner(System.in);

        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();

        initPhase(cardDeck, gamer);
        playingPhase(sc, cardDeck, gamer);
        // System.out.println(cardDeck.toString());
    }    

    private void playingPhase (Scanner sc, CardDeck cardDeck, Gamer gamer) {
        String gamerInput, dealerInput;
        boolean isGamerTurn, isDealerTurn = false;
                // isDealerTurn = false;

        while (true) {
            System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요");
            gamerInput = sc.nextLine();

            if("0".equals(gamerInput)) {
                isGamerTurn = true;
            } else {
                Card card = cardDeck.draw();
                gamer.receiveCard(card);
            }

             System.out.println("카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요");
             dealerInput = sc.nextLine();

              if("0".equals(dealerInput)) {
                isDealerTurn = true;
            } else {
                Card card = cardDeck.draw();
                dealer.receiveCard(card);


        }
    }

    private static final int INIT_RECEIVE_CARD_COUNT = 2;

    private void initPhase(CardDeck cardDeck, Gamer gamer) {
        System.out.println("처음 2장의 카드를 각자 뽑겠습니다!@");

        for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
            Card card = cardDeck.draw();
            gamer.receiveCard(card);
        }
    }

}