package org.example.utils;

import com.aspose.pdf.Document;
import com.aspose.pdf.SaveFormat;
import org.example.designPattern.Tactics;
import java.io.File;
import java.util.List;
import cn.hutool.core.util.ObjectUtil;

/**
 * @Author ba'bei
 * @Date 2023/9/2
 **/

public class PdfConvertWord implements Tactics {

    @Override
    public void convert(List<File> files, String type, String name) {
      //  getLicense();
        // 输入的Word文档路径
       // String outputFilePath = "D:\\测试文档1.docx";
        String outputFilePath = null;
        // 输出的PDF文档路径
        String inputFilePath  = "D:\\output.pdf";

        // 根据操作系统选择合适的字体路径
        String fontPath;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            // Windows系统下的字体路径
            fontPath = "C:\\Windows\\Fonts\\arial.ttf";
        } else {
            // Linux系统下的字体路径
            fontPath = "/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf";
        }
        for (File file : files) {
            try {
                // 加载PDF文件
                com.aspose.pdf.Document pdfDocument = new Document(file.getName());
                if (ObjectUtil.isEmpty(name)){
                    outputFilePath= file.getName();
                }
                // 将PDF保存为Word文档
                pdfDocument.save(outputFilePath, SaveFormat.DocX);
                System.out.println("Word文档转换为PDF成功！");
            }catch (Exception e){
                System.out.println("Word文档转换为PDF失败：");
                e.printStackTrace();
            }

        }

    }
}
