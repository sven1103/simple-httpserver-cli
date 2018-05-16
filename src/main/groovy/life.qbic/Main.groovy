package life.qbic

import picocli.CommandLine

class Main {

    static void main(String[] args){

        CliOptions cmd = new CliOptions()
        new CommandLine(cmd).parse(args)

        if (cmd.helpRequested){
            CommandLine.usage(new CliOptions(), System.out)
            System.exit(0)
        }

        new SimpleServer(cmd.port, cmd.route)


    }

}
