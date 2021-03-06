package mp.consumer.com.cfc.service;


import com.mongodb.MongoException;
import mp.producer.com.cfp.data.TradeMessageEntity;

import java.util.List;

public interface ConsumerService {

    List<TradeMessageEntity> findAllMessages();
    List<TradeMessageEntity> findTradeMessagesByCountryCode(String countryCode);
    List<TradeMessageEntity> findByCurrencyFromIgnoreCase(String currencyFrom);
    List<TradeMessageEntity> findByCurrencyToIgnoreCase(String currencyTo);
    TradeMessageEntity findFirstByOrderByTimePlacedDesc() throws NullPointerException;
    boolean insertTradeMessage(TradeMessageEntity tradeMessageEntity) throws MongoException;

}
