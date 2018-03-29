class BusStop

  attr_reader :name, :queue


  def initialize(name)
    @name = name
    @queue = []
  end

  def num_of_passengers_in_queue()
    return @queue.length
  end

  def arrive(passenger)
    @queue.push(passenger)
  end

  def empty()
    @queue = []
    # not ideal - really want to get people off one by one
  end

# alternative bus.pick_up method needs
  # def yield_passenger()
  #   return @queue.shift()
  # end





end
