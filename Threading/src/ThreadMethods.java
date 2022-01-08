public class ThreadMethods extends Thread{
    String name;
    int time;

    public ThreadMethods(String name, int time){
        this.name = name;
        this.time = time;
    }

    public void run(){
        try {
            System.out.println(name+" is sleeping for "+time);
            Thread.sleep(time);
            System.out.println(name+" is done!");
        } catch (Exception e) {
            System.out.println("Something went wromg "+ e);
        }
    }
   
    public static void main(String[] args) {
         ThreadMethods a = new ThreadMethods("First", 2);
         ThreadMethods b = new ThreadMethods("Second", 12);
         ThreadMethods c = new ThreadMethods("Third", 10);
         Thread2 dthd=new Thread2();

        System.out.println("First thread priority: "+ a.getPriority());
        System.out.println("second thread priority: "+ b.getPriority());
        System.out.println("third thread priority: "+ c.getPriority());

        a.setPriority(2);
        b.setPriority(9);
        c.setPriority(4);

        System.out.println("First thread after priority: " + a.getPriority());
        System.out.println("second thread after priority: " + b.getPriority());
        System.out.println("third thread after priority: " + c.getPriority());

        System.out.println("Currently running thread: "+ Thread.currentThread().getName());
        System.out.println("Currently running thread's priority: "+ Thread.currentThread().getPriority());

        a.start();
        b.start();
        c.start();
        dthd.run();
 
    }
}