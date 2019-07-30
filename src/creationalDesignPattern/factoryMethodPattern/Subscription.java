package creationalDesignPattern.factoryMethodPattern;

import utility.Pair;

abstract class Subscription {
    protected double rate;

    abstract Pair<Double, String> getSubscriptionInfo();

    void printFee(int days) {
        System.out.println(days * rate);
    }
}
