public abstract class Account implements IAccount {

  private static final int DEFAULT_AGENCY = 1;
  private static int SEQUENTIAL = 1;

  protected int agency;
  protected int account;
  protected double balance;
  protected Client client;

  public Account(Client client) {
    this.agency = DEFAULT_AGENCY;
    this.account = SEQUENTIAL++;
    this.client = client;
  }

  @Override
  public void withdraw(double value) {
    this.balance -= value;
  }

  @Override
  public void deposit(double value) {
    this.balance += value;
  }

  @Override
  public void transfer(double value, Account destinationAccount) {
    this.withdraw(value);
    destinationAccount.deposit(value);
  }

  public int getAgency() {
    return agency;
  }

  public int getAccount() {
    return account;
  }

  public double getBalance() {
    return balance;
  }

  protected void printAccountInfos() {
    System.out.println(String.format("Titular: %s", this.client.getName()));
    System.out.println(String.format("Agencia: %d", this.agency));
    System.out.println(String.format("Conta: %d", this.account));
    System.out.println(String.format("Saldo: %.2f", this.balance));
  }

}
