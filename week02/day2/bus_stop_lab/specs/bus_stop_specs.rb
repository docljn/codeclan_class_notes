require("minitest/autorun")
require("minitest/rg")
require_relative("../bus_stop")
require_relative("../person")

class TestBusStop < MiniTest::Test

  def setup
    @bus_stop = BusStop.new("Usher Hall")
    @person1 = Person.new("Robert", 32)
  end


  def test_bus_stop_name
    assert_equal("Usher Hall", @bus_stop.name)
  end

  def test_bus_stop_queue
    assert_equal(0, @bus_stop.queue.length)
  end

  def test_arrive
    @bus_stop.arrive(@person1)
    assert_equal(1, @bus_stop.num_of_passengers_in_queue)
  end

  def test_pick_up_from_stop
    @bus_stop.arrive(@person1)
    @bus_stop.empty()
    assert_equal(0, @bus_stop.queue.length)
  end

  # tests added by tutors

  def test_pick_up_from_stop__multiple_people()
    @bus = Bus.new(22, "Ocean Terminal")
    @passenger1 = Person.new("John", 30)
    @passenger2 = Person.new("Mary", 63)
    @passenger3 = Person.new("Bob", 40)

    @stop1 = BusStop.new("Elm Row")
    @stop1.add_to_queue(@passenger1)
    @stop1.add_to_queue(@passenger2)
    @bus.pick_up_from_stop(@stop1)
    assert_equal(2, @bus.passenger_count())
    assert_equal(0, @stop1.queue_length())
  end

  def test_pick_up_from_stop__bus_does_not_start_empty()
    @bus = Bus.new(22, "Ocean Terminal")
    @passenger1 = Person.new("John", 30)
    @passenger2 = Person.new("Mary", 63)
    @passenger3 = Person.new("Bob", 40)

    @bus.pick_up(@passenger3)
    @stop1 = BusStop.new("Elm Row")
    @stop1.add_to_queue(@passenger1)
    @stop1.add_to_queue(@passenger2)
    @bus.pick_up_from_stop(@stop1)
    assert_equal(3, @bus.passenger_count())
  end

end
