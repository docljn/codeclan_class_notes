# test.rb

def test_one_plus_one
  expected = 2
  actual = 1 + 1
  assert_equal(expected, actual)
end

# TDD means writing the test which will tell us what production code we need.



# TDD APPROACH
# You need to be confident that your tests are verifying what you need them to.
# If you write the code first, you only see passing tests, so you don't know whether the test can fail.
# If you write the test first, you see it fail, write the code, and can be certain that the code is what made the test pass.
# Red - Green - Refactor - Refactor Test?
