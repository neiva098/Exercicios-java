
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Cell;
import jxl.CellType;
import jxl.CellView;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;
import jxl.write.Formula;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class XLS{

    private String inputArquivo;

    public  void setInputFile(String inputArquivo) {
    this.inputArquivo = inputArquivo;
}
    public String leitura() throws IOException  {
        File inputWorkbook = new File(inputArquivo);
        Workbook w;
        String s="";
        try {
        w = Workbook.getWorkbook(inputWorkbook);
        // Obtem a primeira folha
        Sheet sheet = w.getSheet(0);
        for (int j = 0; j < sheet.getColumns(); j++) {s=s+"\n";
        for (int i = 0; i < sheet.getRows(); i++) {
        Cell cell = sheet.getCell(j, i);
        CellType type = cell.getType();
        if(i>=2)
            s=s+"  ";
        s=" "+s+cell.getContents();
        }
        }
        } catch (BiffException e) {
        e.printStackTrace();
        }
        return s;
        }

}
