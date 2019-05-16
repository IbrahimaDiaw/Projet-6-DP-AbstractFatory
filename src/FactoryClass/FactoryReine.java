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
import Reine.ReineFR;
import Reine.ReineSN;
import Reine.ReineUS;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class FactoryReine extends AbstractFactory {

	@Override
	public Oriental createOriental(String typeOriental) {
		// TODO Auto-generated method stub
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
		if ("SEN".equalsIgnoreCase(typeReine)) {
            return new ReineSN();
        } else if ("FR".equalsIgnoreCase(typeReine)) {
            return new ReineFR();
        }else if("USA".equalsIgnoreCase(typeReine)) {
        	return new ReineUS();
        }
		return null;
	}

}
