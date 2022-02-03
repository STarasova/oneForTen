public class Main {
    public static void main(String[] args) {
        var initialBalance = 99;
        var replenishmentAmount = 1600;
        if (replenishmentAmount <= 1000) {
            int replenishedBalance = initialBalance + replenishmentAmount;
            System.out.println("Сумма на Вашем счету " + replenishedBalance + ". Бонусы не начислены.");
        } else {
            int bonus = replenishmentAmount / 100;
            int replenishedBalanceWithBonus = initialBalance + replenishmentAmount + bonus;
            System.out.println("Вам начисленно " + bonus + " бонусов. Сумма на Вашем счету " + replenishedBalanceWithBonus + ".");

        }

    }
}
