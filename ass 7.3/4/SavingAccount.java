class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(int accountNumber, String accountHolder, double interestRate) {
        super(accountNumber, accountHolder);
        this.interestRate = interestRate;
    }

    @Override
    public void getAccountInfo() {
        super.getAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
