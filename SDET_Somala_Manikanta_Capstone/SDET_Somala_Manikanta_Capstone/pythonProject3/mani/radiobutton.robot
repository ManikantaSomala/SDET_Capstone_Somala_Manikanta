*** Settings ***
Library  SeleniumLibrary

*** Variables ***
${url}    https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm
${browser}    chrome

*** Test Cases ***
checking radio buttons and check boxes
        open browser  ${url}    ${browser}
        maximize browser window

      # Selecting the radio buttons
        Select radio button    sex   Male
        Sleep   3
        Select radio button    exp    6
        Sleep   2
        Select checkbox   Automation Tester

*** Variables ***





