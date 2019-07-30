package creationalDesignPattern.factoryMethodPattern;

class GetSubscriptionFactory {
    Subscription getSubscription(String subscriptionType) {
        if (subscriptionType == null) {
            return null;
        }

        if (subscriptionType.equalsIgnoreCase("WEEKLY")) {
            return new WeeklySubscription();
        } else if (subscriptionType.equalsIgnoreCase("MONTHLY")) {
            return new MonthlySubscription();
        } else if (subscriptionType.equalsIgnoreCase("ANNUAL")) {
            return new AnnualSubscription();
        }

        return null;
    }
}
