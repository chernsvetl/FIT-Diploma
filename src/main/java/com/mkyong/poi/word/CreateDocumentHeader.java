package com.mkyong.poi.word;

import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFooter;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CreateDocumentHeader {

    public static void main(String[] args) throws IOException {

        try (XWPFDocument doc = new XWPFDocument()) {

            XWPFParagraph p = doc.createParagraph();
            XWPFRun r = p.createRun();
            r.setBold(true);
            r.setFontSize(30);
            r.setText("Create document header and footer!");

            // next page
            XWPFParagraph p2 = doc.createParagraph();
            p2.setWordWrapped(true);
            p2.setPageBreak(true);  // new page break

            XWPFRun r2 = p2.createRun();
            r2.setFontSize(40);
            r2.setItalic(true);
            r2.setText("New Page");

            // document header and footer
            XWPFHeader head = doc.createHeader(HeaderFooterType.DEFAULT);
            head.createParagraph()
                    .createRun()
                    .setText("This is document header");

            XWPFFooter foot = doc.createFooter(HeaderFooterType.DEFAULT);
            foot.createParagraph()
                    .createRun()
                    .setText("This is document footer");

            /*
            // header
            CTP ctP = CTP.Factory.newInstance();
            CTText t = ctP.addNewR().addNewT();
            t.setStringValue("This is document header");

            XWPFParagraph[] pars = new XWPFParagraph[1];
            p = new XWPFParagraph(ctP, doc);
            pars[0] = p;

            XWPFHeaderFooterPolicy policy = doc.createHeaderFooterPolicy();
            policy.createHeader(XWPFHeaderFooterPolicy.DEFAULT, pars);

            // footer
            ctP = CTP.Factory.newInstance();
            t = ctP.addNewR().addNewT();
            t.setStringValue("This is document footer");
            pars[0] = new XWPFParagraph(ctP, doc);
            policy.createFooter(XWPFHeaderFooterPolicy.DEFAULT, pars);
            */

            try (OutputStream os = new FileOutputStream(new File("C:\\Users\\User\\Desktop\\????????????\\template\\apache-poi-examples\\src\\main\\resources\\header.docx"))) {
                doc.write(os);
            }
        }

    }
}
