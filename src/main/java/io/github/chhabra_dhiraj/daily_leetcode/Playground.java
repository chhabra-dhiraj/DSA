package io.github.chhabra_dhiraj.daily_leetcode;


import kotlin.jvm.functions.Function1;

import static io.github.chhabra_dhiraj.daily_leetcode.Kotlin_PlaygroundKt.isValidIdentifier;

public class Playground {

    public int getFoo() {
        return 1;
    }

    protected int getFoo1() {
        return 1;
    }

//    public int setFoo(int value) {
//    }

    public static void main(String[] args) {

        int num = 2;
        for (int i = 0; i < 29; i++) {
            num *= 2;
        }

        num = num - 1 + num;
        System.out.println(num);
        String s = "fdfdsa";
        System.out.println(s.getClass());
        Function1<R, Boolean> uF = R::getSquare;
        Function1<R, Integer> uP = R::getA;

        isValidIdentifier("", uP);
    }

}

