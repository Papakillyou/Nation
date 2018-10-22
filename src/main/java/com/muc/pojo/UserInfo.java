package com.muc.pojo;

public class UserInfo {
    private Integer UserID;
    private String UserName;
    private String PassWord;

    public UserInfo(Integer UserID,String UserName,String PassWord)
    {
        super();
        this.UserID=UserID;
        this.UserName=UserName;
        this.PassWord=PassWord;
    }

    public UserInfo()
    {
        super();
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer UserID) {
        this.UserID = UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName == null ? null : UserName.trim();
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord == null ? null : PassWord.trim();
    }
}
