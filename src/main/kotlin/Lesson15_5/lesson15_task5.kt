package org.example.Lesson15_5

interface Movable {
    fun move()
}

interface PassengerTransport {
    fun loadPassengers(count: Int): Boolean
    fun unloadPassengers(count: Int): Boolean
}

interface CargoTransport {
    fun loadCargo(weight: Double): Boolean
    fun unloadCargo(weight: Double): Boolean
}

class Truck(private val maxCargoWeight: Double, private val maxPassengers: Int) : Movable, PassengerTransport,
    CargoTransport {
    private var currentCargoWeight: Double = 0.0
    private var currentPassengers: Int = 0

    override fun move() {
        println("Грузовик едет с $currentPassengers пассажирами и грузом $currentCargoWeight тонн.")
    }

    override fun loadPassengers(count: Int): Boolean {
        return if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            true
        } else {
            println("Невозможно загрузить $count пассажиров. Превышен лимит.")
            false
        }
    }

    override fun unloadPassengers(count: Int): Boolean {
        return if (currentPassengers >= count) {
            currentPassengers -= count
            true
        } else {
            println("Невозможно выгрузить $count пассажиров. В машине только $currentPassengers пассажиров.")
            false
        }
    }

    override fun loadCargo(weight: Double): Boolean {
        return if (currentCargoWeight + weight <= maxCargoWeight) {
            currentCargoWeight += weight
            true
        } else {
            println("Невозможно загрузить $weight тонн. Превышен лимит.")
            false
        }
    }

    override fun unloadCargo(weight: Double): Boolean {
        return if (currentCargoWeight >= weight) {
            currentCargoWeight -= weight
            true
        } else {
            println("Невозможно выгрузить $weight тонн. В машине только $currentCargoWeight тонн груза.")
            false
        }
    }
}

class Car(private val maxPassengers: Int) : Movable, PassengerTransport {
    private var currentPassengers: Int = 0

    override fun move() {
        println("Легковая машина едет с $currentPassengers пассажирами.")
    }

    override fun loadPassengers(count: Int): Boolean {
        return if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            true
        } else {
            println("Невозможно загрузить $count пассажиров. Превышен лимит.")
            false
        }
    }

    override fun unloadPassengers(count: Int): Boolean {
        return if (currentPassengers >= count) {
            currentPassengers -= count
            true
        } else {
            println("Невозможно выгрузить $count пассажиров. В машине только $currentPassengers пассажиров.")
            false
        }
    }
}

fun main() {

    val truck = Truck(maxCargoWeight = 2.0, maxPassengers = 1)
    val car = Car(maxPassengers = 3)

    car.loadPassengers(3)
    car.move()
    car.unloadPassengers(3)
    car.move()

    truck.loadPassengers(1)
    truck.loadCargo(2.0)
    truck.move()
    truck.unloadCargo(2.0)
    truck.unloadPassengers(1)
    truck. move()
}