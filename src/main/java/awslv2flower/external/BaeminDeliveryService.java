
package awslv2flower.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="baemindelivery", url="${api.url.baemindelivery}")
public interface BaeminDeliveryService {

    @RequestMapping(method= RequestMethod.POST, path="/baeminDeliveries")
    public void baeminRequest(@RequestBody BaeminDelivery baeminDelivery);

}