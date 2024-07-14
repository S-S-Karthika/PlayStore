package app.api.playstore_app;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Feign-Interceptor",url = "http://localhost:8086/Profile/")
public interface FeignCommunicator {
    @GetMapping("/byApp/{AppId}")
    public List<ProfileEntity> callCustomers(@PathVariable("AppId") int AppId);
}
