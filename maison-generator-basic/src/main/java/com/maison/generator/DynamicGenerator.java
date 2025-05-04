package com.maison.generator;

import com.maison.model.MainTemplateConfig;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DynamicGenerator {

    public static void main(String[] args) throws IOException, TemplateException {


        // new 出 Configuration 对象，参数为 FreeMarker 版本号
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);

        String projectPath = System.getProperty("user.dir") + File.separator + "maison-generator-basic";
        File parentFile = new File(projectPath);
        File file = new File(parentFile, "src/main/resources/templates");

        // 指定模板文件所在的路径
        configuration.setDirectoryForTemplateLoading(file);

        // 设置模板文件使用的字符集
        configuration.setDefaultEncoding("utf-8");

        // 创建模板对象，加载指定模板
        Template template = configuration.getTemplate("MainTemplate.java.ftl");

        // 数据模型
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("maison");
        mainTemplateConfig.setOutputText("输出结果");
        mainTemplateConfig.setLoop(false);


        Writer out = new FileWriter("MainTemplate.java");

        template.process(mainTemplateConfig, out);

        // 生成文件后别忘了关闭哦
        out.close();
    }
}
