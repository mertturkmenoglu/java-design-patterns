package creationalDesignPattern.factoryMethodPattern;

import utility.Pair;

class AnnualSubscription extends Subscription {
    AnnualSubscription() {
        rate = 10;
    }

    @Override
    Pair<Double, String> getSubscriptionInfo() {
        return new Pair<>(rate, "Annual");
    }

    @Override
    void printFee(int days) {
        super.printFee(days);
    }
}
