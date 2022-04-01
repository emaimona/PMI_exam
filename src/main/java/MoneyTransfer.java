public class MoneyTransfer extends  Bank{

    public void openNewAccount(String accountNumber, int amount) {
        String[] info = {accountNumber, amount+""};
        account.add(info);
    }

    public void transfer(String accountNumber, int amount) {
        int index = getIndex(accountNumber);

        if (index != -1) {
            int add = Integer.parseInt(account.get(index)[1]);
            add += amount;
            String[] info = {accountNumber, add+""};
            account.set(index, info);
        }
    }

    public String getBalances() {
        String s = "";

        for (int i=0; i<account.size(); i++) {
            if (i+1 != account.size())
                s += account.get(i)[0] + " " + account.get(i)[1]+"\r\n";
            else
                s += account.get(i)[0] + " " + account.get(i)[1];
        }

        return s;
    }
}
