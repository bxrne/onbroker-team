package info.scce.dime.app.onbroke;

import de.ls5.dywa.generated.entity.models.app.Assignment;
import de.ls5.dywa.generated.entity.models.app.Offer;
import de.ls5.dywa.generated.entity.models.app.Bidding;
import java.util.*;  
import java.util.stream.Collectors;  
/*
 * Collection of static methods for native SIBs
 */
public class OnbrokeNative {
	
	
	
	public static String printAssignment(Assignment input) {
		return input.toString();
	}
	
	public static List<Offer> filterUnassigned(List<Offer> input) {
		List<Offer> unassignedOffers = new ArrayList<Offer>();
		//for each offer in input (approved offers)
		for(Offer offer: input) {
			//if it's not assigned, add it to unassigned offers
			if(offer.getassigned() == false) {
				unassignedOffers.add(offer);
			}
		}
		return unassignedOffers;
	}
	
}