package interfacesegregation

class Main {

}

object Main {
  def main(args: Array[String]): Unit = {
    val parrot = new Parrot
    parrot.eat()
    val ostrich = new Ostrich
    ostrich.eat()
    val penguin = new Penguin
    penguin.eat()
  }
}
