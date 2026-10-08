<template>
  <div class="page">
    <h2>Hangzhou</h2>
    <div class="video-card">
      <div class="video-player">
        <!-- 使用 YouTube 的嵌入链接 -->
        <iframe 
          width="100%" 
          height="315" 
          src="https://www.youtube.com/embed/9Fms7AMJKkU" 
          title="Qiantang River" 
          frameborder="0" 
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; picture-in-picture" 
          allowfullscreen>
        </iframe>
      </div>
      <div class="video-info">
        <h3>Title: Qiantang River</h3>
        <p><strong>Description:</strong> The Qiantang River, Tsientang River, is a river in East China. An important commercial artery, it runs for 459 kilometers (285 mi) through Zhejiang. Competitions to swim across the Qiantang River are frequently held.</p>
        <p><strong>Location:</strong> Hangzhou, Zhejiang</p>
        <p class="date"><strong>Date:</strong> 29 Aug 2022</p>
      </div>
    </div>
	<div class="video-card">
      <div class="video-player">
        <!-- 使用 YouTube 的嵌入链接 -->
        <iframe 
          width="100%" 
          height="315" 
          src="https://www.youtube.com/embed/okMhYkOAQXQ" 
          title="Qiandao Lake" 
          frameborder="0" 
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; picture-in-picture" 
          allowfullscreen>
        </iframe>
      </div>
      <div class="video-info">
        <h3>Title: Qiandao Lake </h3>
        <p><strong>Description:</strong> Qiandao Lake is a man- made freshwater lake that covers a vast area, including 1,078 forested islands.</p>
        <p><strong>Location:</strong> Hangzhou, Zhejiang</p>
        <p class="date"><strong>Date:</strong> 02 Feb 2025</p>
      </div>
    </div>
	<div class="video-card">
      <div class="video-player">
        <!-- 使用 YouTube 的嵌入链接 -->
        <iframe 
          width="100%" 
          height="315" 
          src="https://www.youtube.com/embed/1t47vBi2S1Q" 
          title="Westlake" 
          frameborder="0" 
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; picture-in-picture" 
          allowfullscreen>
        </iframe>
      </div>
      <div class="video-info">
        <h3>Title: Westlake </h3>
        <p><strong>Description:</strong> Impression West Lake Show in Hangzhou, China</p>
        <p><strong>Location:</strong> Hangzhou, Zhejiang</p>
        <p class="date"><strong>Date:</strong> 11 May 2022</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HangzhouView'
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