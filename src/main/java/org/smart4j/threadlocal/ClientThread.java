package org.smart4j.threadlocal;

/**
 * 线程 输出名字和序号
 * Created by alvin on 2016/3/21.
 */
public class ClientThread extends Thread {
    private Sequence sequence;
    public ClientThread(Sequence sequence){
        this.sequence = sequence;
    }
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+sequence.getNumber());
        }
    }
}
