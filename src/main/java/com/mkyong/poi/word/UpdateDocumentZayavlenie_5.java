package com.mkyong.poi.word;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UpdateDocumentZayavlenie_5 {

    public static void main(String[] args) throws IOException {

        UpdateDocumentZayavlenie_5 obj = new UpdateDocumentZayavlenie_5();
        UpdateDocumentZayavlenie_5 obj2 = new UpdateDocumentZayavlenie_5();


        obj.updateDocument(
                "5sem/zayavlenie_5sem_template.docx",
                "C:\\Users\\User\\Desktop\\Диплом\\template\\apache-poi-examples\\src\\main\\resources\\5sem\\bak_zayavlenie_5_sem.docx",
                "Пальчунову Дмитрию Евгеньевичу");

        obj2.updateDocument2(
                "5sem/zayavlenie_5sem_template.docx",
                "C:\\Users\\User\\Desktop\\Диплом\\template\\apache-poi-examples\\src\\main\\resources\\5sem\\bak_zayavlenie_5_sem.docx",
                "19204");

    }


    void updateDocument(String input, String output, String name) throws IOException {

        try (InputStream is = getFileFromResource(input);
             XWPFDocument doc = new XWPFDocument(is)) {


            List<XWPFParagraph> xwpfParagraphList = doc.getParagraphs();
            //Iterate over paragraph list and check for the replaceable text in each paragraph
            for (XWPFParagraph xwpfParagraph : xwpfParagraphList) {
                for (XWPFRun xwpfRun : xwpfParagraph.getRuns()) {
                    String docText = xwpfRun.getText(0);
                   // String docText1 = xwpfRun.getText(0);


                    //replacement and setting position
                    docText = docText.replace("${head}", name);
                   // docText1 = docText1.replace("${group}", name);

                    xwpfRun.setText(docText, 0);
                   // xwpfRun.setText(docText1, 0);

                }
            }

            // save the docs
            try (FileOutputStream out1 = new FileOutputStream(output)) {
                doc.write(out1);
            }

        }

    }

    void updateDocument2(String input, String output, String name) throws IOException {

        try (InputStream is = getFileFromResource(input);
             XWPFDocument doc = new XWPFDocument(is)) {


            List<XWPFParagraph> xwpfParagraphList = doc.getParagraphs();
            //Iterate over paragraph list and check for the replaceable text in each paragraph
            for (XWPFParagraph xwpfParagraph : xwpfParagraphList) {
                for (XWPFRun xwpfRun : xwpfParagraph.getRuns()) {
                    String docText = xwpfRun.getText(0);
                    // String docText1 = xwpfRun.getText(0);


                    //replacement and setting position
                     docText = docText.replace("${group}", name);

                    xwpfRun.setText(docText, 0);

                }
            }

            // save the docs
            try (FileOutputStream out = new FileOutputStream(output)) {
                doc.write(out);
            }

        }

    }


    // get file from the resource folder.
    private InputStream getFileFromResource(String fileName) {
        return getClass().getClassLoader().getResourceAsStream(fileName);
    }

}
