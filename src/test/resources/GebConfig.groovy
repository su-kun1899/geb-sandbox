/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/configuration.html
*/
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.os.ExecutableFinder

import static org.apache.commons.lang3.SystemUtils.IS_OS_LINUX
import static org.apache.commons.lang3.SystemUtils.IS_OS_MAC

static File findDriverExecutable() {
    def defaultExecutable = new ExecutableFinder().find("chromedriver")
    if (defaultExecutable) {
        new File(defaultExecutable)
    } else {
        new File("drivers").listFiles().findAll {
            !it.name.endsWith(".version")
        }.find {
            if (IS_OS_LINUX) {
                it.name.contains("linux")
            } else if (IS_OS_MAC) {
                it.name.contains("mac")
            }
        }
    }
}

//noinspection GroovyUnusedAssignment
driver = {
    ChromeDriverService.Builder serviceBuilder = new ChromeDriverService.Builder()
            .usingAnyFreePort()
            .usingDriverExecutable(findDriverExecutable())
    def options = new ChromeOptions()
    // secret mode
    options.addArguments('--incognito')
    // headless mode
    options.addArguments('--headless')
    new ChromeDriver(serviceBuilder.build(), options)
}

//noinspection GroovyUnusedAssignment
baseUrl = "http://gebish.org"
