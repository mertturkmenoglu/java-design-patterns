package creationalDesignPattern.factoryMethodPattern;

import utility.Pair;

class MonthlySubscription extends Subscription {
    MonthlySubscription() {
        rate = 5;
    }

    @Override
    Pair<Double, String> getSubscriptionInfo() {
        return new Pair<>(rate, "Monthly");
    }

    @Override
    void printFee(int days) {
        super.printFee(days);
    }
}
