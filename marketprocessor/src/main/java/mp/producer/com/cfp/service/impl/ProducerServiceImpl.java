package mp.producer.com.cfp.service.impl;

import mp.producer.com.cfp.dao.TradeMessageDao;
import mp.producer.com.cfp.data.TradeMessageEntity;
import mp.producer.com.cfp.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    TradeMessageDao tradeMessageDao;

    @Override
    public boolean insertTradeMessage(TradeMessageEntity tradeMessageEntity) {
        return tradeMessageDao.insertTradeMessage(tradeMessageEntity);
    }
}
