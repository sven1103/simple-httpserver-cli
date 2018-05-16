# simple-httpserver-cli
A super simple jetty HTTP server with Spark framework, that just prints incoming HTTP POST requests. 

## Run

Download the application release, unzip it and run the script in the `bin` directory:

```bash

> ./simple-webserver-cli -h
Usage: <main class> [-h] [-p=<port>] [-r=<route>]
  -h, --help                  display a help message
  -p, --port=<port>           port for the webserver to listen to.
  -r, --route=<route>         route for the webserver to bind to.

```
Default port is `4567`, default route is `/`.

Have fun!
