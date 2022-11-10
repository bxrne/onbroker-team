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
		
		/*
		 * TODO null safe check on offer.getassigned, if null set to false
		 * T
		 * 
		 * Okay, so basically the getassigned() method is not recognised for the Offer class, so instead we'll iterate through the offer's
		 * biddings and make sure they're all unassigned.
		 * 
		 * 			
			Boolean assigned = false;
			//if an offer has biddings at all
			if(!offer.getbiddings_Bidding().isEmpty()) {
				//for each bidding associated with the offer
				for(Bidding bidding: offer.getbiddings_Bidding()) {
					if(bidding.getassigned() == true) {//i know this line is causing a NullPointerException
						assigned = true;
					}
				}
				
			}else {
				//if there's no biddings 
				continue;
		 
		System.err.println("input in pos 0 getassigned = " + input.get(0).getassigned());
		input.stream().forEach((offer) -> {
			System.err.println("offer: " + offer.gettitle()+" | Assigned: " + offer.getassigned()  + "\n Offer.user.getName" + offer.getuser().getfirstName() + " " + offer.getuser().getlastName());
		});
		 *
		 */
		//input.get(0).getbiddings_Bidding().get(0).getassigned()
		//return input.stream().filter(p -> !p.get).collect(Collectors.toList());
		
		
		List<Offer> unassignedOffers = new ArrayList<Offer>();
		//for each offer in input
		for(Offer offer: input) {
			if(offer.getassigned() == false) {
				unassignedOffers.add(offer);
			}
		}
		//System.err.println("Unassignedoffers:" + unassignedOffers.toString());
		return unassignedOffers;
	}
	
}