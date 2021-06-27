package com.testclass;

import core.BaseTest;
import org.apache.commons.io.FileUtils;
import org.jsoup.select.Collector;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ScrapeLinksOnYahoo extends BaseTest {


    public ScrapeLinksOnYahoo() throws FileNotFoundException {
    }

    @Test(description = "Opens Yahoo and scrpes links", priority = 1)
    public void test001_OpenMoneyControl() throws Exception {
        pageController.yahooLandingPage()
                      .gotoLandingPage(rx.readConfig().get("yahooUrl"));
        pageController.yahooLandingPage().createListOfLinks();
    }
}





