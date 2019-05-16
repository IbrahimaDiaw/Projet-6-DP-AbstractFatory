/**
 * 
 */
package FactoryClass;

import AbstactClass.AbstractFactory;
import AbstactClass.Oriental;
import AbstactClass.Reine;
import AbstactClass.TroisFromage;
import Reine.ReineFR;
import Reine.ReineSN;
import Reine.ReineUS;
import TroisFromage.TroisFromageFR;
import TroisFromage.TroisFromageSN;
import TroisFromage.TroisFromageUS;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class FactoryTroisFromage extends AbstractFactory {

	@Override
	public Oriental createOriental(String typeOriental) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TroisFromage createTroisTromage(String typeTroisFromage) {
		// TODO Auto-generated method stub
		if ("SEN".equalsIgnoreCase(typeTroisFromage)) {
            return new TroisFromageSN();
        } else if ("FR".equalsIgnoreCase(typeTroisFromage)) {
            return new TroisFromageFR();
        }else if("USA".equalsIgnoreCase(typeTroisFromage)) {
        	return new TroisFromageUS();
        }
		return null;
	}

	@Override
	public Reine createReine(String typeReine) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
