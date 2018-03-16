package charactor1;

import charactor.Hero;

public class Support extends Hero {
    void heal(Hero h, int hp) {
        System.out.println("为" + h.name + "加了" + hp + "的血");
    }
    void heal(Hero ... heros) {
        for (Hero hero : heros) {
            System.out.println(hero.name);
        }
    }

}
