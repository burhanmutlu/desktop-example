package database;

import database.transactions.HesapBilgileri;

public interface IBilgiController {
    
    boolean bilgilerGecerliMi();
    
    HesapBilgileri getHesapBilgileri();
    
}
