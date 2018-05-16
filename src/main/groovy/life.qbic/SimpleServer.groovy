package life.qbic

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import static spark.Spark.*

class SimpleServer {

    public static Logger log = LoggerFactory.getLogger(SimpleServer.class)

    SimpleServer(Integer aport, String route){
        port(aport)
        post(route, { req, res ->
            log.info(req.userAgent())
            log.info(req.contentType())
            log.info(JsonOutput.prettyPrint(req.body()))

            try{
                JsonSlurper slurper = new JsonSlurper()
                def result = slurper.parseText(req.body())
                log.info("Run name was: ${result.runName}")
            } catch (Exception e){
                res.type("text/plain")
                res.status(404)
                return e.getCause()
            }
            res.type("text/plain")
            res.status(200)
            return "I handled the request successfully!"
        })
    }
}
