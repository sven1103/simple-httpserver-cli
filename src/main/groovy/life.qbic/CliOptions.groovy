package life.qbic

import picocli.CommandLine.Option;

class CliOptions {

    @Option(names = ["-p", "--port"], description = "port for the webserver to listen to.")
    protected Integer port = 4567

    @Option(names = ["-r", "--route"], description = "route for the webserver to bind to.")
    protected String route = "/"

    @Option(names = ["-h", "--help"], usageHelp = true, description = "display a help message")
    protected boolean helpRequested = false

}
