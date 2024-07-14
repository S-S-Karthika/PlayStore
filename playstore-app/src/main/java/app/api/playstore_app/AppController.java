package app.api.playstore_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/App")

public class AppController {
    @Autowired
    AppService service;

    @GetMapping("/")
    public List<AppEntity> viewAll(){
        return service.implementFindAll();
    }

    @PostMapping("/")
    public AppEntity ip(@RequestBody AppEntity details){
        return service.implementSave(details);
    }


    @GetMapping("/{id}")
    public AppEntity viewSingle(@PathVariable ("id") int id){
        return service.implementFindById(id);
    }



    @PutMapping("/")
    public AppEntity progress(@PathVariable("appId") int appId){
        return service.implementFindById(appId);
    }



}
