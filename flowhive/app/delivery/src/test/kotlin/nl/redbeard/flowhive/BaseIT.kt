package nl.redbeard.flowhive

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.context.annotation.Import

@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    classes = [FlowHiveApp::class])
abstract class BaseIT {
    @LocalServerPort
    var port: Int = 0
}