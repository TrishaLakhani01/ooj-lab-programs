class NewThread implements Runnable
{
private String name;

private int interval; private Thread t;

NewThread(String threadname, int interval)
{
this.name = threadname;

this.interval = interval;

t = new Thread(this, name);

t.start();
}
public void run()
{
try {
for(int i=1;i<11;i++) {

System.out.println("Token number : "+i); 
Thread.sleep(this.interval);
}
}
catch(InterruptedException e) {

System.out.println(name+"Interrupted");


}
}
}
public class test2_5
{

public static void main(String args[])
{
	new NewThread("Token", 1000);
}
}