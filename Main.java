public class Main {
    public static void main(String[] args) {
        int clientBalance = 100;
        int transactionAmount = 1001;
        int bonus = 0;
        if (transactionAmount > 1000) {bonus = transactionAmount / 100;}
        int clientResult = (clientBalance + transactionAmount + bonus);
        System.out.println(clientResult);
        System.out.println(bonus);
    }

    }