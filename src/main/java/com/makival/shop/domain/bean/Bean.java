package com.makival.shop.domain.bean;

import java.util.Objects;

/**
 * @author Kiryl Karatkevich
 * @since February 22, 2019
 */
public abstract class Bean {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bean bean = (Bean) o;
        return id == bean.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
