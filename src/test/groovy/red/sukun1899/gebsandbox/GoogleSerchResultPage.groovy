package red.sukun1899.gebsandbox

import geb.Page

/**
 * @author su-kun1899
 */
class GoogleSerchResultPage extends Page{
    static url = "https://www.google.co.jp/search"
    static at = { title.endsWith(" - Google 検索") }
    static content = {
//        searchButton { $("input", type: "submit", name: "btnK") }
    }
}
