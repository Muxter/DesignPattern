package com.muxter.SingletonPattern;

/**
 * Created by matao on 13/02/2017.
 *
 * 枚举实现单例
 */
public enum  SingletonEnum {
    INSTANCE;

    public void doSth() {
        System.out.println("do sth");
    }
}
