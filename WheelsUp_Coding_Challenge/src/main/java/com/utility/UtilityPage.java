package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.basepage.BasePage;

public class UtilityPage extends BasePage {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 15;
	public static String TESTDATA_SHEET_PATH1 = "\\TestData\\WheelsUPData.xlsx";
	static Workbook book;
	static Sheet sheet;

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			String workingDir = System.getProperty("user.dir");
			System.out.println(workingDir + TESTDATA_SHEET_PATH1);
			file = new FileInputStream(workingDir + TESTDATA_SHEET_PATH1);
		} catch (FileNotFoundException e) {
			System.out.println("UtilTest: FileInputStream failed " + e.getMessage());
			e.printStackTrace();
		}
		try {
			System.out.println("WorkbookFactory create " + file);
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			System.out.println("UtilTest: WorkbookFactory create failed " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("UtilTest: WorkbookFactory create failed " + e.getMessage());
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println(sheet.getLastRowNum() + "--------" + sheet.getRow(0).getLastCellNum());

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				try {
					data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				} catch (Exception e) {
					data[i][k] = "";
				}
				//System.out.println(data[i][k]);
			}
		}

		System.out.println("data returning");

		return data;
	}

	public static WebElement getExplicitWait(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
		return element1;
	}

	public boolean isElementPresent(WebElement element, WebDriver driver, long timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void drawBorder(WebElement webelement, String color) {
		WebElement element_node = webelement;
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='3px solid " + color + "'", element_node);

	}

}
