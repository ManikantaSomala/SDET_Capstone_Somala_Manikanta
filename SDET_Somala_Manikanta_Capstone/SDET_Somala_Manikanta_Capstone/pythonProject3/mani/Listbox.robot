*** Settings ***
Library  SeleniumLibrary

*** Variables ***
${url}    https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm
${browser}    chrome

*** Test Cases ***
listbox
       open browser    ${url}    ${browser}
       maximize browser window

       #selecting items from listbox
       select from list by label    selenium_commands    Navigation Commands
       sleep   3
       select from list by index    selenium_commands    4
       sleep    3
       close browser

*** Keywords ***
