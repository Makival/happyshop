package com.makival.shop.domain.bean;

import com.makival.shop.domain.enumeration.UserRole;

import java.util.Objects;

/**
 * @author Kiryl Karatkevich
 * @since February 12, 2019
 */
public class User extends Bean {

    private String name;
    private String password;
    private UserRole role;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                role == user.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, password, role);
    }
}
