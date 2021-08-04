const apiRoot = 'http://localhost:8080/';

const getData = {
    async fetchData(link) {
        let results;
        await fetch(apiRoot+ link)
        .then(res => res.json())
        .then(json => {
            results = json;
        })

        return results;
    }
}



export default getData