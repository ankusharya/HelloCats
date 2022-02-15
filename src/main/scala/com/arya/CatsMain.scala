package com.arya

import cats.effect.{ExitCode, IO, IOApp, Sync}

object CatsMain extends IOApp{

  override def run(args: List[String]): IO[ExitCode] = PlayGame.program.as(ExitCode.Success)
}
