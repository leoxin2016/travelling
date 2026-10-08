<template>
  <div class="page">
    <h2>Relaxing</h2>
    <div class="video-card">
      <div class="video-player">
        <!-- 使用 YouTube 的嵌入链接 -->
        <iframe 
          width="100%" 
          height="315" 
          src="https://www.youtube.com/embed/QHvaRi6pss4" 
          title="Whangarei" 
          frameborder="0" 
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; picture-in-picture" 
          allowfullscreen>
        </iframe>
      </div>
      <div class="video-info">
        <h3>Title: Whangarei</h3>
        <p><strong>Description:</strong> Whangārei is the northernmost city in New Zealand, offering a vibrant mix of striking coastal scenery, arts, and outdoor adventures about two and a half hours north of Auckland. </p>
        <p><strong>Location:</strong> Whangarei, Northland</p>
        <p class="date"><strong>Date:</strong> 09 Jul 2025</p>
      </div>
    </div>
	<div class="video-card">
      <div class="video-player">
        <!-- 使用 YouTube 的嵌入链接 -->
        <iframe 
          width="100%" 
          height="315" 
          src="https://www.youtube.com/embed/fxAyC8_IlZw" 
          title="Taupo" 
          frameborder="0" 
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; picture-in-picture" 
          allowfullscreen>
        </iframe>
      </div>
      <div class="video-info">
        <h3>Title: Taupo</h3>
        <p><strong>Description:</strong> Taupō is a vibrant resort town on the shores of Lake Taupō in the central North Island of New Zealand, famous for its dramatic volcanic landscape, outdoor adventure, and geothermal. </p>
        <p><strong>Location:</strong> Taupo, Waikato</p>
        <p class="date"><strong>Date:</strong> 03 Jul 2026</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'RelaxingView'
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