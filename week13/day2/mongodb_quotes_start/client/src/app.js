const QuoteView = require("./views/quoteView");
const Request = require("./services/request");

const quoteView = new QuoteView();
const request = new Request("http://localhost:3000/api/quotes");


const createRequestComplete = function (newQuote) {
  quoteView.addQuote(newQuote);
};

const deleteRequestComplete = function () {
  quoteView.clear();
};

const createButtonClicked = function (event) {
  event.preventDefault(); //don't reload the page

  const nameInput = document.querySelector("#name");
  const quoteInput = document.querySelector("#quote");


  const quoteToSend = {
    name: nameInput.value,
    quote: quoteInput.value
  };

  nameInput.value = "";
  request.post(createRequestComplete, quoteToSend);

};

const deleteButtonClicked = function () {
  request.delete(deleteRequestComplete);
};

// This is where the stuff actually gets run!
const appStart = function(){
  request.get(getQuotesRequestComplete);

  const createQuoteButton = document.querySelector("#submit-quote");
  createQuoteButton.addEventListener("click", createButtonClicked);

  const deleteButton = document.querySelector("#deleteButton");
  deleteButton.addEventListener("click", deleteButtonClicked);
};



const getQuotesRequestComplete = function (allQuotes) {
  allQuotes.forEach( function (quote) {
    quoteView.addQuote(quote);
  });

};

document.addEventListener("DOMContentLoaded", appStart);
