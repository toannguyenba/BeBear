import { createRouter, createWebHistory } from "vue-router";
import Home from '/src/components/user/Home.vue';
import About from '/src/components/user/About.vue';
import Shop from '/src/components/user/Shop.vue';
import Contact from '/src/components/user/Contact.vue';
import ShopSingle from '/src/components/user/Shop-single.vue';

const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        path: '/about',
        name: 'About',
        component: About
    },
    {
        path: '/shop-filter/:idCategory',
        name: 'ShopFilter',
        component: Shop
    },
    {
        path: '/shop',
        name: 'Shop',
        component: Shop
    },
    {
        path: '/contact',
        name: 'Contact',
        component: Contact
    },
    {
        path: '/shop-single/:idProduct',
        name: 'ShopSingle',
        component: ShopSingle
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router;