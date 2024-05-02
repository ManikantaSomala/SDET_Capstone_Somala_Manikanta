*** Settings ***
Library  SeleniumLibrary

*** Variables ***
${url}    https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm
${browser}    chrome

*** Test Cases ***
Dropdown

      open browser    ${url}    ${browser}
      maximize browser window

     #selecting from the Dropdown menu

      select from list by label    continents    Asia
      sleep    3
      select from list by index    continents    6
      sleep    3

     close browser

