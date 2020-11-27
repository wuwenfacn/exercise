package com.example.exercise.service.impl;

import com.example.exercise.entity.Tourism;
import com.example.exercise.mapper.TourismMapper;
import com.example.exercise.service.TourismService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TourismServiceImpl implements TourismService {
    @Resource
    TourismMapper tourismMapper;

    @Override
    public List<Tourism> getTourismList() {
        return tourismMapper.selectList();
    }
}
