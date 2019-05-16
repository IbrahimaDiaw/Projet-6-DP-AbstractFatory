/**
 * 
 */
package FactoryClass;

import AbstactClass.AbstractFactory;
import AbstactClass.Oriental;
import AbstactClass.Reine;
import AbstactClass.TroisFromage;
import Oriental.OrientalFR;
import Oriental.OrientalSN;
import Oriental.OrientalUS;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class FactoryOriental extends AbstractFactory{
	
	@Override
	public Oriental createOriental(String typeOriental) {
		 if ("SEN".equalsIgnoreCase(typeOriental)) {
	            return new OrientalSN();
	        } else if ("FR".equalsIgnoreCase(typeOriental)) {
	            return new OrientalFR();
	        }else if("USA".equalsIgnoreCase(typeOriental)) {
	        	return new OrientalUS();
	        }
	 
	        
		return null;
	}

	@Override
	public TroisFromage createTroisTromage(String typeTroisFromage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reine createReine(String typeReine) {
		// TODO Auto-generated method stub
		return null;
	}

}
