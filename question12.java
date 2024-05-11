public class question12 {
    static void calculateChocolates(int money, int price, int wrappers, int choco, int maxVisit) {
        
        int chocolates = money / price;
        int wrappersLeft = chocolates;

        
        for (int visit = 1; visit <= maxVisit || maxVisit == 0; visit++) {
            
            int exchangeChocolates = wrappersLeft / wrappers;
            if (exchangeChocolates == 0) {
                
                break;
            }

            
            chocolates += exchangeChocolates;
            wrappersLeft = exchangeChocolates + (wrappersLeft % wrappers);
        }

        System.out.println("Total chocolates can eat: " + chocolates);
        System.out.println("Wrappers left in hand: " + wrappersLeft);
    }

    public static void main(String[] args) {
        int money = 40;
        int price = 1;
        int wrappers = 3;
        int choco = 1;
        int maxVisit = 1;

        calculateChocolates(money, price, wrappers, choco, maxVisit);
    }
}
