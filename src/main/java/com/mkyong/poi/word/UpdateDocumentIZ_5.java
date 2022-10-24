package com.mkyong.poi.word;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UpdateDocumentIZ_5 {

    public static void main(String[] args) throws IOException {

        UpdateDocumentIZ_5 obj = new UpdateDocumentIZ_5();


        obj.updateDocument(
                "5sem/iz_5sem_template.docx",
                "C:\\Users\\User\\Desktop\\Диплом\\template\\apache-poi-examples\\src\\main\\resources\\bak_iz_5_pattern.docx",
                "Общей информатики");
    }

    void updateDocument(String input, String output, String name) throws IOException {

        try (InputStream is = getFileFromResource(input);
             XWPFDocument doc = new XWPFDocument(is)) {

        /*try (XWPFDocument doc = new XWPFDocument(
                Files.newInputStream(Paths.get(input)))
        ) {*/

            List<XWPFParagraph> xwpfParagraphList = doc.getParagraphs();
            //Iterate over paragraph list and check for the replaceable text in each paragraph
            for (XWPFParagraph xwpfParagraph : xwpfParagraphList) {
                for (XWPFRun xwpfRun : xwpfParagraph.getRuns()) {
                    String docText = xwpfRun.getText(0);
                    //replacement and setting position
                    docText = docText.replace("${name}", name);
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
