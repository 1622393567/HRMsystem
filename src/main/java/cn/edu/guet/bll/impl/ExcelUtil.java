package cn.edu.guet.bll.impl;

import org.apache.poi.hssf.usermodel.*;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

public class ExcelUtil {

    public static void exportExcel(HttpServletResponse response, String sheetName, String[] headers, List list) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet(sheetName);

        setTitle(headers,workbook, sheet);
        //新增数据行，并且设置单元格数据
        for(int i=0;i<list.size();i++){
            List clist = (List)list.get(i);
            HSSFRow hssfRow = sheet.createRow(i+1);
            for(int j=0;j<clist.size();j++){
                hssfRow.createCell(j).setCellValue((String)clist.get(j));
            }
        }
        Date date = new Date();
        String fileName =String.valueOf(date.getTime());
        fileName = fileName + ".xls";
        //清空response
        response.reset();
        //设置response的Header
        response.setContentType("application/vnd.ms-exce;charset=GBK");
        response.setCharacterEncoding("GBK");
        response.setHeader("content-Disposition", "attachment;filename="+ java.net.URLEncoder.encode(new String(fileName.getBytes("GBK"),"ISO-8859-1"), "GBK"));
        response.setDateHeader("Expires", 0);
        OutputStream os = new BufferedOutputStream(response.getOutputStream());

        //将excel写入到输出流中
        workbook.write(os);
        os.flush();
        os.close();
    }

    // 创建表头
    public static void setTitle(String[] headers, HSSFWorkbook workbook, HSSFSheet sheet) {
        HSSFRow row = sheet.createRow(0);
        // 设置为居中加粗
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        style.setFont(font);

        // 设置表格默认列宽度为15个字节
        for (int i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
            cell.setCellStyle(style);
        }
    }
}

