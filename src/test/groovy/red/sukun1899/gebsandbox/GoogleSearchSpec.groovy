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

    def "ヤフーと入力して検索すると結果ページに遷移する"() {
        given:
        def queryWord = "ヤフー"
        to GoogleTopPage

        when:
        searchTextBox.value(queryWord)
        searchButton.click()

        then:
        at GoogleSerchResultPage
        title.startsWith(queryWord)
    }
}
