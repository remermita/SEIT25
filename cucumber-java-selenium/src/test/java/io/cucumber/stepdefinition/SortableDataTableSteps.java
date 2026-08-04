package io.cucumber.stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.pageobject.SortableDataTable;
import io.cucumber.utils.Context;
import io.cucumber.utils.Manager;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class SortableDataTableSteps extends Context {
    SortableDataTable sortableDataTable = new SortableDataTable(getDriver());

    public SortableDataTableSteps(Manager manager) {
        super(manager);
    }

    @Then("^the table should display the expected results$")
    public void validateTableResults(DataTable table) {
        List<Map<String, String>> expectedTable = table.asMaps();
        List<Map<String, String>> actualTable = sortableDataTable.getTableData();
        Assert.assertEquals(expectedTable, actualTable);
        System.out.println("Expected Table:" + expectedTable);
        System.out.println("Actual Table:" + actualTable);
    }
}
