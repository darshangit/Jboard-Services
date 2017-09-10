package com.jboard.services.controller;

import com.jboard.services.entity.RetroEntity;
import com.jboard.services.service.JBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Dash on 9/9/2017.
 */
@RestController
@CrossOrigin("*")
public class JboardController {

    @Autowired
    JBoardService jBoardService;

    @PostMapping(value="/jboard/retro/save", consumes = "application/json")
    public boolean saveRetro(@RequestBody RetroEntity retroEntity){
        jBoardService.save(retroEntity);
        return true;
    }

    @GetMapping("/jboard/retro/getHistory")
    public List<RetroEntity> getRetros(){
        return jBoardService.getAllRetros();
    }
}
