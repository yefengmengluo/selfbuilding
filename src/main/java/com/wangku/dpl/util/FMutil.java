package com.wangku.dpl.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

/*import freemarker.template.Configuration;
import freemarker.template.Template;
*/
public class FMutil {
	
	/**
	 * 
	 * @param ftlName:模板名字
	 * @param fileName：输出文件名======配置相应的freeMark的jar包即可使用 ===========
	 * @param map：数据
	 * @throws Exception
	 */
	public static void ouputFile(String ftlName, String fileName,  Map<String, Object> map) throws Exception{
		
		//创建fm的配置
		/*Configuration config = new Configuration();
		//指定默认编码格式
		config.setDefaultEncoding("UTF-8");
		//设置模板的包路径
		config.setClassForTemplateLoading(FMutil.class, "/com/rl/ecps/ftl");
		//获得包的模板
		Template template = config.getTemplate(ftlName);
		//指定文件输出的路径
		String path = "D:/dsworkspace/workspace/ecps-0122/ecps-portal/src/main/webapp/static";
		//定义输出流，注意的必须指定编码
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(path+"/"+fileName)),"UTF-8"));
		//生成模板
		template.process(map, writer);*/
	}
	
	
}
