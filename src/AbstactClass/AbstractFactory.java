/**
 * 
 */
package AbstactClass;

import FactoryClass.FactoryOriental;
import FactoryClass.FactoryReine;
import FactoryClass.FactoryTroisFromage;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public abstract class AbstractFactory {
	
     public static AbstractFactory getFactory(String choice){
        
        if("Oriental".equalsIgnoreCase(choice)){
            return new FactoryOriental();
        }
        else if("Reine".equalsIgnoreCase(choice)){
            return new FactoryReine();
        }
        else if("TroisFromage".equalsIgnoreCase(choice)){
            return new FactoryTroisFromage();
        }
         
        return null;
    }
     public abstract Oriental createOriental(String typeOriental);
     public abstract TroisFromage createTroisTromage(String typeTroisFromage);
     public abstract Reine createReine(String typeReine);
}
