class River

  attr_reader :name, :contents #needed so bear can select a fish

  def initialize(name, *contents)
    @name = name
    @contents = contents || []  # not sure if this is valid syntax, but it seems to work, so...?
  end

  def count_fish
    return @contents.length
  end


  def stock_river(one_fish)
    @contents.push(one_fish)
  end

 def remove_fish(fish)
   @contents.delete(fish)
 end

 def sample_contents
   @contents.sample
 end


end
