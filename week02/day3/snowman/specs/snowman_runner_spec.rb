

require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative( '../snowman_runner.rb' )



class TestRunner < MiniTest::Test


end

# ## Advanced Extension
#
# * Make a `Runner` file to run the game in Terminal:
#   * Ask a user to input a secret word
#   * Hide the secret word from the player <- *Hint: research how to clear the Terminal screen in Ruby*
#   * Play the game! Collect guesses typed in by the player, process guesses with your `Game` methods, and display appropriate messages to turn your classes into a working game!

# Rules of Snowman
# A user enters a word or phrase:
# This is then hidden or obscured, and presented to the player:
#  * replaces each letter, spaces are maintained
# if a letter is guessed correctly, that letter is revealed
# if a letter is guessed incorrectly, player loses a life
