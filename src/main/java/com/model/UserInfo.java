package com.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "UserInfo", schema = "javadb")
public class UserInfo implements Serializable {

    private String UserId;
    private String UserName;
    private int Age;
    private Date UpdateTime;

    public UserInfo() {

    }

    public UserInfo(String userId, String userName, int age, Date updateTime) {
        this.UserId = userId;
        this.UserName = userName;
        this.Age = age;
        this.UpdateTime = updateTime;
    }

    @Id
    @Column(name = "UserId", unique = true, nullable = false, length = 20)
    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    @Column(name = "UserName", nullable = false, length = 50)
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @Column(name = "Age", nullable = false, length = 4)
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UpdateTime", length = 7)
    public Date getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Date updateTime) {
        UpdateTime = updateTime;
    }
}
