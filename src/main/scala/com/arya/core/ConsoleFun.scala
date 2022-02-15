package com.arya.core

import cats.effect.IO

object ConsoleFun {
  def printToConsole(str: String): IO[Unit] = IO.println(str)//Task(println(str)) // implementation

  def readFromConsole(): IO[String] = IO(scala.io.StdIn.readLine()) // implemntions

}
