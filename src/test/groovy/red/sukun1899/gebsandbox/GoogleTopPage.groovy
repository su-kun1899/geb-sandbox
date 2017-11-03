package red.sukun1899.gebsandbox

import geb.Page

/**
 * @author su-kun1899
 */
class GoogleTopPage extends Page {
    static url = "http://www.google.com"
    static at = { title == "Google"}
}
