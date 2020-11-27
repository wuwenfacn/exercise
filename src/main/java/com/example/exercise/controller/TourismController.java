package com.example.exercise.controller;

import com.example.exercise.commons.result.BaseResult;
import com.example.exercise.entity.Tourism;
import com.example.exercise.service.TourismService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/tourism")
public class TourismController {
    @Resource
    TourismService tourismService;

    @GetMapping("/list")
    public BaseResult<List<Tourism>> findTourismList(){
        return BaseResult.success(tourismService.getTourismList());
    }
}
