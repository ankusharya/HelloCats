package com.arya

import cats.effect.IO

import scala.util.Random
import com.arya.core.ConsoleFun._

object GuessTheNumber {

  def loop(computerNumber: Int): IO[String] = for {
    _ <- printToConsole("Please enter a number")
    number <- readFromConsole().map(x => x.toInt)// number in in string format

    matched <- if(number == computerNumber){
      IO("You are the winner")
    } else if(number < computerNumber){
      IO.println("Go Higher").flatMap(_ => loop(computerNumber))
    } else {
      IO.println("Go Lower").flatMap(_ => loop(computerNumber))
    }
  } yield matched

  def program: IO[Unit] = for {
    _ <- printToConsole("I am guessing a number...")
    computerNumber <- IO(Random.nextInt(100))
    _ <- printToConsole("Guessing is complete")
    // looping
   matched <- loop(computerNumber)
    _ <- printToConsole(matched)
  } yield ()

}
