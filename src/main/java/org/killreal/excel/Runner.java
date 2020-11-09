package org.killreal.excel;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;

@Component
public class Runner implements CommandLineRunner {
    public void run(String... args) throws Exception {
        XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream("C:\\Users\\Vitalii\\IdeaProjects\\kill_real\\src\\main\\java\\org\\killreal\\excel\\kill_real.xlsx"));
        XSSFSheet myExcelSheet = myExcelBook.getSheet("Лист1");
        XSSFRow row = myExcelSheet.getRow(0);
        for(Cell cell: row) {
            System.out.println(cell.getStringCellValue());
        }
    }
}
