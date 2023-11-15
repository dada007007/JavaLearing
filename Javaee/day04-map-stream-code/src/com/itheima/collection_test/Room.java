package com.itheima.collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Room {
    private List<Card> allCards = new ArrayList<>();

    public Room() {
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"♥", "♠", "♦", "♣"};
        int size = 0;
        for (String s : number) {
            size++;
            for (String s1 : color) {
                Card card = new Card(s, s1, size);
                allCards.add(card);
            }
        }

        Card card1 = new Card("", "🃏", ++size);
        Card card2 = new Card("", "🤡", ++size);
        Collections.addAll(allCards, card1, card2);
        System.out.println(allCards);
    }

    public void start() {
        Collections.shuffle(allCards);
        System.out.println(allCards);
        List<Card> linghuchong = new ArrayList<>();
        List<Card> jiumozhi = new ArrayList<>();
        List<Card> renyingying = new ArrayList<>();
        for (int i = 0; i < allCards.size() - 3; i++) {
            if (i % 3 == 0) {
                linghuchong.add(allCards.get(i));
            } else if (i % 3 == 1) {
                jiumozhi.add(allCards.get(i));
            } else {
                renyingying.add(allCards.get(i));
            }
        }
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());
        jiumozhi.addAll(lastThreeCards);
        renyingying.sort((o1, o2) -> o2.getSize() - o1.getSize());
        linghuchong.sort((o1, o2) -> o2.getSize() - o1.getSize());
        jiumozhi.sort((o1, o2) -> o2.getSize() - o1.getSize());
        System.out.println(linghuchong);
        System.out.println(jiumozhi);
        System.out.println(renyingying);

    }
}
