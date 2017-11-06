package red.sukun1899.gebsandbox

import geb.Page

/**
 * @author su-kun1899
 */
@SuppressWarnings("GroovyUnusedDeclaration")
class GoogleSearchResultPage extends Page{
    static url = "https://www.google.co.jp/search"
    static at = { title.endsWith(" - Google 検索") }
    static content = {
        firstResult { $("input", type: "submit", name: "btnK") }
    }
}
