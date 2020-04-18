package csu.db.bankmanage.persistence;

import csu.db.bankmanage.domain.Subscribe;
import org.springframework.stereotype.Component;

@Component
public interface SubscribeMapper {
    Subscribe getServiceByUserNum(String userNum, String service);

    void addServiceByUserNum(String userNum, String service);

    void cancelServiceByUserNum(String userNum, String service);
}
