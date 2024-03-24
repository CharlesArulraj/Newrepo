package Playwright.PageTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TestDemo {
@Test
public void r()
{
	final Playwright playwright=Playwright.create();
	final Browser browser=playwright.chromium().launch();
	final Page page=browser.newPage();
	page.navigate("https://www.google.com");
	final String pagetitle=page.title();
	AssertJUnit.assertEquals(pagetitle,"Google");
	browser.close();
}
@Test
public void r2()
{
	final Playwright playwright=Playwright.create();
	final Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000).setChannel("chrome"));
	final Page page=browser.newPage();
	page.navigate("https://amazon.in");
	final String pagetitle=page.title();
	AssertJUnit.assertEquals(pagetitle,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    browser.close();
	}
}
	