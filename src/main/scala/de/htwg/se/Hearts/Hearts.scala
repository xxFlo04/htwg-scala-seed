package de.htwg.se.Hearts

import de.htwg.se.Hearts.model.Player

object YourGame {
  def main(args: Array[String]): Unit = {
    val student = Player("Your Name")
    println("Hello, " + student.name)
  }
}
