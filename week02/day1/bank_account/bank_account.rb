# bank_account.rb


# # This works when you don't understand classes
# def get_account_name(account)
#   return account[:holder_name]
# end

class BankAccount

  # getters and setters [methods] can be replaced by:
  # attr_reader :holder_name, :balance, :type  # read only
  # attr_writer :holder_name, :balance, :type  # write only
  attr_accessor(:holder_name, :balance, :type)  # read/write
  # all these instance variables are now both readable and writeable
  # not always a good thing!

# constructor method
  def initialize(holder_name, balance, type)
    # assign instance variables: specific to one instance of the class
    # i.e. on aspecific bank account
    # instance variables are encapsulated within the class: not visible or accessible outside the class.
    # good practice to declare all instance variables here
    @holder_name = holder_name
    @balance = balance
    @type = type
  end

# # getter methods
#   # convention is you don't inlude "get" in the method name
#   def holder_name
#     return @holder_name
#   end
#
#   def balance
#     return @balance
#   end
#
#   def type
#     return @type
#   end
#
#   # setter methods
#   def set_holder_name(new_name)
#     @holder_name = new_name
#   end
#
#   def set_balance(new_balance)
#     @balance = new_balance
#   end
#
#   def set_type(new_type)
#     @type = new_type
#   end

# modifying information
  def pay_in(deposit_amount)
    @balance += deposit_amount
  end

  def pay_monthly_fee
    @balance -= 50 if @type == "business"
    @balance -= 10 if @type == "personal"

  end




end

# end of bank_account.rb
