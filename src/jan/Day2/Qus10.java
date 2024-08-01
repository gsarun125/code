package jan.Day2;

/**
 * 10. calculate Maximum number of chocolates can eat and Number of wrappers left in
 * hand.
 * Money: Total money one has to spend.
 * Price: price per chocolate.
 * wrappers: minimum number of wrappers for exchange choco: number of chocolate for
 * wrappers.
 * Max visit: Maximum number of times one can visit the shop.(if zero consider it infinite)
 * example: input: Money:40 Price:1 wrappers:3 choco:1 Max visit:1
 * Output: total chocolate can eat: 53 wrappers left in hand:14
 */

public class Qus10 {
    public static void main(String[] args) {
        int money = 40;
        int price = 1;
        int wrappers = 3;
        int choco = 1;
        int maxVisit = 1;

        findTotalChocolateAndWrappers(money, price, wrappers, choco, maxVisit);
    }

    private static void findTotalChocolateAndWrappers(int money, int price, int wrappers, int choco, int maxVisit) {
        int totalChocolate = money / price;
        int wrappersLeft = totalChocolate;

        while (wrappersLeft >= wrappers && maxVisit > 0) {
            int exchangedChocolates = wrappersLeft / wrappers;
            totalChocolate += exchangedChocolates;
            wrappersLeft = exchangedChocolates + (wrappersLeft % wrappers);
            maxVisit--;
        }

        System.out.println("Total chocolate can be eaten: " + totalChocolate);
        System.out.println("Wrappers left in hand: " + wrappersLeft);
    }
}

