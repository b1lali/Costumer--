public class Bank {
    private String userName;
    private int password;

    private int totalMoney;

    public Bank(String userName, int password, int totalMoney) {
        this.userName = userName;
        this.password = password;
        this.totalMoney = totalMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
    public void credit(String name, int sum){
        if(userName.equals(name)){
            System.out.println((getTotalMoney()+sum));
        }
    }

    public void  credit2(String name, int sum){
        if (userName.equals(name)){
            System.out.println(getTotalMoney()-sum);

        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
