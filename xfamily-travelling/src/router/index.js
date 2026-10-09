import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import DomesticDriving from '../views/DomesticDriving.vue'
import DomesticRailway from '../views/DomesticRailway.vue'
import InternationalDriving from '../views/InternationalDriving.vue'
import Summary from '../views/Summary.vue'
import Hiking from '../views/Hiking.vue'
import Swimming from '../views/Swimming.vue'
import Challenging from '../views/Challenging.vue'
import Climbing from '../views/Climbing.vue'
import Relaxing from '../views/Relaxing.vue'
import Exciting from '../views/Exciting.vue'
import Hangzhou from '../views/Hangzhou.vue'
import Beijing from '../views/Beijing.vue'
import Guangzhou from '../views/Guangzhou.vue'
import Xuzhou from '../views/Xuzhou.vue'
import Quzhou from '../views/Quzhou.vue'
import Zhengzhou from '../views/Zhengzhou.vue'
import Xuchang from '../views/Xuchang.vue'
import Jiaxing from '../views/Jiaxing.vue'
import Shanghai from '../views/Shanghai.vue'
import Foshan from '../views/Foshan.vue'
import Whangarei from '../views/Whangarei.vue'
import Auckland from '../views/Auckland.vue'
import Dunedin from '../views/Dunedin.vue'
import Taupo from '../views/Taupo.vue'
import Nanjing from '../views/Nanjing.vue'
import Xinxiang from '../views/Xinxiang.vue'
import Yangzhou from '../views/Yangzhou.vue'
import Tianjin from '../views/Tianjin.vue'

const routes = [
  { path: '/', name: 'Home', component: HomeView },
  { path: '/domestic-driving', name: 'DomesticDriving', component: DomesticDriving },
  { path: '/domestic-railway', name: 'DomesticRailway', component: DomesticRailway },
  { path: '/international-driving', name: 'InternationalDriving', component: InternationalDriving },
  { path: '/summary', name: 'Summary', component: Summary },
  { path: '/hiking', name: 'Hiking', component: Hiking },
  { path: '/swimming', name: 'Swimming', component: Swimming },
  { path: '/challenging', name: 'Challenging', component: Challenging },
  { path: '/climbing', name: 'Climbing', component: Climbing },
  { path: '/relaxing', name: 'Relaxing', component: Relaxing },
  { path: '/exciting', name: 'Exciting', component: Exciting },
  { path: '/domesticdriving/hangzhou', name: 'Hangzhou', component: Hangzhou },
  { path: '/domesticrailway/beijing', name: 'Beijing', component: Beijing },
  { path: '/domesticrailway/guangzhou', name: 'Guangzhou', component: Guangzhou },
  { path: '/domesticdriving/xuzhou', name: 'Xuzhou', component: Xuzhou },
  { path: '/domesticdriving/quzhou', name: 'Quzhou', component: Quzhou },
  { path: '/domesticrailway/zhengzhou', name: 'Zhengzhou', component: Zhengzhou },
  { path: '/domesticrailway/xuchang', name: 'Xuchang', component: Xuchang },
  { path: '/domesticdriving/jiaxing', name: 'Jiaxing', component: Jiaxing },
  { path: '/domesticdriving/shanghai', name: 'Shanghai', component: Shanghai },
  { path: '/domesticrailway/foshan', name: 'Foshan', component: Foshan },
  { path: '/internationaldriving/whangarei', name: 'Whangarei', component: Whangarei },
  { path: '/internationaldriving/auckland', name: 'Auckland', component: Auckland },
  { path: '/internationaldriving/dunedin', name: 'Dunedin', component: Dunedin },
  { path: '/internationaldriving/taupo', name: 'Taupo', component: Taupo },
  { path: '/domesticdriving/nanjing', name: 'Nanjing', component: Nanjing },
  { path: '/domesticrailway/xinxiang', name: 'Xinxiang', component: Xinxiang },
  { path: '/domesticdriving/yangzhou', name: 'Yangzhou', component: Yangzhou },
  { path: '/domesticdriving/tianjin', name: 'Tianjin', component: Tianjin }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router

/*
router.beforeEach(async (to, from, next) => {
  const requiresAuth = to.matched.some(record => record.meta.requiresAuth)
  // const savedUser = localStorage.getItem('user')

  if (requiresAuth) {
    try {
      // 向后端验证当前用户登录状态
      const res = await axios.get('/api/user/me', { withCredentials: true })
      // 登录成功，保存用户信息
      localStorage.setItem('user', JSON.stringify(res.data))
      next()
    } catch (error) {
      // 未登录或验证失败，清除本地缓存并重定向到首页（或登录页）
      localStorage.removeItem('user')
      next('/')
    }
  } else {
    // 不需要登录的页面直接放行
    next()
  }
})
*/

