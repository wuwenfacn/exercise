package com.example.exercise.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 旅游表
    */
@Data
public class Tourism {
    /**
    * 产品id
    */
    private Long tourismId;

    /**
    * 上架状态，1->上架中，0->已下架
    */
    private Integer upStatus;

    /**
    * 类型
    */
    private String type;

    /**
    * 景点
    */
    private String attractions;

    /**
    * 线路
    */
    private String circuit;

    /**
    * 过期时间
    */
    private Date expiredTime;

    /**
    * 价格
    */
    private BigDecimal price;

    /**
    * 更新人
    */
    private String updatePeople;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 排序标签
    */
    private String label;

    /**
    * 分数
    */
    private Long fraction;

    /**
    * 点击量
    */
    private Long access;

    /**
    * 删除状态，1->未删除，0->已删除
    */
    private Integer deleteStatus;
}