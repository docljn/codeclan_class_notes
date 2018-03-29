class Bus

  attr_reader :bus_number, :destination

  def initialize(bus_number, destination)
    @bus_number = bus_number
    @passengers = []
    @destination = destination
  end

  def drive()
    return "Brum Brum"
  end

  def passengers_on_bus()
    return @passengers.length
  end

  def pick_up(passenger)
    @passengers.push(passenger)
  end

  def drop_off(passenger)
    @passengers.delete(passenger)
  end

  def empty()
    @passengers = []
    # for passenger in @passengers
    #   drop_off(passenger)
    # end
  end

  def pick_up_from_stop(bus_stop)
    queue = bus_stop.queue()
    for passenger in queue
      pick_up(passenger)
    end
    bus_stop.empty
    # feels like a mixture of responsibilities...?
  end

  # Alternative method:

  # def pick_up_from_stop(stop)
  #   while stop.queue.length > 0 do
  #     pickup(stop.yield_passenger)
  #   end
  # end





end
