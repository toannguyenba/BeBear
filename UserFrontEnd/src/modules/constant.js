const apiRoot = 'http://localhost:8080';

const fetchData = {
    async fetchAPI(link) {
        let results;
        await fetch('http://localhost:8080/product')
        .then(res => res.json())
        .then(json => {
            results = json;
        })

        return results;
    }
}



export default fetchData