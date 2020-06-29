public class Main {
    public static void main(String[] args) {
        int clientBalance = 2_000_000_000;
        int transaction = 500_000_000;
        int totalBalance = clientBalance + transaction;

        System.out.println("Баланс клиента: " + totalBalance + " рублей.");
    }
}
