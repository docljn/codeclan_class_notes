# Quiz

1. What does DOM stand for?
  - Document Object Model

2. What is the name of the object we can use to get information about the browser environment?
  - window object?

3. What is the name of the object that we can use to get access to the DOM representation of the page?
  - document object

4. What type of files might we see in the Network tab for Chrome devTools?
  - lots! images, xml, js, html...

5. What version of HTML is document.querySelector from?
  - HTML5

6. Which event do we hook into when we want to know the DOM has loaded, window.onload or document.onload?
  - window.onload

7. What other way do we have a hooking into the DOM load event, and how does it differ?
  - .createEventListener("DOMContentLoaded", functionToCall);
  - it differs because the page hasn't fully loaded [no images, stylesheets, subframes etc], you can have multiple events triggered by the eventListener

8. We use window.createElement to make new DOM elements, true or false?
  - false [document.createElement()]

9. List two ways to get all the elements by class 'cat'
  - .getElementsByClassName("cat")
  - .querySelector(".cat")

10. List two ways to retrieve the element with id "goat"
  - .getElementById("goat")
  - .querySelector("#goat")

11. List two ways to get all the li elements
  - .getElementsByTagName("id");
  - .querySelectorAll("id");

12. List two ways to get the first li element
  - .getElementsByTagName("li")[0];
  - .querySelector("li");

13. How can we set the a given element to be hidden?
  - element.hidden = true;
  - element.style.display = "none"; [no placeholder]
  - element.style.visibility = "hidden"; [placeholder]
