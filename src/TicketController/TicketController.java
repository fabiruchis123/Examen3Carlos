
import Ticket.TicketModel;

public class TicketController {
    
    TicketModel tickete = new TicketModel;
    int consecutivo;
    consecutivo = 0;
    
    public void GenerarTik(enum tipo){
        tickete.TicketModel(consecutivo,tipo)
        consecutivo++;
    }
    
    public TicketModel Atender(enum tipo){
        TicketList list = new TicketList();
        for(TicketModel ticket : list)
        if (ticket.getTipoEnum() == tipo) {
            return ticket;
        }
    }
    
}
