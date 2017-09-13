package Section7;

/**
 *
 * @author lkeliikoa
 */
public class Test implements Runnable{
    private Thread theThread;
    private boolean stopThread = false;
    public void start(){
        if(theThread == null){
            theThread = new Thread(this);
            theThread.start();
        }
    }

    public void setStopThread(boolean aValue){
        stopThread = aValue;
    }
    
    @Override
    public void run(){
        while(true){
            if(stopThread)
                break;
            //...
        }
    }
   
}
