import java.util.ArrayList;
import java.util.List;

public class Bank {
    
    private String name;
    private List<Account> accounts = new ArrayList<Account>();

    public Bank(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
    
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void listAccountsInfos(List<Account> accounts) {
        for (int i = 0; i < accounts.size(); ++i) {
            accounts.get(i).printAccountInfos();
        }
    }
}
