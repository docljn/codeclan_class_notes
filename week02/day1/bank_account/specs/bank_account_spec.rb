# bank_account_spec.rb
require("minitest/autorun")
require("minitest/rg")


# [append --rg to end of "ruby filename.rb" call in terminal]

require_relative("../bank_account")

class MyFunctionsTest < MiniTest::Test

  def setup
    # replaces the first line of the tests below
    @bank_account = BankAccount.new("John", 500, "business")
    @bank_account_personal = BankAccount.new("Jemima", 500, "personal")
    @bank_account_business = BankAccount.new("Jeeves", 500, "business")
  end


# TEST FUNCTION NAMING
# must start with "test_"

  # # This works when you don't understand classes.
  # def test_account_name
  #   account = {
  #     holder_name: "John",
  #     amount: 500,
  #     type: "business"
  #   }
  #   assert_equal("John", get_account_name(account))
  # end

  # # Redo using classes.

  # getters
  def test_account_name
    bank_account = BankAccount.new("John", 500, "business")
    assert_equal("John", bank_account.holder_name)
  end

  def test_account_balance
    bank_account = BankAccount.new("John", 500, "business")
    assert_equal(500, bank_account.balance)
  end

  def test_account_type
    bank_account = BankAccount.new("John", 500, "business")
    assert_equal("business", bank_account.type)
  end

  # setters (method name is "method=")
  def test_set_holder_name
    bank_account = BankAccount.new("John", 500, "business")
    bank_account.holder_name=("Joanna")
    assert_equal("Joanna", bank_account.holder_name)
  end

  def test_set_balance
    bank_account = BankAccount.new("John", 500, "business")
    bank_account.balance=(1000)
    assert_equal(1000, bank_account.balance)
  end

  def test_set_type
    bank_account = BankAccount.new("John", 500, "business")
    bank_account.type=("personal")
    assert_equal("personal", bank_account.type)
  end


  # modifying information - using setup method instead of
  # BankAccount.new
  def test_pay_into_account
    @bank_account.pay_in(100)
    assert_equal(600, @bank_account.balance)
  end

  def test_pay_monthly_fee__business
    @bank_account_business.pay_monthly_fee
    assert_equal(450, @bank_account_business.balance)
  end

  def test_pay_monthly_fee__personal
    @bank_account_personal.pay_monthly_fee
    assert_equal(490, @bank_account_personal.balance)
  end




end

# end of bank_account_spec.rb
