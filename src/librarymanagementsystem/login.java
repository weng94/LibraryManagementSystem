package librarymanagementsystem;

import java.util.Objects;
/**
 *
 * @author cindy
 */
public final class login{
    private String Account="NoAccount";
    private String Password="NoPassword";
    private String Name="NoName";
    public login(String Account,String Password,String Name){
        setAccount(Account);
        setPassword(Password);
        setName(Name);
    }
    public login(String Account,String Password){
        setAccount(Account);
        setPassword(Password);
    }
    public void setAccount(String account){
        Account=account;
    }
    public void setPassword(String password){
        Password=password;
    }
    public void setName(String name){
        Name=name;
    }
    @Override
    public String toString(){
        return "Account: "+Account+" Password: "+Password+" Name: "+Name;
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof login)){
            return false;
        }
        else{
            login obj=(login) o;
            return Account.equals(obj.Account)&&Password.equals(obj.Password);
        }
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.Account);
        hash = 79 * hash + Objects.hashCode(this.Password);
        return hash;
    }
}