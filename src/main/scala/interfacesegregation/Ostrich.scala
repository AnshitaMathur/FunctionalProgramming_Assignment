package interfacesegregation

class Ostrich extends Bird with RunnerBird {
  override def eat(): String = "Ostrich eats snake"

  override def run(): String = "Ostrich runs very fast"
}
