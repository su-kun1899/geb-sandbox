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
}
