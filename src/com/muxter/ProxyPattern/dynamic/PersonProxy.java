package com.muxter.ProxyPattern.dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by matao on 10/02/2017.
 */
public class PersonProxy {
    public PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }
}
