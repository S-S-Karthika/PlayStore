package app.api.playstore_app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    @Autowired
    AppRepo remote;

    @Autowired
    FeignCommunicator feignCommunicator;

// to get all the app
public List<AppEntity> implementFindAll() {
    return remote.findAll();
}

// post the value to db

    public AppEntity implementSave(AppEntity details) {
        return remote.save(details);
    }

// UPDATE based on appid
public AppEntity implementFindById(int parcellId) {
    AppEntity obj = remote.findById(parcellId).orElse(new AppEntity());
    if (obj != null) {
        obj.setUsers(feignCommunicator.callCustomers(obj.getAppId()));
    }
    return obj;

}


}
