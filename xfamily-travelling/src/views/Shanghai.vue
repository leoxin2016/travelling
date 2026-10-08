<template>
  <div class="page">
    <h2>Shanghai</h2>
	<div class="video-card">
      <div class="video-player">
        <!-- 使用 YouTube 的嵌入链接 -->
        <iframe 
          width="100%" 
          height="315" 
          src="https://www.youtube.com/embed/RgQ3oIqA7P0" 
          title="Lujiazui" 
          frameborder="0" 
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; picture-in-picture" 
          allowfullscreen>
        </iframe>
      </div>
      <div class="video-info">
        <h3>Title: Lujiazui</h3>
        <p><strong>Description:</strong> Lujiazui is Shanghai's premier financial and trade district, located on the east bank of the Huangpu River in Pudong. </p>
        <p><strong>Location:</strong> Shanghai, Shanghai</p>
        <p class="date"><strong>Date:</strong> 22 Aug 2024</p>
      </div>
    </div>
    <p> </p>
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