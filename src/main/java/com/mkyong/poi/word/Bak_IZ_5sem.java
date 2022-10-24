package com.mkyong.poi.word;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import javax.xml.soap.Text;
import java.io.FileOutputStream;
import java.io.IOException;


public class Bak_IZ_5sem  {

    public static void main(String[] args) throws IOException {


        try (XWPFDocument doc = new XWPFDocument()) {

            XWPFParagraph p1 = doc.createParagraph();
            p1.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun r1 = p1.createRun();
            r1.setBold(true);
            r1.setItalic(false);
            r1.setFontSize(10);
            r1.setText("МИНИСТЕРСТВО НАУКИ И ВЫСШЕГО ОБРАЗОВАНИЯ");
            r1.setFontFamily("Times New Roman");

            //String enterKey = System.getProperty("line.separator");
            XWPFParagraph p2 = doc.createParagraph();
            p2.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun r2 = p2.createRun();
            r2.setBold(true);
            r2.setItalic(false);
            r2.setFontSize(10);
            r2.setText("РОССИЙСКОЙ ФЕДЕРАЦИИ");
            r2.setFontFamily("Times New Roman");



            XWPFParagraph empty_par1 = doc.createParagraph();
            empty_par1.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun emptyparR1 = empty_par1.createRun();
            emptyparR1.setText(" ");


            XWPFParagraph p3 = doc.createParagraph();
            p3.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun r3 = p3.createRun();
            r3.setBold(true);
            r3.setItalic(false);
            r3.setFontSize(10);
            r3.setText("ФЕДЕРАЛЬНОЕ ГОСУДАРСТВЕННОЕ АВТОНОМНОЕ");
            r3.setFontFamily("Times New Roman");



            XWPFParagraph p4 = doc.createParagraph();
            p4.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun r4 = p4.createRun();
            r4.setBold(true);
            r4.setItalic(false);
            r4.setFontSize(10);
            r4.setText("ОБРАЗОВАТЕЛЬНОЕ УЧРЕЖДЕНИЕ ВЫСШЕГО ОБРАЗОВАНИЯ");
            r4.setFontFamily("Times New Roman");


            XWPFParagraph p5 = doc.createParagraph();
            p5.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun r5= p5.createRun();
            r5.setBold(true);
            r5.setItalic(false);
            r5.setFontSize(10);
            r5.setText("«НОВОСИБИРСКИЙ НАЦИОНАЛЬНЫЙ ИССЛЕДОВАТЕЛЬСКИЙ ГОСУДАРСТВЕННЫЙ");
            r5.setFontFamily("Times New Roman");

            XWPFParagraph p6 = doc.createParagraph();
            p6.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun r6 = p6.createRun();
            r6.setBold(true);
            r6.setItalic(false);
            r6.setFontSize(10);
            r6.setText("УНИВЕРСИТЕТ»");
            r6.setFontFamily("Times New Roman");


            XWPFParagraph empty_par2 = doc.createParagraph();
            empty_par2.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun emptyparR2 = empty_par2.createRun();
            emptyparR2.setText(" ");


            XWPFParagraph p7 = doc.createParagraph();
            p7.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun r7= p7.createRun();
            r7.setBold(true);
            r7.setItalic(false);
            r7.setFontSize(10);
            r7.setText("ФАКУЛЬТЕТ ИНФОРМАЦИОННЫХ ТЕХНОЛОГИЙ");
            r7.setFontFamily("Times New Roman");


            XWPFParagraph p8 = doc.createParagraph();
            p8.setAlignment(ParagraphAlignment.LEFT);
            XWPFRun r8= p8.createRun();
            r8.setBold(true);
            r8.setItalic(false);
            r8.setFontSize(10);
            r8.setText("Кафедра ${name}");
            r8.setFontFamily("Times New Roman");

            XWPFParagraph p9 = doc.createParagraph();
            p9.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun r9= p9.createRun();
            r9.setBold(true);
            r9.setItalic(false);
            r9.setFontSize(10);
            r9.setText("ФАКУЛЬТЕТ ИНФОРМАЦИОННЫХ ТЕХНОЛОГИЙ");
            r9.setFontFamily("Times New Roman");


            XWPFParagraph p10 = doc.createParagraph();
            p8.setAlignment(ParagraphAlignment.LEFT);
            XWPFRun r10= p10.createRun();
            r10.setBold(true);
            r10.setItalic(false);
            r10.setFontSize(10);
            r10.setText("Кафедра ${name}");
            r10.setFontFamily("Times New Roman");





            // save the docs
            try (FileOutputStream out = new FileOutputStream("C:\\Users\\User\\Desktop\\Диплом\\template\\apache-poi-examples\\src\\main\\resources\\iz_5sem_template.docx")) {
                doc.write(out);
            }

        }

    }

}
