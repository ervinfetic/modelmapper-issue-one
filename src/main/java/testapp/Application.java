package testapp;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.modelmapper.convention.NamingConventions;
import testapp.generated.ota2008a.OTAHotelResNotifRQ_2008A;
import testapp.generated.ota2008a.POSType_2008A;
import testapp.generated.ota2008a.SourceType_2008A;
import testapp.generated.ota2015b.OTAHotelResNotifRQ_2015B;

/* 
 *  @description This is example of bug that I had with ModelMapper library. If you want to make this example to work you have to uncomment the below configuration 
 *  otherwise your source code will not be mapped due to nested collections. Please
 *  try either with or without the following configuration below.
 *  
 *  @author Ervin
 *  @created 10/04/2017
 *  @modified 12/04/2017
 */
public class Application {

	public static void main(String[] args) {
		
		ModelMapper modelMapper = new ModelMapper();
		
		//modelMapper.getConfiguration().setFieldMatchingEnabled(true);
		//modelMapper.getConfiguration().setFieldAccessLevel(AccessLevel.PROTECTED);
		//modelMapper.getConfiguration().setSourceNamingConvention(NamingConventions.JAVABEANS_MUTATOR);
		 
		// Fills the source item
		OTAHotelResNotifRQ_2008A item1 = new OTAHotelResNotifRQ_2008A();
		
		SourceType_2008A source1 = new SourceType_2008A();
		source1.setTerminalID("Terminal-001");
		source1.setISOCountry("UK");
		
		SourceType_2008A source2 = new SourceType_2008A();
		source2.setTerminalID("Terminal-002");
		source2.setISOCountry("GE");
		
		POSType_2008A pos = new POSType_2008A();
		pos.getSource().add(source1);
		pos.getSource().add(source2);
		
		item1.setPOS(pos);
		item1.setEchoToken("My echo token!");
		
		// Converts the first object to the second object
		OTAHotelResNotifRQ_2015B item2 = modelMapper.map(item1, OTAHotelResNotifRQ_2015B.class);
		
		if (item2 != null) {
				
			if (item2.getPOS() != null) {
				if (item2.getPOS().getSource() != null && item2.getPOS().getSource().size() > 0) {
					
					if (item2.getPOS().getSource().get(0).getTerminalID() != null) {
						System.out.println("Terminal1: " + item2.getPOS().getSource().get(0).getTerminalID());
					}
					
					if (item2.getPOS().getSource().get(0).getISOCountry() != null) {
						System.out.println("Country1: " + item2.getPOS().getSource().get(0).getISOCountry());
					}
					
					if (item2.getPOS().getSource().get(1).getTerminalID() != null) {
						System.out.println("Terminal2: " + item2.getPOS().getSource().get(1).getTerminalID());
					}
					
					if (item2.getPOS().getSource().get(1).getISOCountry() != null) {
						System.out.println("Country2: " + item2.getPOS().getSource().get(1).getISOCountry());
					}
					
				} else {
					System.out.println("Error one!");
				}
			} else {
				System.out.println("Error two!");
			}
			
			// Token variable is mapped properly
			if (item2.getEchoToken() != null) {
				System.out.println("Token: " + item2.getEchoToken());
			} else {
				System.out.println("Echo token does not exist!");
			}
			
		} else {
			System.out.println("Error three!");
		}
	}
}
