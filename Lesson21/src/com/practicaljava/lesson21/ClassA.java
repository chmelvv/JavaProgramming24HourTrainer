public class ClassA {
    String marketNews = null;

    void someMethod() {
        System.out.println("In some method");

        Thread myB = new Thread(new ClassB(this), "To B class");
        myB.start();

        synchronized(this) {
            try {
                System.out.println("Begin wait");
                wait();
                System.out.println("End wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Out some method");
    }

    public void setData(String news){
        marketNews = news;
    }

}


