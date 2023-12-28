package ParkingLot.Models.Repository;

import ParkingLot.Models.Ticket;
import java.util.*;

public class TicketRepository {
	

	private Map<Long, Ticket> ticketTable = new TreeMap<>();
	private static Long count=0L;
	
	public Ticket saveTicket(Ticket ticket) {
		
		count++;
		ticketTable.put(count, ticket);
		ticket.setId(count);
		
		//db.execute(INSERT INTO TICKET (ID, Vehicle,...) VALUES (ticket.getId(), ticket.getVehicleName()));
		
		// String response = db.execute(SELECT * FROM Ticket WHERE ticketEntryTime = ticket.getTime());
		
		// ticket = ConvertToTicket(response);
		
		return ticket;
	}

}
