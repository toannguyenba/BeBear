<template>
    <div class="col-md-4">
        <div class="card mb-4 product-wap rounded-0">
            <div class="card rounded-0">
                <img class="card-img rounded-0 img-fluid" :src="product.productdetail[0].productPhotos[0].url">
                <div class="card-img-overlay rounded-0 product-overlay d-flex align-items-center justify-content-center">
                    <ul class="list-unstyled">
                        <li><a class="btn btn-success text-white" href="/shop-single"><i class="far fa-heart"></i></a></li>
                        <li><a class="btn btn-success text-white mt-2" href="/shop-single"><i class="far fa-eye"></i></a></li>
                        <!-- <li><a class="btn btn-success text-white mt-2" href="/shop-single"><i class="fas fa-cart-plus"></i></a></li> -->
                    </ul>
                </div>
            </div>
            <div class="card-body">
                <a :href="'/shop-single/' + product.idProduct" class="h3 text-decoration-none"> {{ product.productName }} </a>
                <ul class="w-100 list-unstyled d-flex justify-content-between mb-0">
                    <li>
                        <span class="tag-color" v-for="color in colors" :key="color"> {{ color.colorName }} </span>
                    </li>
                    <li class="pt-2">
                        <span class="product-color-dot color-dot-red float-left rounded-circle ml-1"></span>
                        <span class="product-color-dot color-dot-blue float-left rounded-circle ml-1"></span>
                        <span class="product-color-dot color-dot-black float-left rounded-circle ml-1"></span>
                        <span class="product-color-dot color-dot-light float-left rounded-circle ml-1"></span>
                        <span class="product-color-dot color-dot-green float-left rounded-circle ml-1"></span>
                    </li>
                </ul>
                <!-- <ul class="list-unstyled d-flex justify-content-center mb-1">
                    <li>
                        <i class="text-warning fa fa-star"></i>
                        <i class="text-warning fa fa-star"></i>
                        <i class="text-warning fa fa-star"></i>
                        <i class="text-warning fa fa-star"></i>
                        <i class="text-warning fa fa-star"></i>
                    </li>
                </ul> -->
                <!-- <p class="text-center mb-0">$250.00</p> -->
                <p class="h3 py-2 money"> {{ price.minSalePrice }}<span class="money-icon">đ</span> - {{ price.maxSalePrice }}<span class="money-icon">đ</span><span class="money-line"> {{ price.maxPrice }}</span><span class="money-line-icon">đ</span></p>
            </div>
        </div>
    </div>
</template>

<script>
import getData from "/src/modules/constant.js"
export default {
    props: {
        product: {
            productdetail: [{productPhotos: [{url: ""}]}]
        }
    },
    async created() {
        this.price = getData.getPrice(this.product);
        this.colors = await getData.fetchData("color?filter=" + this.product.idProduct);
    },
    data() {
        return {
            price: {minSalePrice: 0, maxSalePrice: 0, maxPrice: 0},
            colors: []
        }
    },
}
</script>