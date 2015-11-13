import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ClassBViaLock implements Runnable {
    ClassAViaLock parent = null;
    Lock lock = null;
    Condition condition = null;

    ClassBViaLock(ClassAViaLock caller, Lock aLock, Condition condition){
        parent = caller;
        this.lock = aLock;
        this.condition = condition;
    }

    public void run() {
        parent.setData("Economy is recovering ...");

        lock.lock();
            System.out.println("Begin notify");
            condition.signal();
            System.out.println("End notify");
        lock.unlock();
    }
}
