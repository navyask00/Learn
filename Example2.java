 public class Demo {
	    int a=100;
	    static int b=200;
	    public static void main(String[] args) {
	        Demo s=new Demo();
	        s.a=s.a+b;
	        b=s.a-b;
	        s.a=s.a-b;
	        System.out.println(s.a);
	        System.out.println(b);
		System.out.println(" ");
	           
	       
	    }
	}

