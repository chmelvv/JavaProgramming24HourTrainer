public class ClassB extends Thread {
    Updatable parent;

    ClassB(Updatable caller){
        this.parent = caller;
    }

    @Override
    public void run() {
        this.parent.setData("Economy is recovering ...");

        synchronized(parent) {
            System.out.println("Begin notify");
            parent.notify();
            System.out.println("End notify");
        }
    }
}
