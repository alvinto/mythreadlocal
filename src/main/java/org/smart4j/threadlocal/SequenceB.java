package org.smart4j.threadlocal;

/**
 * Created by alvin on 2016/3/21.
 */
public class SequenceB implements Sequence{
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public int getNumber(){
        threadLocal.set(threadLocal.get()+1);
        return threadLocal.get();
    }
}
