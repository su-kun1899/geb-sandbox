package red.sukun1899.gebsandbox

import geb.spock.GebSpec
/**
 * @author su-kun1899
 */
class GoogleSearchSpec extends GebSpec {
    def "Googleのトップページを表示する"() {
        when:
        to GoogleTopPage

        then:
        at GoogleTopPage
    }

    def "検索結果ページに遷移する"() {
        when:
        to GoogleTopPage

        and:
        searchTextBox.value("ヤフー")
        searchButton.click()

        then:
        at GoogleSerchResultPage
    }
}
