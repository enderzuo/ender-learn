import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.FileAppender

def logHomeDirectory = "c:/logs/printer"

appender("AUDIT_FILE", FileAppender) {
	file = "${logHomeDirectory}debug.log"
	encoder(PatternLayoutEncoder) { pattern = "%-5level %logger{36} - %msg%n" }
}

appender("ERROR_FILE", FileAppender) {
	file = "${logHomeDirectory}error.log"
	encoder(PatternLayoutEncoder) { pattern = "%-5level %logger{36} - %msg%n" }
}

logger("com.ender.learn.logback.exception", ERROR , ["ERROR_FILE"])

logger("com.ender.learn.logback", DEBUG , ["AUDIT_FILE"])
