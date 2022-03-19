package org.cwsya.TLBook.pojo;

public class UserPojo {
    private String userName;
    private String passWord;

    @Override
    public String toString() {
        return "UserPojo{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public UserPojo() {
    }

    public UserPojo(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
}
