package com.maison.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticGenerator {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        String inputPath = projectPath + File.separator + "maison-generator-demo-projects" + File.separator + "acm-template";
        String outputPath = projectPath;
        copyFilesByHutool(inputPath, outputPath);
    }

    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }
}
