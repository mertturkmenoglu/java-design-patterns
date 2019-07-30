package creationalDesignPattern.factoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        GetSubscriptionFactory subscriptionFactory = new GetSubscriptionFactory();

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Type of the subscription: ");
        String subscriptionType = bufferedReader.readLine();

        System.out.print("Days: ");
        int days = Integer.parseInt(bufferedReader.readLine());

        Subscription subscription = subscriptionFactory.getSubscription(subscriptionType);

        System.out.println(subscription.getSubscriptionInfo());
        subscription.printFee(days);
    }
}
