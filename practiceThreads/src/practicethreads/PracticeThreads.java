package practicethreads;

/*
 * @author Ladzani_fabian
 */
public class PracticeThreads {
    public static void main(String[] args) throws InterruptedException {
        
        Worker workerThreadTask = new Worker();
        workerThreadTask.start();
        System.out.println("about to do a difficult task");
        workerThreadTask.join(); // main thread waits for this thread to die/finish then continues....
        System.out.println("finished task!");
    }
}
class Worker extends Thread {
   @Override
   public void run (){
       try {
           Thread.sleep(3000L);
           System.out.println("done with difficult task");
       } catch (InterruptedException ignored) {
           //Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
}



