# calc_rank

## Description

This is a simple scala cli that is used to demonstrate a simple and composable ranking application.

## Usage

use docker to run the application with the ./src/test/resources/correct_input.txt file as input.

```shell
docker build -t calculator .
docker run -d calculator
```

If you would like to run the application locally please install [sbt](https://www.scala-sbt.org/) 
and run

```shell
sbt "run /app/src/test/resources/correct_input.txt"
```
where you can replace `/app/src/test/resources/correct_input.txt` with path.