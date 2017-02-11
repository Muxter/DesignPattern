package com.muxter.ProxyPattern.dynamic;

/**
 * Created by matao on 10/02/2017.
 */
public class PersonBeanImpl implements PersonBean {

    private String name;
    private String gender;
    private int rating;
    private int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ++ratingCount;
    }
}
