const apiRoot = 'http://localhost:8080';

const fetchData = {
    fetchAPI(link) {
        var header = {
            'Access-Control-Allow-Origin' : 'http://localhost:8080',
            'Access-Control-Allow-Methods':'GET,PUT,POST,DELETE,PATCH,OPTIONS',
            'Access-Control-Allow-Credentials': 'true'
        }

        fetch("https://jsonplaceholder.typicode.com/todos/1")
        .then(response => response.json())
        .then(json => console.log(json))
    }
}



export default fetchData