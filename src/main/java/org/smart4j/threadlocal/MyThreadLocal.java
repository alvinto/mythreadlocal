package org.smart4j.threadlocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alvin on 2016/3/21.
 */
public class MyThreadLocal<T> {
    private Map<Thread,T> container = Collections.synchronizedMap(new HashMap<Thread, T>());

    public T get(){
        Thread thread = Thread.currentThread();
        T value = container.get(thread);
        if(value == null || !container.containsKey(thread)){
            value = initialValue();
            container.put(thread,value);
        }
        return value;
    }

    public T initialValue() {
        return null;
    }

    public void set(T value){
        container.put(Thread.currentThread(), value);
    }

    public void remove(){
        container.remove(Thread.currentThread());
    }
}
