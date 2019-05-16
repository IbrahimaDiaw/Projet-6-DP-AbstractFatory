/**
 * 
 */
package Main;

import AbstactClass.AbstractFactory;
import AbstactClass.Oriental;
import AbstactClass.Reine;
import AbstactClass.TroisFromage;


/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class AbstractFactoryTest {

	 public static String pays = "SEN";
	 public static String choice ="Oriental";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory;
	    factory = AbstractFactory.getFactory(choice);
	    Oriental oriental = factory.createOriental(pays);
	    Reine reine      = factory.createReine(pays);
	    TroisFromage troisfr = factory.createTroisTromage(pays);
	    if(choice=="Oriental") {
	    	 System.out.print(oriental.toString());
	    }
	    else if(choice=="Reine") {
	    	 System.out.print(reine.toString());
	    }else if(choice=="TroisFromage") {
	    	 System.out.print(troisfr.toString());
	    }
	     
	    
	    
	   
	   
	  }

	}


