package org.smart4j.threadlocal;

/**
 * Created by alvin on 2016/3/21.
 */
public class SequenceA implements Sequence {

    private static int number;
    @Override
    public int getNumber() {
        number = number+1;
        return number;
    }
}
