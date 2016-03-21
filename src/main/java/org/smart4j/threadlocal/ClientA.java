package org.smart4j.threadlocal;

/**
 * Created by alvin on 2016/3/21.
 */
public class ClientA {
    public static void main(String[] args) {
        Sequence sequence = new SequenceA();
        for(int i=0;i<3;i++){
            ClientThread clientThread = new ClientThread(sequence);
            clientThread.start();
        }
    }
}
