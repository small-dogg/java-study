package designpattern.proxy.dating;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonInvocationHandler implements InvocationHandler {

    private Person person;

    public NonInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(person, args);
        }else if ("setHotRating".equals(method.getName())) {
            return method.invoke(person, args);
        }else if (method.getName().startsWith("set")) {
            throw new IllegalAccessException();
        }
        return null;
    }
}
