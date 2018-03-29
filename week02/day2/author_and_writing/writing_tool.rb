# writing_tool.rb
class WritingTool

  attr_reader :name

  def initialize(name, tool_type)
    @name = name
    @tool_type = tool_type
  end

  def type_out(written_work)
    # this method is called from the *AUTHOR.RB* file in the method .write
    # the method was extracted from the original author.write method
    if @tool_type == "typewriter"
        return "#{written_work}, with old school click clacking."
      else
        return written_work
      end
  end


end


# end writing_tool.rb
