package red.sukun1899.gebsandbox

import geb.Page

/**
 * @author su-kun1899
 */
@SuppressWarnings("GroovyUnusedDeclaration")
class GoogleTopPage extends Page {
    static url = "https://www.google.co.jp/"
    static at = { title == "Google" }
    static content = {
        searchTextBox { $("input", type: "text", name: "q") }
        searchButton { $("#sbtc > div.gstl_0.sbdd_a > div:nth-child(2) > div.sbdd_b > div > ul > li:nth-child(9) > div > span:nth-child(1) > span > input") }
    }

    void search(String query) {
        searchTextBox.value(query)
        interact {
            moveToElement searchButton
        }
        searchButton.click()
    }
}
