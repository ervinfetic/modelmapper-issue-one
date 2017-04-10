package testapp;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import testapp.generated.ota2008a.OTAHotelResNotifRQ_2008A;
import testapp.generated.ota2008a.POSType_2008A;
import testapp.generated.ota2008a.SourceType_2008A;
import testapp.generated.ota2015b.OTAHotelResNotifRQ_2015B;

public class Application {

	public static void main(String[] args) {
		
		ModelMapper modelMapper = new ModelMapper();

		/*
		I found somewhere if I have no setter methods for a lists I can specify below configuration 
		and it should work event without setters but it did not work. You can also try with this configuration
		and you'll see an error that I got.*/
		
//		modelMapper.getConfiguration().setFieldMatchingEnabled(true);
//		modelMapper.getConfiguration().setMethodAccessLevel(AccessLevel.PUBLIC);
//		modelMapper.getConfiguration().setFieldAccessLevel(AccessLevel.PROTECTED);
		
		// Fills the source item
		OTAHotelResNotifRQ_2008A item1 = new OTAHotelResNotifRQ_2008A();
		
		SourceType_2008A source = new SourceType_2008A();
		source.setTerminalID("Terminal-001");
		source.setISOCountry("UK");
		
		POSType_2008A pos = new POSType_2008A();
		pos.getSource().add(source);
		
		item1.setPOS(pos);
		item1.setEchoToken("My echo token!");
		
		// Converts the first object to the second object
		OTAHotelResNotifRQ_2015B item2 = modelMapper.map(item1, OTAHotelResNotifRQ_2015B.class);
		
		if (item2 != null) {
			// The POS variable wont be mapped because of list
			if (item2.getPOS() != null) {
				if (item2.getPOS().getSource() != null && item2.getPOS().getSource().size() > 0) {
					
					// Prints the terminal id
					if (item2.getPOS().getSource().get(0).getTerminalID() != null) {
						System.out.println("Terminal: " + item2.getPOS().getSource().get(0).getTerminalID());
					}
					
					// Prints the country code
					if (item2.getPOS().getSource().get(0).getISOCountry() != null) {
						System.out.println("Country: " + item2.getPOS().getSource().get(0).getISOCountry());
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
