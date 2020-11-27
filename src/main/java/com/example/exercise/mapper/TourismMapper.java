package com.example.exercise.mapper;

import com.example.exercise.entity.Tourism;

import java.util.List;

public interface TourismMapper {
    int insert(Tourism record);

    int insertSelective(Tourism record);

    List<Tourism> selectList();
}