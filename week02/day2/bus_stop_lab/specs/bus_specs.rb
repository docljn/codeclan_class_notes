require("minitest/autorun")
require("minitest/rg")
require_relative("../bus")
require_relative("../person")
require_relative("../bus_stop")

class TestBus < MiniTest::Test

  def setup
    @bus = Bus.new(22, "Oceans Terminal")
    @person1 = Person.new("Robert", 32)
    @person2 = Person.new("Zsolt", 32)
    @bus_stop = BusStop.new("Usher Hall")
  end

  def test_drive
    assert_equal("Brum Brum", @bus.drive())
  end

  def test_passengers_on_bus
    assert_equal(0, @bus.passengers_on_bus())
  end

  def test_pick_up
    @bus.pick_up(@person1)
    assert_equal(1, @bus.passengers_on_bus)
  end

  def test_drop_off
    @bus.pick_up(@person1)
    @bus.pick_up(@person2)
    @bus.drop_off(@person1)
    assert_equal(1, @bus.passengers_on_bus)
  end

  def test_bus_can_be_emptied
    @bus.pick_up(@person1)
    @bus.pick_up(@person2)
    @bus.empty()
    assert_equal(0, @bus.passengers_on_bus)
  end

  def test_pick_up_from_stop
    @bus_stop.arrive(@person1)
    @bus.pick_up_from_stop(@bus_stop)
    assert_equal(1, @bus.passengers_on_bus)
    assert_equal(0, @bus_stop.num_of_passengers_in_queue)
  end



end
