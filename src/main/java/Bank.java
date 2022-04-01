import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    ArrayList<String[]> account = new ArrayList<>();
    private int balances;

    public Bank() {
        this.balances = 0;
    }

    public void openNewAccount(String accountNumber) {
        String[] info = {accountNumber, "0"};
        account.add(info);
    }

    public void closeAccount(String accountNumber) {
        int index = getIndex(accountNumber);
        if(index != -1)
            account.remove(index);
    }

    public String getBalances() {
        String s = "";

        for (int i=0; i<account.size(); i++) {
            if (i+1 != account.size())
                s += account.get(i)[0] + " 0\r\n";
            else
                s += account.get(i)[0] + " 0";
        }

        return s;
    }

    public int getIndex(String accountNumber) {
        for (int i=0; i<account.size(); i++) {
            if (account.get(i)[0] == accountNumber)
                return i;
        }
        return -1;
    }




}
