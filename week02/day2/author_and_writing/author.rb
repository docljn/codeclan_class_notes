# author.rb

class Author

  attr_reader :name

  # INITIAL SETUP WITH A SINGLE CLASS

  # This gives the author too much responsibility to keep track of the writing tool, the writing tool type, the writing tool name etc
  # A simpler option would be to have a separate writing tool class
  # The author then has access to a writing tool object - an instance of the class; and that can be swapped out easily.
  # In effect, you are delegating responsibility to a second class.

  # def initialize(name, writing_tool_name, writing_tool_type)
  #   @name = name
  #   @writing_tool_name = writing_tool_name
  #   @writing_tool_type = writing_tool_type
  # end
  #
  # def write(written_work)
  #   if @writing_tool_type == "typewriter"
  #     return "#{written_work}, with old school click clacking."
  #   else
  #     return written_work
  #   end
  # end

  # MULTI CLASS SETUP

  def initialize(name, writing_tool)
    # things the author needs to keep track of
    @name = name
    @writing_tool = writing_tool
  end

  def write(written_work)
    # pass in the object writing_tool, as an instance variable
    # use the writing object method type_out
    # the argument for the method type_out is the write parameter written_work
    # the object writing_tool comes with all the methods defined on it
    return @writing_tool.type_out(written_work)
  end

end


# end of author.rb
