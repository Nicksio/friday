package org.nick.model;

import org.nick.model.attackcards.*;
import org.nick.model.dangercards.Danger;
import org.nick.model.oldcards.*;
import org.nick.model.pirates.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Board {
    private static int step; //Уровень опастности
    private static ArrayList<OldCard> oldCardsDeck; //Колода с картами старости
    private static ArrayList<AttackCard> attackDeck; //Колода с картами боя
    private static ArrayList<Danger> dangerCardsDeck; //Колода с картами опасности
    private static ArrayList<Pirate> pirates; //Пираты - главари

    private static ArrayList<AttackCard> freeCards; //
    private static ArrayList<AttackCard> additionalCards; //
    private static Danger currentDanger; //

    private static int lifePints; //Очки жизни

    private static void beginGame() {
        oldCardsDeck = new ArrayList<>()
        {{
            add(new Tired());
            add(new Silly());
            add(new Silly());
            add(new Hungry());
            add(new OldDispelled());
            add(new VeryStupid());
            add(new Scared());
            add(new Scared());
        }};
        Collections.shuffle(oldCardsDeck);
        ArrayList<OldCard> veryOldCard = new ArrayList<>()
        {{
            add(new Idiot());
            add(new VeryHungry());
            add(new Suicidal());
        }};
        Collections.shuffle(veryOldCard);
        oldCardsDeck.addAll(veryOldCard);

        attackDeck = new ArrayList<>()
        {{
            add(new Full());
            add(new Genius());
            for (int i = 0; i < 8; i++) {
                add(new Normal());
            }
            for (int i = 0; i < 5; i++) {
                add(new Dispelled());
            }
            for (int i = 0; i < 3; i++) {
                add(new Concentrated());
            }
        }};
        Collections.shuffle(attackDeck);

        dangerCardsDeck = new ArrayList<>(0);

        step = 0;

        ArrayList<Pirate> allPirates = new ArrayList<>()
        {{
            add(new Pirate1());
            add(new Pirate2());
        }};
        Collections.shuffle(allPirates);
        pirates = new ArrayList<>(2)
        {{
            add(allPirates.get(0));
            add(allPirates.get(1));
        }};
    }

    public static void beginEasyGame(){
        beginGame();
        oldCardsDeck.remove(new VeryStupid());
        lifePints = 22;
    }

    public static void beginNormalGame(){
        beginEasyGame();
        //Берем верхнюю карту из стопки карт старения и кладем в случайное место атакующей колоды
        attackDeck.add(new Random().nextInt(attackDeck.size()), (AttackCard) oldCardsDeck.remove(0));
    }

    public static void beginHardGame(){
        beginGame();
        lifePints = 22;
        //Берем верхнюю карту из стопки карт старения и кладем в случайное место атакующей колоды
        attackDeck.add(new Random().nextInt(attackDeck.size()), (AttackCard) oldCardsDeck.remove(0));
    }

    public static void beginVeryHardGame(){
        beginHardGame();
        lifePints = 20;
    }
}
