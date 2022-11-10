public class Main {
  public static void main(String[] args) {
    Bank nuBank = new Bank("nuBank");

    Client victor = new Client("Victor", "Barros", "488.343.118-50");

    Account checking = new CheckingAccount(victor);
    nuBank.addAccount(checking);
    checking.deposit(100);

    Account saving = new SavingsAccount(victor);
    nuBank.addAccount(saving);
    
    checking.transfer(50, saving);

    // checking.printExtract();
    // saving.printExtract();

    nuBank.listAccountsInfos(nuBank.getAccounts());
  }
}
