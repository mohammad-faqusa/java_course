## 80. Classes Challenge: Building a Bank Account

### Chellenge 
Account : 
* number
* balance
* name
* email
* phone number
* getters / setters 
* tradition methdo 

in Main calss 
* create an object of account 

Account 
```java
public class Account {

    private int number ;
    private int balance;
    private String name;
    private String email;
    private String phone_number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}

```

**called in Main** 
```jshelllanguage
Account account = new Account();
account.setBalance(2000);
account.setNumber(1234);
account.setEmail("mohammad@g.com");
account.setPhone_number("123456789");

System.out.println(account);
```