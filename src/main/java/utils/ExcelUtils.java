package utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    static Workbook workbook;

    static Sheet sheet;

    public static void loadExcel(
            String path,
            String sheetName) {

        try {

            File file = new File(path);

            if (!file.exists()) {

                System.out.println(
                "Excel file NOT found!");

                return;
            }

            FileInputStream fis =
                    new FileInputStream(file);

            workbook =
                    new XSSFWorkbook(fis);

            System.out.println(
            "Workbook loaded successfully");

            sheet =
                    workbook.getSheet(sheetName);

            if (sheet == null) {

                System.out.println(
                "Sheet NOT found!");

            } else {

                System.out.println(
                "Sheet loaded successfully");
            }

        }

        catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static String getCellData(
            int row,
            int column) {

        try {

            if (sheet == null) {

                System.out.println(
                "Sheet is NULL");

                return "";
            }

            if (sheet.getRow(row) == null) {

                System.out.println(
                "Row is NULL");

                return "";
            }

            if (sheet.getRow(row)
                    .getCell(column) == null) {

                System.out.println(
                "Cell is NULL");

                return "";
            }

            DataFormatter formatter =
                    new DataFormatter();

            return formatter
                    .formatCellValue(
                    sheet.getRow(row)
                    .getCell(column));

        }

        catch (Exception e) {

            e.printStackTrace();

            return "";
        }
    }

    public static void closeWorkbook() {

        try {

            workbook.close();

        }

        catch (Exception e) {

            e.printStackTrace();
        }
    }
}