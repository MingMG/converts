package org.example.utils;

import java.io.*;

/**
 * @Author ba'bei
 * @Date 2023/9/2
 **/
public class WordConvertPdf {

    public static void doc2pdf(String inPath, String outPath){
        getLicense();
        FileOutputStream os = null;
        try {
            File file = new File(outPath);
            os = new FileOutputStream(file);
            //Document doc = new Document(inPath);
            //doc.save(os, SaveFormat.PDF);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static boolean getLicense() {
        boolean result = false;

        try {
            //InputStream is = ErpApplication.class.getClassLoader().getResourceAsStream("license.xml");
            InputStream is = new FileInputStream("E:\\Code\\cloud-api\\ew_erp\\src\\main\\resources\\license.xml");
            //License license = new License();
            //license.setLicense(is);
            result = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
