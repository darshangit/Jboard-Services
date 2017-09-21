package com.jboard.services.controller;

import com.jboard.services.entity.HolidaysEntity;
import com.jboard.services.entity.LeavesTrainingsEntity;
import com.jboard.services.entity.MemberEntity;
import com.jboard.services.entity.RetroEntity;
import com.jboard.services.service.JBoardService;
import com.jboard.services.service.MemberService;
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

    @Autowired
    MemberService memberService;

    @PostMapping(value="/jboard/retro/save", consumes = "application/json")
    public boolean saveRetro(@RequestBody RetroEntity retroEntity){
        jBoardService.saveRetro(retroEntity);
        return true;
    }

    @GetMapping("/jboard/retro/getHistory")
    public List<RetroEntity> getRetros(){
        return jBoardService.getAllRetros();
    }

    @GetMapping("/jboard/retro/delete/{sprintNo}")
    public List<RetroEntity> deleteRetro(@PathVariable Integer sprintNo){
        return jBoardService.deleteRetro(sprintNo);
    }

    @PostMapping(value="/jboard/leaves/save", consumes = "application/json")
    public List<LeavesTrainingsEntity> saveLeavesTrainings(@RequestBody LeavesTrainingsEntity leavesTrainingsEntity){
        return jBoardService.saveLeavesAndTrainings(leavesTrainingsEntity);
    }

    @GetMapping("/jboard/leaves/getLeavesAndTrainings")
    public List<LeavesTrainingsEntity> getLeavesAndTrainings(){
        return jBoardService.getLeavesAndTrainingRows();
    }

    @GetMapping("/jboard/leaves/deleteLeaveAndTraining/{uuid}")
    public List<LeavesTrainingsEntity> deleteLeaveAndTraining(@PathVariable Integer uuid){
        return jBoardService.deleteLeaveAndTrainingEntity(uuid);
    }

    @GetMapping("/jboard/holidays/getall")
    public List<HolidaysEntity> getHolidays(){
        return jBoardService.getHolidayList();
    }

    @GetMapping("/jboard/member/add/{name}")
    public List<MemberEntity> addMember(@PathVariable String name){
        return memberService.addMember(name);
    }

    @GetMapping("/jboard/member/delete/{id}")
    public List<MemberEntity> addMember(@PathVariable Integer id){
        return memberService.deleteMember(id);
    }

    @GetMapping("/jboard/member/getall")
    public List<MemberEntity> getAllMembers(){
        return memberService.getAllMembers();
    }


}
