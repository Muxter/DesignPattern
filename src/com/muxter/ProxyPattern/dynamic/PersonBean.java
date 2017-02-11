package com.muxter.ProxyPattern.dynamic;

/**
 * Created by matao on 10/02/2017.
 */
public interface PersonBean {
    String getName();

    String getGender();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setHotOrNotRating(int rating);
}
