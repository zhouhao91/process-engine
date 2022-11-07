package com.zh.engine.model;

import com.zh.engine.enums.BooleanEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 流程节点
 * @author: zhouh
 * @create: 2022-11-07 17:05
 **/
public abstract class ProcessNode extends ProcessElement {

    /**
     * 排他节点
     */
    protected BooleanEnum exclusive;

    /**
     * 输入路径
     */
    protected List<ProcessLine> inputs = new ArrayList<>();

    /**
     * 输出路径
     */
    protected List<ProcessLine> outputs = new ArrayList<>();
}
