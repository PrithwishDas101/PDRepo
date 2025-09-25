// fetch() = function Used for making HTTP requests to fetch resources
//           (JSON style data, images, files)
//           Simplifies asynchronous data fatching in JS and
//           used for interacting with APIs to retrieve amd send 
//           data asynchronously over the web
//           fetch (url, {options})

async function fetchData(){

    try{

        const pokemonName = document.getElementById("pokemonName").value.toLowerCase()

        const response = await fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonName}`);

        if(!response.ok){
            throw new Error("pokemon not found");
        }

        const data = await response.json();
        const pokemonSprite = data.sprites.front_default;
        const imgElement = document.getElementById("pokemonSprite");

        imgElement.src = pokemonSprite;
        imgElement.style.display = "block";
        console.log(data);
    }
    catch(error){
        console.error(error)
    }
}