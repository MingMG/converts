package org.example;


import com.aspose.words.License;
import com.aspose.pdf.Document;
import com.aspose.pdf.SaveFormat;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        getLicense();
        // 输入的Word文档路径
        String outputFilePath = "D:\\测试文档1.docx";
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

        try {
            // 加载字体文件
            //FontSettings.setFontsFolder(fontPath, true);

            // 加载Word文档
            //Document doc = new Document(inputFilePath);
            //
            //// 将Word文档保存为PDF格式
            //doc.save(outputFilePath, SaveFormat.PDF);

            // 加载PDF文件
            Document pdfDocument = new Document(inputFilePath);

            // 将PDF保存为Word文档
            pdfDocument.save(outputFilePath, SaveFormat.DocX);

            System.out.println("Word文档转换为PDF成功！");
        } catch (Exception e) {
            System.out.println("Word文档转换为PDF失败：");
            e.printStackTrace();
        }
    }

    public static boolean getLicense() {
        boolean result = false;

        try {
            //InputStream is = ErpApplication.class.getClassLoader().getResourceAsStream("license.xml");
            InputStream is = new FileInputStream("E:\\My Code\\convert\\src\\main\\resources\\license.xml");
            License license = new License();
            license.setLicense(is);
            result = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

        //try {
        //    String licensePath = "license.xml";
        //    // 创建许可证对象
        //    License license = new License();
        //
        //    // 加载许可证文件
        //    license.setLicense(licensePath);
        //
        //    System.out.println("许可证验证成功！");
        //} catch (Exception e) {
        //    System.out.println("许可证验证失败：");
        //    e.printStackTrace();
        //}
    }
}