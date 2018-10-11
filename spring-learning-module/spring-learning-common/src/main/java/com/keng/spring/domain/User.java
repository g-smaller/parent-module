package com.keng.spring.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private Integer id;
    private String username;
    private String nickname;
    private String avatar;
    private String cellphone;
    private Date firstLoginTime;
    private String firstLoginIp;
    private Date lastLoginTime;
    private String lastLoginIp;

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public User setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public User setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getCellphone() {
        return cellphone;
    }

    public User setCellphone(String cellphone) {
        this.cellphone = cellphone;
        return this;
    }

    public Date getFirstLoginTime() {
        return firstLoginTime;
    }

    public User setFirstLoginTime(Date firstLoginTime) {
        this.firstLoginTime = firstLoginTime;
        return this;
    }

    public String getFirstLoginIp() {
        return firstLoginIp;
    }

    public User setFirstLoginIp(String firstLoginIp) {
        this.firstLoginIp = firstLoginIp;
        return this;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public User setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public User setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
        return this;
    }
}
