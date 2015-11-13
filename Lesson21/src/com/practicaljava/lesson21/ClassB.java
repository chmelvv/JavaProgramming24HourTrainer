public class ClassB extends Thread {
    ClassA parent = null;

    ClassB(ClassA caller){
        parent = caller;
    }

    @Override
    public void run() {
        parent.setData("Economy is recovering ...");

        synchronized(parent) {
            System.out.println("Begin notify");
            parent.notify();
            System.out.println("End notify");
        }
    }
}
