// const app = function() {
//   console.log("Loaded");
//   const id_tagline = document.getElementById('tagline');
//   id_tagline.style.backgroundColor = 'yellow';
// };
//
// const blue = function () {
//   const articles = document.getElementsByTagName("article");
//   for (let i = 0; i < articles.length; i++) {
//     articles[i].style.backgroundColor = "DodgerBlue";
//   }
// };
//
// const hide = function () {
//   const quote_of_the_day = document.getElementById("quote-of-the-day");
//   quote_of_the_day.hidden = true;
// };
//
// document.addEventListener("DOMContentLoaded", app);
//
// document.addEventListener("DOMContentLoaded", blue);
// document.addEventListener("DOMContentLoaded", hide);

const QUOTES_ARRAY = [
  {text: "<goes on some tangent>", author: "Alex"},
  {text: "I'm running late", author: "Various"}
];

const addQuote = function (quote, author) {

  //1. Create the parent container and its class
  const quoteArticle = document.createElement("article");
  quoteArticle.classList.add("quote");

  //2. Create the first child (blockquote)
  const blockquote = document.createElement("blockquote");
  blockquote.innerText = quote + " ";

  //3. Create the child inside the blockquote
  const cite = document.createElement("cite");
  cite.innerText = author;

  //4. Append the cite to the blockquote
  blockquote.appendChild(cite);
  //5. Append the blockquote to the article
  quoteArticle.appendChild(blockquote);

  //6. Add everything to the quotes list
  const quotesList = document.getElementById("quotes");
  quotesList.appendChild(quoteArticle);

};

const app = function () {
  addQuote("JS is boring so far", "E18");
  for (const quote of QUOTES_ARRAY){
    addQuote(quote.text, quote.author);
  }
};

document.addEventListener("DOMContentLoaded", app);
