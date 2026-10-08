<template>
  <div class="page">
    <h2>Xinxiang</h2>
    <div class="video-card">
      <div class="video-player">
        <!-- 使用 YouTube 的嵌入链接 -->
        <iframe 
          width="100%" 
          height="315" 
          src="https://www.youtube.com/embed/1J-QtTl0ANg" 
          title="Xinxiang" 
          frameborder="0" 
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; picture-in-picture" 
          allowfullscreen>
        </iframe>
      </div>
      <div class="video-info">
        <h3>Title: Xinxiang</h3>
        <p><strong>Description:</strong> Xinxiang is a major prefecture-level industrial and historical city located in northern Henan Province, China. </p>
        <p><strong>Location:</strong> Xinxiang, Henan</p>
        <p class="date"><strong>Date:</strong> 23 Apr 2024</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'XinxiangView'
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