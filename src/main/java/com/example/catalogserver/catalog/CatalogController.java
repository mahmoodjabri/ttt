package com.example.catalogserver.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Collection;
import java.util.List;

@RestController
public class CatalogController {
    CatalogService catalogService;
    @Autowired
    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/search")
    public List getListOfCatalogs(){
        return catalogService.getListOfCatalogs();
    }
    @GetMapping("/search/{s}")
    public List getListOfTopic(@PathVariable String s){
        return catalogService.getListOfTopic(s);
    }
    @GetMapping("/info")
    public List getListofInfo(){
        return catalogService.getListOfInfo();
    }
    @GetMapping("/info/{s}")
    public List getInfo(@PathVariable String s){
        return catalogService.getInfo(s);
    }
    @GetMapping("/infoQ/{s}")
    public String getInfoQ(@PathVariable Long s){
        return catalogService.getInfoQ(s);
    }
    @GetMapping("/infoedit/{s}")
    public void infoedit(@PathVariable Long s){
         catalogService.infoedit(s);
        System.out.println("ss");
    }


}
