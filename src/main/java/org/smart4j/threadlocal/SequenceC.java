package org.smart4j.threadlocal;

/**
 * Created by alvin on 2016/3/21.
 */
public class SequenceC implements Sequence{
    private static MyThreadLocal<Integer> myThreadLocal = new MyThreadLocal<Integer>(){
        @Override
        public Integer initialValue() {
            return 0;
        }
    };

    public int getNumber(){
        myThreadLocal.set(myThreadLocal.get()+1);
        return myThreadLocal.get();
    }
}
