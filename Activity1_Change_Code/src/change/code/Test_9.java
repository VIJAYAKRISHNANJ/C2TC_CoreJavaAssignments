package change.code;

class C3 {
    final void show() {
    	 C3 obj = new D3();   
         
        System.out.println("C3");
    }


class D3 extends C3 {
	 C3 obj = new C3(); 
       System.out.println("D3");
    }
}

public class Test_9 {
       
        
      void show() {
        	    
    }
}

