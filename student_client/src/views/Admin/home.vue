<template>
  <div>
    <el-container>
      <el-main>
        <h1>admin home</h1>
        <el-card style="width: 40%">
          <p><i class="el-icon-arrow-right" style="margin-right: 18px"></i>个人信息</p>
          <p><i class="el-icon-s-custom" style="margin-right: 18px"></i>姓名：管理员</p>
          <p><i class="el-icon-location-outline" style="margin-right: 18px"></i>金陵科技学院</p>
          <p><i class="el-icon-message" style="margin-right: 18px"></i>邮箱: 6666666666@163.com</p>
          <p><i class="el-icon-chat-round" style="margin-right: 18px;"></i>电话: 11111111111</p>
        </el-card>
        <logout></logout>
      </el-main>
    </el-container>
  </div>
</template>

<script>
import Logout from "@/components/logout";
export default {
  name: "home",
  components: {Logout},
}
</script>

<style scoped>

</style>