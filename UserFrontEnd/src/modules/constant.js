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
    },

    getPrice (product) {
        let minSalePrice = product.productdetail[0].salePrice;
        let maxSalePrice = product.productdetail[0].price;
        let maxPrice = product.productdetail[0].salePrice;
        
        product.productdetail.forEach(element => {
            if (minSalePrice > element.salePrice) {
                minSalePrice = element.salePrice
            }

            if (maxSalePrice < element.salePrice) {
                maxSalePrice = element.salePrice
            }

            if (maxPrice < element.price) {
                maxPrice = element.price
            }
        });

        var price = {minSalePrice: minSalePrice, maxSalePrice: maxSalePrice, maxPrice: maxPrice}

        return price;
    }
}



export default getData