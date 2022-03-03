public class MultiThread {

    /**Using Lambda expressions*/
    public static void main(String[] args) {

        Thread thread2 = new Thread(()-> longTask());
        thread2.start();
        System.out.println("Doing other work on main thread");
        
    }

    /**Long task is running in the background */
    public static void longTask() {  
        long t= System.currentTimeMillis();
        long end = t+3000;

        while(true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("Finished long task");
                break;
            }
        }
    }

}
