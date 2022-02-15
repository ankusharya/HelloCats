package com.arya

import cats.effect.unsafe.implicits.global
import cats.effect.{IO, Sync}


object CatsBasicMain {




  def main(args: Array[String]): Unit= {


    val program: IO[Unit] = IO(println("Cats Basic")).flatMap(_ => IO.println("Cats Basic 2"))

   program.unsafeRunSync()


  }

}
