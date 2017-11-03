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
        searchButton { $("input", type: "submit", name: "btnK") }
    }
}
