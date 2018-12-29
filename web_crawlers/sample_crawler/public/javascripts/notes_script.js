function getNoteDetails()
{
    var noteId = document.getElementById("card").value;

    const Http = new XMLHttpRequest();

    const url = "http://localhost:8081/notes?"+"noteId="+noteId;
    
    Http.open("GET", url);

    Http.send();

    Http.onreadystatechange=(e)=>{
        console.log(Http.responseText);
    }

}