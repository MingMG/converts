package org.example.designPattern;

import java.io.File;
import java.util.List;

/**
 * 策略模式，定义文档传入
 * @Author ba'bei
 * @Date 2023/9/2
 **/
public interface Tactics {
    /**
     *
     * @param files 需要转换的文件类型
     * @param type 转换后的类型
     * @param name 转换后的名字，不传默认用传进来的文件名
     */
    void convert(List<File> files,String type,String name);
}
