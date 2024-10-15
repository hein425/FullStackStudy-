import './assets/main.css'

// import {aa} from './AA';
import { createApp } from 'vue'
import { createPinia } from 'pinia'
import App from './App.vue'

import VueSweetalert2 from 'vue-sweetalert2';
import 'sweetalert2/dist/sweetalert2.min.css';

// import TheHome from './views/TheHome.vue'
import router from './router/index.js'



// aa();

const app = createApp(App);
const piniaStore = createPinia();

app.use(VueSweetalert2);
app.use(router);
app.use(piniaStore);
app.mount('#QWER');
