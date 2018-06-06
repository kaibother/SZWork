package pluto.service;

import java.util.Date;

public interface HostelService {
   boolean HostelReservationQuickly(int userid,Date arrival,Date leave,String dogname,String doghousename,Double dogweight);
   boolean HostelReservation(int userid,Date arrival,Date leave,String dogname,String doghousename,Double dogweight);
}
