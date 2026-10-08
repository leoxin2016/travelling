<template>
  <div class="page">
    <h2>Welcome to X Family Travelling</h2>
    <p>If our whole family had plenty of money, we could realize our shared dream: traveling the world.</p>
    <p>Below are many videos of places we have visited; we can now look back on the footage we shot as a documentary-style record of our travels.</p>
    <div class="card-container">
      <router-link to="/hiking" class="card-link">
        <div class="card">
          <img alt="Hiking" src="@/assets/hiking.png" class="card-img">
          <div class="card-text">hiking</div>
        </div>
      </router-link>
      <router-link to="/swimming" class="card-link">
        <div class="card">
          <img alt="Swimming" src="@/assets/swimming.png" class="card-img">
          <div class="card-text">swimming</div>
		</div>
      </router-link>
      <router-link to="/climbing" class="card-link">
        <div class="card">
          <img alt="Climbing" src="@/assets/climbing.png" class="card-img">
          <div class="card-text">climbing</div>
		</div>
      </router-link>
      <router-link to="/relaxing" class="card-link">
        <div class="card">
          <img alt="Relaxing" src="@/assets/relaxing.png" class="card-img">
          <div class="card-text">relaxing</div>
		</div>
      </router-link>
      <router-link to="/exciting" class="card-link">
        <div class="card">
          <img alt="Exciting" src="@/assets/exciting.png" class="card-img">
          <div class="card-text">exciting</div>
		</div>
      </router-link>
      <router-link to="/challenging" class="card-link">
        <div class="card">
          <img alt="Challenging" src="@/assets/climbing.png" class="card-img">
          <div class="card-text">challenging</div>
		</div>
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HomeView'
}
</script>

<style scoped>
.page {
  padding: 20px;
  min-height: 320px; 
}

.card-container {
  display: flex;
  justify-content: center; 
  margin-top: 40px;
}

.card-link {
  text-decoration: none; /* 去掉链接下划线 */
  color: inherit;
}

.card {
  border: 2px solid #aaffdd;
  width: 200px;
  height: 150px;
  position: relative; /* 为了让文字和图片绝对定位 */
  overflow: hidden;
  transition: transform 0.2s;
  display: flex;
  flex-direction: column;
  justify-content: flex-end; /* 文字靠下 */
}

.card:hover {
  transform: scale(1.05); /* 鼠标悬停放大效果 */
  cursor: pointer;
}

.card-img {
  width: 100%;
  height: 100%;
  object-fit: cover; /* 保证图片填满卡片不变形 */
  position: absolute;
  top: 0;
  left: 0;
  z-index: 1;
}

.card-text {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 2;
  color: #00ff00;
  padding: 5px 10px;
  font-size: 24px;
  text-align: center;
  width: 100%;
  box-sizing: border-box;
}
</style>