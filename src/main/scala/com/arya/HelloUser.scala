package com.arya

import cats.effect.{ExitCode, IO}
import com.arya.core.ConsoleFun._
object HelloUser { // Get username and say hello

  // Requirement / business logic
  val program: IO[Unit] = for {
    _ <- printToConsole("Hi, User\n What is your name?")
    name <- readFromConsole()
    _ <- printToConsole("Welcome " + name)
  } yield ()


}
