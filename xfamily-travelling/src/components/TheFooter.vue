<!-- src/components/TheFooter.vue -->
<template>
  <footer class="footer-container">
    <p>© 2023 X Family Travelling. All rights reserved.</p>
    <p>Contact us: info@xfamily.com</p>
  </footer>
</template>

<script>
export default {
  name: 'TheFooter'
}
</script>

<style scoped>
.footer-container {
  background-color: #55aa00; 
  color: #0c0f50;            
  text-align: center;
  padding: 10px 10px;
  margin-top: 40px;          /* 跟上面的内容拉开一点距离 */
  font-size: 20px;
}

p {
  margin: 5px 0;
}
</style>