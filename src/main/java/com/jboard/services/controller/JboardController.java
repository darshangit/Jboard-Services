package com.jboard.services.controller;

import com.jboard.services.entity.*;
import com.jboard.services.response.LocationWrapperDetails;
import com.jboard.services.service.*;
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

    @Autowired
    JarLocationService jarLocationService;

    @Autowired
    SprintPlanningService sprintPlanningService;

    @Autowired
    SprintDetailsService sprintDetailsService;

    @Autowired
    LoginService loginService;

    @PostMapping(value="/jboard/retro/save", consumes = "application/json")
    public boolean saveRetro(@RequestBody RetroEntity retroEntity){
        jBoardService.saveRetro(retroEntity);
        return true;
    }

    @GetMapping("/jboard/retro/getHistory/{user}")
    public List<RetroEntity> getRetros(@PathVariable String user){
        return jBoardService.getAllRetros(user);
    }

    @GetMapping("/jboard/retro/delete/{sprintUUID}/{user}")
    public List<RetroEntity> deleteRetro(@PathVariable Integer sprintUUID,@PathVariable String user){
        return jBoardService.deleteRetro(sprintUUID,user);
    }

    @PostMapping(value="/jboard/leaves/save", consumes = "application/json")
    public List<LeavesTrainingsEntity> saveLeavesTrainings(@RequestBody LeavesTrainingsEntity leavesTrainingsEntity){
        return jBoardService.saveLeavesAndTrainings(leavesTrainingsEntity);
    }

    @GetMapping("/jboard/leaves/getLeavesAndTrainings/{user}")
    public List<LeavesTrainingsEntity> getLeavesAndTrainings(@PathVariable String user){
        return jBoardService.getLeavesAndTrainingRows(user);
    }

    @GetMapping("/jboard/leaves/deleteLeaveAndTraining/{uuid}/{user}")
    public List<LeavesTrainingsEntity> deleteLeaveAndTraining(@PathVariable Integer uuid,@PathVariable String user){
        return jBoardService.deleteLeaveAndTrainingEntity(uuid, user);
    }

    @GetMapping("/jboard/holidays/getall")
    public List<HolidaysEntity> getHolidays(){
        return jBoardService.getHolidayList();
    }

    @GetMapping("/jboard/member/add/{name}/{user}")
    public List<MemberEntity> addMember(@PathVariable String name,@PathVariable String user){
        return memberService.addMember(name,user);
    }

    @GetMapping("/jboard/member/delete/{id}/{user}")
    public List<MemberEntity> addMember(@PathVariable Integer id,@PathVariable String user){
        return memberService.deleteMember(id,user);
    }

    @GetMapping("/jboard/member/getall/{user}")
    public List<MemberEntity> getAllMembers(@PathVariable String user){
        return memberService.getAllMembers(user);
    }

    @GetMapping("/jboard/environment/getDetails")
    public LocationWrapperDetails getDetails(){
        return jarLocationService.getJarLocationDetails();
    }

    @PostMapping(value="/jboard/planning/save", consumes = "application/json")
    public List<SprintPlanningEntity> savePlanning(@RequestBody SprintPlanningEntity sprintPlanningEntity){
        return sprintPlanningService.savePlanning(sprintPlanningEntity);
    }

    @GetMapping("/jboard/planning/{sprintNo}/{user}")
    public List<SprintPlanningEntity> getValuesBySprint(@PathVariable Integer sprintNo,@PathVariable String user){
        return sprintPlanningService.getAllPlanningForSprint(sprintNo,user);
    }

    @GetMapping("/jboard/planning/{uuid}/{sprintNo}/{user}")
    public List<SprintPlanningEntity> deletePlanning(@PathVariable Integer uuid,@PathVariable Integer sprintNo,@PathVariable String user){
        return sprintPlanningService.deletePlanning(uuid,sprintNo,user);
    }

    @GetMapping("/jboard/sprintDetails/getAll/{user}")
    public List<SprintDetailsEntity> getAllSprint(@PathVariable String user){
        return sprintDetailsService.getAllSprints(user);
    }

    @GetMapping("/jboard/sprintDetails/delete/{sprintNo}/{user}")
    public List<SprintDetailsEntity> deleteSprint(@PathVariable Integer sprintNo,@PathVariable String user){
        return sprintDetailsService.deleteSprint(sprintNo,user);
    }

    @GetMapping("/jboard/sprintDetails/current/{sprintNo}/{user}")
    public List<SprintDetailsEntity> markAsCurrentSprint(@PathVariable Integer sprintNo,@PathVariable String user){
        return sprintDetailsService.markAsCurrentSprint(sprintNo,user);
    }

    @GetMapping("/jboard/sprintDetails/add/{sprintNo}/{user}")
    public List<SprintDetailsEntity> addSprint(@PathVariable Integer sprintNo,@PathVariable String user){
        return sprintDetailsService.addSprint(sprintNo,user);
    }

    @GetMapping("/jboard/sprintDetails/getCurrentSprint/{user}")
    public SprintDetailsEntity getCurrentSprint(@PathVariable String user){
        return sprintDetailsService.getCurrentSprint(user);
    }

    @PostMapping(value="/jboard/login/authenticate", consumes = "application/json")
    public boolean autheticateLogin(@RequestBody LoginEntity loginEntity){
        return loginService.authenticateUser(loginEntity);
    }
}