public class TestAccount {
    public static void main(String[] args) {
        // create 2 accounts 
        Account acc1 = new Account("123", "John Doe", 4000);
        Account acc2 = new Account("567", "Jane Smith", 5000);

        // print initial account balances
        System.out.println("Initial Balance for Account 1: " + acc1.getBalance());
        System.out.println("Initial Balance for Account 2: " + acc2.getBalance());

        // transfer $1000 from account 1 to account 2
        System.out.println("\nTransferring $1000...");
        acc1.transferTo(acc2, 1000);

        // print final balances after transfer
        System.out.println("Initial Balance for Account 1: " + acc1.getBalance());
        System.out.println("Initial Balance for Account 2: " + acc2.getBalance());
    }
}
