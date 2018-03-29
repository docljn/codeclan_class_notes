# person.rb
# superclass

class Person

  attr_reader :first_name, :last_name
  # only needed for test_person_has_names
  # could remove that test as the talk test uses the same information

  def initialize(first_name, last_name)
    @first_name = first_name
    @last_name = last_name
  end

  def talks()
    return "#{@first_name} #{@last_name}"
  end

end


# person.rb
