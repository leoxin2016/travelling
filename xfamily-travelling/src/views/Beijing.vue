<template>
  <div class="page">
    <h2>Beijing</h2>
    <div class="video-card">
      <div class="video-player">
        <!-- 使用 YouTube 的嵌入链接 -->
        <iframe 
          width="100%" 
          height="315" 
          src="https://www.youtube.com/embed/GtZs8YxPfQI" 
          title="Wangfujing" 
          frameborder="0" 
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; picture-in-picture" 
          allowfullscreen>
        </iframe>
      </div>
      <div class="video-info">
        <h3>Title: Wangfujing</h3>
        <p><strong>Description:</strong> Crazy Food Tour In Beijing’s Wangfujing Shopping Street + Historic Dashilan. </p>
        <p><strong>Location:</strong> Beijing, Beijing</p>
        <p class="date"><strong>Date:</strong> 29 Aug 2023</p>
      </div>
    </div>
	<div class="video-card">
      <div class="video-player">
        <!-- 使用 YouTube 的嵌入链接 -->
        <iframe 
          width="100%" 
          height="315" 
          src="https://www.youtube.com/embed/zJNxAORIb1w" 
          title="Food" 
          frameborder="0" 
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; picture-in-picture" 
          allowfullscreen>
        </iframe>
      </div>
      <div class="video-info">
        <h3>Title: Food in Beijing </h3>
        <p><strong>Description:</strong> Where to eat street food in Beijing. A Beijing food Vlog.</p>
        <p><strong>Location:</strong> Beijing, Beijing</p>
        <p class="date"><strong>Date:</strong> 09 Feb 2025</p>
      </div>
    </div>
	<div class="video-card">
      <div class="video-player">
        <!-- 使用 YouTube 的嵌入链接 -->
        <iframe 
          width="100%" 
          height="315" 
          src="https://www.youtube.com/embed/iMnmscnr404" 
          title="Tiananmen" 
          frameborder="0" 
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; picture-in-picture" 
          allowfullscreen>
        </iframe>
      </div>
      <div class="video-info">
        <h3>Title: Tiananmen Square </h3>
        <p><strong>Description:</strong> The square holds the Monument to the People's Heroes, the Great Hall of the People, the National Museum of China, and the Chairman Mao Memorial Hall. They were inscribed in the UNESCO World Heritage Sites in 2024 as a part of the Beijing Central Axis.</p>
        <p><strong>Location:</strong> Beijing, Beijing</p>
        <p class="date"><strong>Date:</strong> 11 May 2022</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'BeijingView'
}
</script>

<style scoped>
.page { padding: 20px; min-height: 320px; }
.video-card { display: flex; border: 2px solid #333; padding: 20px; margin-top: 20px; gap: 30px; background-color: #aadd00; }
.video-player { flex: 1; max-width: 500px; }
.video-info { flex: 2; text-align: left; display: flex; flex-direction: column; justify-content: space-between; }
.video-info h3 { margin-top: 0; color: #000000; }
.video-info p { color: #000000; margin: 5px 0; }
.date { text-align: right; border-bottom: 1px dashed #333; padding-bottom: 5px; display: inline-block; align-self: flex-end; }
</style>