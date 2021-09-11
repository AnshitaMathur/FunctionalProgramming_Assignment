package liskovsubstitution


class Vehicle {
  def start(): String = "Starting a vehicle"

  def stop(): String = "Stopping a vehicle"
}

class Bike extends Vehicle {
  override def start(): String = "Starting a Bike"

  override def stop(): String = "Stopping a Bike"

}

class Car extends Vehicle {
  override def start(): String = "Starting a Car"

  override def stop(): String = "Stopping a Car"
}


object Liskov {
  val printer=(message : String) => {
    println(message)
  }
  def testDrive(vehicle: Vehicle): Unit = {
    printer(vehicle.start())
    printer(vehicle.stop())
  }

  def main(args: Array[String]): Unit = {
    testDrive(new Vehicle)
    testDrive(new Bike)
    testDrive(new Car)
  }
}


