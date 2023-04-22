package ru.turing.courses.lesson3.Imanov.user;

import java.util.Objects;

public class InstagramUser extends User {
    boolean accountVerified;

    public InstagramUser(String UserName, boolean accountVerified) {
        super(UserName);
        this.UserId = 1;
        this.accountVerified = accountVerified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstagramUser that = (InstagramUser) o;
        return accountVerified == that.accountVerified
                && UserId == that.UserId && Objects.equals(UserName, that.UserName);
    }
}
