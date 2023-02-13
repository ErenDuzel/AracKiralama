package com.Eren.Controller;

import com.Eren.Repository.entity.Arac;
import com.Eren.Service.AracService;

import java.util.List;
import java.util.Scanner;

public class AracController {

private Scanner scanner;
private AracService aracService;

    public AracController() {
        this.aracService = new AracService();
    }

    public void  aracKaydet(){
        aracService.aracKaydet();
    }
    public void aracArama(){
        aracService.aracArama();
    }
}
