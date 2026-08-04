package io.cucumber.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class SortableDataTable extends Page {


    public SortableDataTable(ChromeDriver driver) {
        super(driver);
    }

    private List<String> getHeaders() {
        List<WebElement> headerNames = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        List<String> headers = new ArrayList<>();
            for (WebElement name : headerNames) {
                headers.add(name.getText());
            }
            return headers;
    }

    private List<WebElement> getRows() {
        return driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
    }

    private Map<String, String> rowMap(WebElement row, List<String> headers) {
        List<WebElement> rowCells = row.findElements(By.xpath(".//td"));
        Map<String, String> map = new LinkedHashMap<>();
            for(int i = 0; i < headers.size() - 1; i++) {
                map.put(headers.get(i), rowCells.get(i).getText());
            }
        return map;
    }

    public List<Map<String, String>> getTableData() {
        List<String> headers = getHeaders();
        List<WebElement> rows = getRows();
        List<Map<String, String>> tableData = new ArrayList<>();

        for (WebElement row : rows) {
            tableData.add(rowMap(row, headers));
        }
        return tableData;
    }
}
