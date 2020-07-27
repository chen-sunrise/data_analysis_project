package com.lagou.housework;

public class InterMealTest {
    public static void main(String[] args) {
        InterMeal im = new InterMeal();
        im.show();
        im.internetMeal(134,CardType.valueOf("SMALL"));
    }
}
