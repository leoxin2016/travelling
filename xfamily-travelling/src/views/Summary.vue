<!-- src/views/Summary.vue -->
<template>
  <div class="page">
    <h2>More videos will be released in the future.</h2>
    <p>You can contact me via email.</p>
  </div>
</template>

<script>
// 关键点：把 name 改成 "SummaryView"（多单词），符合规范
export default { name: 'SummaryView' }
</script>

<style scoped>
.page { 
  padding: 20px; 
  min-height: 320px; 
}
</style>