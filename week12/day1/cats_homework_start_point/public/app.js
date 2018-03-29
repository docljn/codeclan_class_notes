const CATS_ARRAY = [
  { name: "Boba",
    food: "Sock Fluff",
    image: "http://66.media.tumblr.com/d1f01bbe0150fda0c40d2151c5eaeac8/tumblr_odlqqskjj61v9cejwo1_400.jpg",
    image_width: "400"
  },

  { name: "Barnaby",
    food: "Tuna",
    image: "https://68.media.tumblr.com/88d0fcf2b84a7b098dda839130597569/tumblr_okuo4teiql1uhevdso1_1280.jpg",
    image_width: "400"
  },

  { name: "Max",
    food: "Whiskas Temptations",
    image: "http://66.media.tumblr.com/7c5784ea89369c780e782bf10c60315a/tumblr_npb0hlYwhV1u63jaco1_1280.jpg",
    image_width: "400"
  },

  { name: "Twitch",
    food: "Small furry things",
    image: "https://media.giphy.com/media/13CoXDiaCcCoyk/giphy.gif",
    image_width: "400"  
  }
];

const addCat = function (cat) {
  const cats_section = document.getElementById("cats");

  const cat_ul = document.createElement("ul");
  cat_ul.classList.add("cat");

  const cat_li_name = document.createElement("li");
  cat_li_name.classList.add("name");
  cat_li_name.innerText = "Name: " +cat.name;

  const cat_li_food = document.createElement("li");
  cat_li_name.classList.add("food");
  cat_li_food.innerText = "Favourite food: " +cat.food;

  const cat_li_img = document.createElement("li");

  const cat_img = document.createElement("img");
  cat_img.src = cat.image;
  cat_img.setAttribute("width", cat.image_width);
  cat_img.setAttribute("alt", "A picture of " + cat.name);

  cat_li_img.appendChild(cat_img);

  cat_ul.appendChild(cat_li_name);
  cat_ul.appendChild(cat_li_food);
  cat_ul.appendChild(cat_li_img);

  cats_section.appendChild(cat_ul);
};

const app = function () {
  for (const cat of CATS_ARRAY){
    addCat(cat);
  }
};

window.addEventListener("DOMContentLoaded", app);
