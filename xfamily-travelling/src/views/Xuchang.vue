<template>
  <div class="page">
    <h2>Xuchang</h2>
    <div class="video-card">
      <div class="video-player">
        <!-- 使用 YouTube 的嵌入链接 -->
        <iframe 
          width="100%" 
          height="315" 
          src="https://www.youtube.com/embed/GmKTRZYrJIY" 
          title="Night view of Guangzhou" 
          frameborder="0" 
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; picture-in-picture" 
          allowfullscreen>
        </iframe>
      </div>
      <div class="video-info">
        <h3>Title: Xuchang</h3>
        <p><strong>Description:</strong> Xuchang is a prefecture-level city in central Henan province in Central China. It is bordered by the provincial capital of Zhengzhou to the northwest. </p>
        <p><strong>Location:</strong> Xuchang, Henan</p>
        <p class="date"><strong>Date:</strong> 03 May 2023</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'XuchangView'
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