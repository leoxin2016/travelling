<template>
  <div class="hello">
    <nav class="navbar">
      <ul class="navbar-menu">
        <li>
          <router-link to="/" class="nav-link">Home</router-link>
        </li>

        <!-- 1. Domestic driving 下拉菜单 -->
        <li class="dropdown">
          <span class="nav-link dropbtn">Domestic driving ▼</span>
          <div class="dropdown-content">
            <!-- 2. 子菜单 -->
            <div class="submenu">
              <span class="nav-link submenu-btn">Jiangsu ▶</span>
              <div class="submenu-content">
                <!-- 3. 最终跳转 -->
                <router-link to="/domesticdriving/nanjing" class="nav-link dropdown-item">Nanjing</router-link>
				<router-link to="/domesticdriving/yangzhou" class="nav-link dropdown-item">Yangzhou</router-link>
				<router-link to="/domesticdriving/xuzhou" class="nav-link dropdown-item">Xuzhou</router-link>
              </div>
            </div>
			<div class="submenu">
              <span class="nav-link submenu-btn">Zhejiang ▶</span>
              <div class="submenu-content">
                <!-- 3. 最终跳转 -->
                <router-link to="/domesticdriving/jiaxing" class="nav-link dropdown-item">Jiaxing</router-link>
				<router-link to="/domesticdriving/hangzhou" class="nav-link dropdown-item">Hangzhou</router-link>
				<router-link to="/domesticdriving/quzhou" class="nav-link dropdown-item">Quzhou</router-link>
              </div>
            </div>
			<div class="submenu">
              <span class="nav-link submenu-btn">Shanghai ▶</span>
              <div class="submenu-content">
                <!-- 3. 最终跳转 -->
                <router-link to="/domesticdriving/shanghai" class="nav-link dropdown-item">Shanghai city</router-link>
              </div>
            </div>
			<div class="submenu">
              <span class="nav-link submenu-btn">Tianjin ▶</span>
              <div class="submenu-content">
                <!-- 3. 最终跳转 -->
                <router-link to="/domesticdriving/tianjin" class="nav-link dropdown-item">Tianjin city</router-link>
              </div>
            </div>
          </div>
        </li>

        <li class="dropdown">
          <span class="nav-link dropbtn">Domestic railway ▼</span>
          <div class="dropdown-content">
            <!-- 2. 子菜单 -->
			<div class="submenu">
              <span class="nav-link submenu-btn">Beijing ▶</span>
              <div class="submenu-content">
                <!-- 3. 最终跳转 -->
                <router-link to="/domesticrailway/beijing" class="nav-link dropdown-item">Beijing city</router-link>
              </div>
            </div>
			<div class="submenu">
              <span class="nav-link submenu-btn">Henan ▶</span>
              <div class="submenu-content">
                <!-- 3. 最终跳转 -->
                <router-link to="/domesticrailway/xinxiang" class="nav-link dropdown-item">Xinxiang</router-link>
				<router-link to="/domesticrailway/zhengzhou" class="nav-link dropdown-item">Zhengzhou</router-link>
				<router-link to="/domesticrailway/xuchang" class="nav-link dropdown-item">Xuchang</router-link>
              </div>
            </div>
			<div class="submenu">
              <span class="nav-link submenu-btn">Guangdong ▶</span>
              <div class="submenu-content">
                <!-- 3. 最终跳转 -->
                <router-link to="/domesticrailway/guangzhou" class="nav-link dropdown-item">Guangzhou</router-link>
				<router-link to="/domesticrailway/foshan" class="nav-link dropdown-item">Foshan</router-link>
              </div>
            </div>
          </div>
        </li>
        <li class="dropdown">
          <span class="nav-link dropbtn">International driving ▼</span>
          <div class="dropdown-content">
            <!-- 2. 子菜单 -->
			<div class="submenu">
              <span class="nav-link submenu-btn">Auckland ▶</span>
              <div class="submenu-content">
                <!-- 3. 最终跳转 -->
                <router-link to="/internationaldriving/auckland" class="nav-link dropdown-item">Auckland city</router-link>
              </div>
            </div>
			<div class="submenu">
              <span class="nav-link submenu-btn">Northland ▶</span>
              <div class="submenu-content">
                <!-- 3. 最终跳转 -->
                <router-link to="/internationaldriving/whangarei" class="nav-link dropdown-item">Whangarei</router-link>
              </div>
            </div>
			<div class="submenu">
              <span class="nav-link submenu-btn">Otago ▶</span>
              <div class="submenu-content">
                <!-- 3. 最终跳转 -->
                <router-link to="/internationaldriving/dunedin" class="nav-link dropdown-item">Dunedin</router-link>
              </div>
            </div>
			<div class="submenu">
              <span class="nav-link submenu-btn">Taupo ▶</span>
              <div class="submenu-content">
                <!-- 3. 最终跳转 -->
                <router-link to="/internationaldriving/taupo" class="nav-link dropdown-item">Taupo</router-link>
              </div>
            </div>
          </div>
        </li>
        <li>
          <router-link to="/summary" class="nav-link">Summary</router-link>
        </li>
      </ul>
    </nav>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<style scoped>
/* =========================================
   基础导航栏样式
   ========================================= */
ul {
  list-style-type: none;
  background-color: #229966;
  margin: 0;
  font-size: 20px;
  padding: 5px;
  /* 关键：允许下拉菜单溢出显示 */
  overflow: visible;
}

li {
  display: inline-block;
  margin: 0 60px;
  /* 关键：为下拉菜单提供定位基准 */
  position: relative;
}

/* 统一所有导航文字（链接和按钮）为黄色 */
.nav-link,
.dropbtn,
.submenu-btn,
.dropdown-item {
  color: #ffff00;
  text-decoration: none;
  cursor: pointer;
  display: inline-block;
}

.nav-link:hover,
.dropbtn:hover,
.submenu-btn:hover,
.dropdown-item:hover {
  color: #ffddff;
}

h1 {
  display: inline-block;
  margin: 0;
  padding: 10px 20px;
  font-size: 40px;
}

/* =========================================
   下拉菜单样式
   ========================================= */

/* 一级下拉容器 (Domestic driving 下面那一块) */
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #bbbbbb;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
  /* 确保浮在最上层 */
  z-index: 1000;
  top: 100%;
  left: 50%;
  transform: translateX(-50%);
  padding: 5px 0;
}

/* 二级菜单容器 (Jiangsu) */
.submenu {
  position: relative;
  width: 100%;
}

.submenu-btn {
  padding: 10px 16px;
  display: block;
  width: 100%;
  text-align: center;
  white-space: nowrap;
  box-sizing: border-box;
}

/* 三级菜单容器 (Nanjing) */
.submenu-content {
  display: none;
  position: absolute;
  left: 100%; /* 向右展开 */
  top: 0;
  background-color: #bbbbbb;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
  z-index: 1001;
}

.dropdown-item {
  padding: 10px 16px;
  display: block;
  white-space: nowrap;
  text-align: center;
}


/* =========================================
   交互逻辑 (鼠标悬停显示)
   ========================================= */
.dropdown:hover .dropdown-content {
  display: block;
}

.submenu:hover .submenu-content {
  display: block;
}
</style>