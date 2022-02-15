package com.arya

import cats.effect.{Async, IO, kernel}

object PlayGame {

  def program: IO[Unit] = for {
    _ <- HelloUser.program
    _ <- GuessTheNumber.program
  } yield ()

}
