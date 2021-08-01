import { createStore } from 'vuex';

const store = createStore({
    state: {
        productDetail: {
            idProduct: '3',
            idColor: '5',
            idSize: '6'
        }        
    },

    getters: {
        getIdProduct: state => state.productDetail
    },

    mutations: {
        SET_PRODUCT_DETAIL(state, payload){
            state.productDetail.idProduct = payload.idProduct;
            state.productDetail.idColor = payload.idColor;
            state.productDetail.idSize = payload.idSize;

            // state.idProduct = '9';
            // state.idColor = '7';
            // state.idSize = '8';
        }
    },

    actions: {
        save({ commit }, pD) {
            commit('SET_PRODUCT_DETAIL', pD);
        }
    }
    
})

export default store;
