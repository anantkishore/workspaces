function scrap(){
    
    var urlToScrap = document.getElementById("urlId").value;

    const Http = new XMLHttpRequest();

    const url = "http://localhost:8081/scrape?"+"url="+urlToScrap;
    
    Http.open("GET", url);

    Http.send();

    Http.onreadystatechange=(e)=>{
        console.log(Http.responseText);
    }

}