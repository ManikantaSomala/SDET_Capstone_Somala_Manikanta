import time
from lib2to3.pgen2 import driver

import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.remote.webdriver import WebDriver

from selenium_utils import find_element, click_element, verify_text, verify_user, click_Login, click_toggle

@pytest.fixture
def browser():
    driver:WebDriver = webdriver.Chrome()
    driver.maximize_window()
    yield driver
    driver.quit()
def test_saucedemo_scenario(browser):
    # 1. Launch the URL
    browser.get("https://www.saucedemo.com/")

    # 2. Verify SWAG LABS is present on the Web Page
    verify_text(browser, By.CLASS_NAME, "login_logo", "Swag Labs")

    # 3. Enter username
    verify_user(browser, By.ID, "user-name", "standard_user")

    # 4. Enter password
    verify_user(browser, By.ID, "password", "secret_sauce")

    # 5. Click login
    click_Login(browser, By.ID, "login-button")

    # 6. Add any one item to cart
    click_element(browser, By.CLASS_NAME, "btn_inventory")

    # 7. Verify item is added to the cart
    time.sleep(2)  # Wait for the cart count to update
    cart_item = find_element(browser, By.CLASS_NAME, "shopping_cart_badge")
    assert cart_item.text == "1"  # Assuming the cart displays the count of items added

    # 8. Click on the cart
    cart_item.click()
    time.sleep(2)

    # 9. Open the menu
    click_toggle(browser, By.ID, "react-burger-menu-btn")
    time.sleep(1)

    # 10. Click on LOGOUT button
    logout_button = find_element(browser, By.ID, 'logout_sidebar_link')
    logout_button.click()

    time.sleep(5)  # Let's wait for a moment to ensure the logout is performed successfully
