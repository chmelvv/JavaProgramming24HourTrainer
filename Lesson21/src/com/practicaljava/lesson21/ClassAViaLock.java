import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ClassAViaLock {
    String marketNews = null;
    Lock aLock = new ReentrantLock();
    Condition condition = aLock.newCondition();

    void someMethod() {
        System.out.println("In some method");
        Thread thread = new Thread(new ClassBViaLock(this, aLock, condition), "some string");
        thread.start();

        aLock.lock();
            try {
                System.out.println("Begin wait");
                condition.await();
                System.out.println("End wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                aLock.unlock();
            }


        System.out.println("Out some method");
    }

    public void setData(String news){
        marketNews = news;
    }

}


