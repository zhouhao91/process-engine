package com.zh.engine.model;

import lombok.Data;

/**
 * @description: 流程连线
 * @author: zhouh
 * @create: 2022-11-07 17:07
 **/
@Data
public class ProcessLine extends ProcessElement {
    private String source;
    private String target;

    /**
     * 路径决策表达式
     */
    private String expression;

    /**
     * 路径排序
     */
    private int sort;
}
