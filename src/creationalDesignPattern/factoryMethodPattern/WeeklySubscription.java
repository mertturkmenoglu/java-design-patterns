package creationalDesignPattern.factoryMethodPattern;

import utility.Pair;

class WeeklySubscription extends Subscription {
    WeeklySubscription() {
        rate = 3;
    }

    @Override
    Pair<Double, String> getSubscriptionInfo() {
        return new Pair<>(rate, "Weekly");
    }

    @Override
    void printFee(int days) {
        super.printFee(days);
    }
}
