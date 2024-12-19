public record BankAccount(int numerKonta, double saldo) {
    public static BankAccount createWithNumber(int numerKonta){
        return new BankAccount(numerKonta, 0);
    }
}