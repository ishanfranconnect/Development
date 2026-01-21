package h.i.b;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student so1=new Student();
    	so1.setS_id(1);
    	so1.setS_name("Ishan");
    	so1.setCity("Mumbai");
//    	ye configuration class ka kaaam h aavi jo hmmne configuratuon file bnaya use connection karne ke liye kaam aata h
    	
//    	configration file kaha h use linking or connect karne ke liye ye configuration class ka use karte h
        Configuration cfg=new Configuration();
        cfg.configure("/n/t/w/hibernate.cfg.xml");
        
        
//        SessionFactory yeek class h jo Session(intize karne me) or (ko bnane ke liye) use hota h
        SessionFactory sf=cfg.buildSessionFactory();
        
//        session ke through hi hmm database ke operation karte h jayse creation,update
        Session s=sf.openSession();
        
//        transaction simply commit karta h ye create ho rha h toh ok karonye sab
        Transaction tr=s.beginTransaction();
        
       try {
    	   s.save(so1);
    	   tr.commit();
       } catch(Exception e) {
    	   tr.rollback();
    	   e.printStackTrace();
       }
        
    }
}
